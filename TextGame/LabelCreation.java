package com.jetbrains;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LabelCreation {

    private Fonts getFont = new Fonts();
    private Hunger hungerCheck = new Hunger();

    private JLabel descriptionBox = new JLabel();
    private JLabel hungerBar = new JLabel();
    private JTextArea typeAction = new JTextArea();

    JLabel hungerMeter() {
        hungerBar.setFont(getFont.timesMainFont());
        hungerBar.setHorizontalAlignment(SwingConstants.CENTER);
        hungerBar.setVerticalAlignment(SwingConstants.CENTER);
        hungerBar.setText("Hunger: " + Integer.toString(hungerCheck.hungerMeter()));

        return hungerBar;
    }

    JLabel roomDesc(String description) {
        descriptionBox.setFont(getFont.timesMainFont());
        descriptionBox.setText(description);
        descriptionBox.setHorizontalAlignment(SwingConstants.CENTER);
        descriptionBox.setVerticalAlignment(SwingConstants.CENTER);

        return descriptionBox;
    }

    void changeRoomDesc(String description) {
        descriptionBox.setText(description);
    }

    JTextArea typeAction() {
        typeAction.setFont(getFont.timesSubFont());
        typeAction.setLineWrap(true);
        typeAction.setText("Format: Action + Noun - When done press \"ENTER\" \n (also delete this whole thing :D)");

        return typeAction;
    }

    String getText() {
        return typeAction.getText();
    }
}
