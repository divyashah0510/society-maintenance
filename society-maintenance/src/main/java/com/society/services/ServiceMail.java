package com.society.services;

import com.society.models.ModelMessage;
import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.util.Properties;

public class ServiceMail {

    public ModelMessage sendMain(String toEmail, String code) {
        ModelMessage ms = new ModelMessage(false, "");
        String from = "delmarduston@gmail.com";
        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");

        String username = "delmarduston@gmail.com";
        String password = "arjmjnntjtadcqsa";  // Your email password here 

        Session session = Session.getInstance(prop, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject("Verify Code");
            message.setText("Your verification code is: " + code);
            Transport.send(message);
            ms.setSuccess(true);
        } catch (MessagingException e) {
            if (e.getMessage().contains("Invalid Addresses")) {
                ms.setMessage("Invalid email");
            } else {
                ms.setMessage("Error sending email: " + e.getMessage());
            }
        }
        return ms;
    }
}
