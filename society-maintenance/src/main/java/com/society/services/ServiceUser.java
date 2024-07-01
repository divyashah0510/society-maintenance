package com.society.services;

import com.society.connection.DatabaseConnection;
import com.society.models.ModelLogin;
import com.society.models.ModelUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Random;

public class ServiceUser {

    private final Connection con;

    public ServiceUser() {
        con = DatabaseConnection.getInstance().getConnection();
    }

    public ModelUser login(ModelLogin login) throws SQLException {
        ModelUser data = null;
        String query = "SELECT UserID, UserName, Email FROM `user` WHERE BINARY(Email)=? AND BINARY(`Password`)=? AND `Status`='Verified' LIMIT 1";
        try (PreparedStatement p = con.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
            p.setString(1, login.getEmail());
            p.setString(2, login.getPassword());
            try (ResultSet r = p.executeQuery()) {
                if (r.first()) {
                    int userID = r.getInt(1);
                    String userName = r.getString(2);
                    String email = r.getString(3);
                    data = new ModelUser(userID, userName, email, "");
                }
            }
        }
        return data;
    }

    public void insertUser(ModelUser user) throws SQLException {
        String query = "INSERT INTO `user` (UserName, Email, `Password`, VerifyCode) VALUES (?,?,?,?)";
        try (PreparedStatement p = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            String code = generateVerifyCode();
            p.setString(1, user.getUserName());
            p.setString(2, user.getEmail());
            p.setString(3, user.getPassword());
            p.setString(4, code);
            p.executeUpdate();
            try (ResultSet r = p.getGeneratedKeys()) {
                if (r.next()) {
                    int userID = r.getInt(1);
                    user.setUserID(userID);
                    user.setVerifyCode(code);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error is " + e);
        }
    }

    private String generateVerifyCode() throws SQLException {
        DecimalFormat df = new DecimalFormat("000000");
        Random ran = new Random();
        String code = df.format(ran.nextInt(1000000));  //  Random from 0 to 999999
        while (checkDuplicateCode(code)) {
            code = df.format(ran.nextInt(1000000));
        }
        return code;
    }

    private boolean checkDuplicateCode(String code) throws SQLException {
        boolean duplicate = false;
        String query = "SELECT UserID FROM `user` WHERE VerifyCode=? LIMIT 1";
        try (PreparedStatement p = con.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
            p.setString(1, code);
            try (ResultSet r = p.executeQuery()) {
                if (r.first()) {
                    duplicate = true;
                }
            }
        }
        return duplicate;
    }

    public boolean checkDuplicateUser(String user) throws SQLException {
        boolean duplicate = false;
        String query = "SELECT UserID FROM `user` WHERE UserName=? AND `Status`='Verified' LIMIT 1";
        try (PreparedStatement p = con.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
            p.setString(1, user);
            try (ResultSet r = p.executeQuery()) {
                if (r.first()) {
                    duplicate = true;
                }
            }
        }
        return duplicate;
    }

    public boolean checkDuplicateEmail(String user) throws SQLException {
        boolean duplicate = false;
        String query = "SELECT UserID FROM `user` WHERE Email=? AND `Status`='Verified' LIMIT 1";
        try (PreparedStatement p = con.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
            p.setString(1, user);
            try (ResultSet r = p.executeQuery()) {
                if (r.first()) {
                    duplicate = true;
                }
            }
        }
        return duplicate;
    }

    public void doneVerify(int userID) throws SQLException {
        String query = "UPDATE `user` SET VerifyCode='', `Status`='Verified' WHERE UserID=? LIMIT 1";
        try (PreparedStatement p = con.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
            p.setInt(1, userID);
            p.executeUpdate();
        }
    }

    public boolean verifyCodeWithUser(int userID, String code) throws SQLException {
        boolean verify = false;
        String query = "SELECT UserID FROM `user` WHERE UserID=? AND VerifyCode=? LIMIT 1";
        try (PreparedStatement p = con.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
            p.setInt(1, userID);
            p.setString(2, code);
            try (ResultSet r = p.executeQuery()) {
                if (r.first()) {
                    verify = true;
                }
            }
        }
        return verify;
    }

    public void insertBill(String billNumber, String billDate, String userName, String flatNumber, String dueDate) throws SQLException {
        String query = "INSERT INTO member_details (bill_id, bill_date, userName, flat_number, due_date) VALUES (?, ?, ?, ?, ?)";
        System.out.println("Query is " + query);
        try (PreparedStatement p = con.prepareStatement(query)) {
            p.setString(1, billNumber);
            p.setString(2, billDate);
            p.setString(3, userName);
            p.setString(4, flatNumber);
            p.setString(5, dueDate);
            System.out.println("Added");
            p.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error in query " + e);
        }
    }

}
