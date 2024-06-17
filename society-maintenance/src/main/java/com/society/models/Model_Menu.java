package com.society.models;

import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Model_Menu {

    private String icon;
    private String name;
    private MenuType type;

    public Model_Menu(String icon, String name, MenuType type) {
        this.icon = icon;
        this.name = name;
        this.type = type;
    }

    public Model_Menu() {
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuType getType() {
        return type;
    }

    public void setType(MenuType type) {
        this.type = type;
    }

    public Icon toIcon() {
        URL iconURL = getClass().getResource("/com/society/icons/" + icon + ".png");
        System.out.println("Loading resource: " + iconURL);
        if (iconURL != null) {
            return new ImageIcon(iconURL);
        } else {
            System.err.println("Resource not found: /com/society/icons/" + icon + ".png");
            return null;
        }
    }

    public static enum MenuType {
        TITLE, MENU, EMPTY
    }
}
