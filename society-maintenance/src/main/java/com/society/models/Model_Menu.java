package com.society.models;

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
        ClassLoader classLoader = getClass().getClassLoader();
        java.net.URL iconURL = classLoader.getResource("com/society/icon/" + icon + ".png");
        System.out.println("Loading resource: " + iconURL);
        if (iconURL != null) {
            return new ImageIcon(iconURL);
        } else {
            System.err.println("Resource not found: com/society/icon/" + icon + ".png");
            return null;
        }
    }

    public static enum MenuType {
        TITLE, MENU, EMPTY
    }
}
