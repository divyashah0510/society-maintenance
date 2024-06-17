package com.society.components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

public class Background extends JPanel {

    public Background() {
        init();
    }

    private void init() {
        setOpaque(false);
        setBackground(new Color(245, 245, 245));
        setForeground(new Color(118, 118, 118));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int x = 0;
        int y = 40;
        int width = getWidth();
        int height = getHeight();
        int arcWidth = 30;
        int arcHeight = 30;
        
        // Create a rectangle with rounded bottom corners
        RoundRectangle2D roundedRect = new RoundRectangle2D.Double(x, y, width, height - y, arcWidth, arcHeight);

        // Create the shape for the cut-out for the icon at the top
        int iconSpace = 7;
        int totalIconSpace = iconSpace * 2;
        int iconSize = y * 2;
        int iconX = (width - (iconSize + totalIconSpace)) / 2;
        int iconY = 0;
        Area cutout = new Area(new Ellipse2D.Double(iconX, iconY - iconSpace, iconSize + totalIconSpace, iconSize + totalIconSpace));
        cutout.add(new Area(new Ellipse2D.Double(iconX + iconSpace, 0, iconSize, iconSize)));
        
        // Subtract the cut-out area from the rounded rectangle
        Area area = new Area(roundedRect);
        area.subtract(cutout);

        // Fill the final area with the background color
        g2.setColor(getBackground());
        g2.fill(area);
        g2.dispose();
        super.paintComponent(g);
    }
}
