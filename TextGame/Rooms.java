package com.jetbrains;

import javax.swing.*;
import java.awt.*;

public class Rooms {

    private LabelCreation getHunger = new LabelCreation();
    private Fonts getFont = new Fonts();

    private JPanel room = new JPanel();

    JPanel roomSetup() {
        room.setLayout(new BorderLayout());

        return room;
    }

    JPanel winPanel() {
        JLabel winLabel = new JLabel("YOU WIN!");
        winLabel.setFont(getFont.winFont());
        winLabel.setVerticalAlignment(SwingConstants.CENTER);
        winLabel.setHorizontalAlignment(SwingConstants.CENTER);
        room.add(winLabel);

        return room;
    }

    JPanel losePanel() {
        JLabel loseLabel = new JLabel("YOU LOST!");
        loseLabel.setFont(getFont.loseFont());
        loseLabel.setVerticalAlignment(SwingConstants.CENTER);
        loseLabel.setHorizontalAlignment(SwingConstants.CENTER);
        room.add(loseLabel);

        return room;
    }

    void addLabel(JLabel label) {
        room.add(label, BorderLayout.PAGE_START);
    }

    void addHunger() {
        room.add(getHunger.hungerMeter(), BorderLayout.LINE_START);
    }

    void addTextArea(JTextArea textArea) {
        room.add(textArea, BorderLayout.CENTER);
    }

}
