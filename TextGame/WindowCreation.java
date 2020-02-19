package com.jetbrains;

import javax.swing.*;
import java.awt.*;

public class WindowCreation {

    private Hunger getHunger = new Hunger();
    private Rooms getRoom = new Rooms();

    private JFrame gameWindow = new JFrame();

    private int screenWidth, screenHeight;

    WindowCreation() {
        getScreensize();
        windowSetup();
    }

    JFrame windowSetup() {
        gameWindow.setSize(screenWidth, screenHeight);
        gameWindow.setResizable(false);
        gameWindow.setLocationRelativeTo(null);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setTitle("I kind of want to eat a cookie");

        return gameWindow;
    }

    void getScreensize() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        screenWidth = (int) screenSize.getWidth();
        screenHeight = (int) screenSize.getHeight();
    }

    void loseScenario() {
        if(getHunger.hungerMeter() >= 100) {
            addPanel(getRoom.losePanel());
        }
    }

    void winScenario() {
        removePanel(getRoom.roomSetup());
        addPanel(getRoom.winPanel());
    }

    void addPanel(JPanel panel) {
        gameWindow.add(panel);
    }

    void removePanel(JPanel panel) {
        gameWindow.remove(panel);
    }

    void visibility() {
        gameWindow.setVisible(true);
    }

}
