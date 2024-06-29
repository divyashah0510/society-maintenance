package com.society.swing;

import com.society.models.StatusType;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

public class TableStatus extends JLabel {

    private StatusType type;

    public TableStatus() {
        setForeground(Color.WHITE);
        setBorder(new EmptyBorder(5, 0, 5, 0));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    public StatusType getType() {
        return type;
    }

    public void setType(StatusType type) {
        this.type = type;
        setText(type != null ? type.toString() : "Unknown");
        repaint();
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        if (type != null) {
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            GradientPaint g;
            if (null == type) {
                g = new GradientPaint(0, 0, new Color(241, 208, 62), 0, getHeight(), new Color(211, 184, 61));
            } else {
                switch (type) {
                    case PENDING:
                        g = new GradientPaint(0, 0, new Color(241, 208, 62), 0, getHeight(), new Color(211, 184, 61));
                        break;
                    case APPROVED:
                        g = new GradientPaint(0, 0, new Color(35, 166, 97), 0, getHeight(), new Color(22, 116, 66));
                        break;
                    default:
                        g = new GradientPaint(0, 0, Color.decode("#d90429"), 0, getHeight(), Color.decode("#ef233c"));
                        break;
                }
            }
            g2.setPaint(g);
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20); // Adjust the arc width and height here
        }
        super.paintComponent(grphcs);
    }
}
