package com.jetbrains;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameSetup {

    private WindowCreation frameConfig = new WindowCreation();
    private Rooms makeRoom = new Rooms();
    private LabelCreation makeLabel = new LabelCreation();
    private ItemConfig itemCheck = new ItemConfig();
    private Hunger hungerCheck = new Hunger();

    GameSetup() {
        new WindowCreation();
        bedroom();
        frameConfig.visibility();
    }

    void bedroom() {
        frameConfig.addPanel(makeRoom.roomSetup());

        makeRoom.addLabel(makeLabel.roomDesc("Your bedroom, nothing more, nothing less. Inside is a key that you use to enter and leave."));
        makeRoom.addHunger();
        makeRoom.addTextArea(makeLabel.typeAction());
        makeLabel.typeAction().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();

                if(key == KeyEvent.VK_ENTER) {
                    makeRoom.addHunger();
                    frameConfig.loseScenario();
                    if(makeLabel.getText().equalsIgnoreCase("leave bedroom")) {
                        if(!itemCheck.checkPlayersItems("key")) {
                            makeLabel.changeRoomDesc("You need the key before you can exit!");
                        }
                        else {
                            frameConfig.removePanel(makeRoom.roomSetup());
                            hallway();
                        }
                    }
                    if(makeLabel.getText().equalsIgnoreCase("get key")) {
                        if(!itemCheck.checkPlayersItems("key")) {
                            itemCheck.addPlayerItem("key");
                            makeLabel.changeRoomDesc("You got your key!");
                        }
                        else {
                            makeLabel.changeRoomDesc("You already have your key!");
                        }
                    }
                }
            }
        });
    }

    void hallway() {
        frameConfig.addPanel(makeRoom.roomSetup());

        makeRoom.addLabel(makeLabel.roomDesc("The hallway you use to get to different rooms: Kitchen, Supply Room, Work Room."));
        makeRoom.addHunger();
        makeRoom.addTextArea(makeLabel.typeAction());
        makeLabel.typeAction().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();

                if(key == KeyEvent.VK_ENTER) {
                    makeRoom.addHunger();
                    frameConfig.loseScenario();
                    if(makeLabel.getText().equalsIgnoreCase("enter bedroom")) {
                        frameConfig.removePanel(makeRoom.roomSetup());
                        bedroom();
                    }
                    if(makeLabel.getText().equalsIgnoreCase("enter kitchen")) {
                        frameConfig.removePanel(makeRoom.roomSetup());
                        kitchen();
                    }
                    if(makeLabel.getText().equalsIgnoreCase("enter supply room")) {
                        frameConfig.removePanel(makeRoom.roomSetup());
                        supplyRoom();
                    }
                    if(makeLabel.getText().equalsIgnoreCase("enter work room")) {
                        frameConfig.removePanel(makeRoom.roomSetup());
                        workRoom();
                    }
                }
            }
        });
    }

    void kitchen() {
        frameConfig.addPanel(makeRoom.roomSetup());

        makeRoom.addLabel(makeLabel.roomDesc("Only for sweets, you love your kitchen. You could really bake some cookies."));
        makeRoom.addHunger();
        makeRoom.addTextArea(makeLabel.typeAction());
        makeLabel.typeAction().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();

                if(key == KeyEvent.VK_ENTER) {
                    makeRoom.addHunger();
                    frameConfig.loseScenario();
                    if(makeLabel.getText().equalsIgnoreCase("leave kitchen")) {
                        frameConfig.removePanel(makeRoom.roomSetup());
                        hallway();
                    }
                    if(makeLabel.getText().equalsIgnoreCase("bake cookies")) {
                        if(!itemCheck.checkPlayersItems("ingredients") || !itemCheck.checkPlayersItems("recipe")) {
                            makeLabel.changeRoomDesc("You are forgetting something...");
                        }
                        else {
                            frameConfig.winScenario();
                        }
                    }
                }
            }
        });
    }

    void supplyRoom() {
        frameConfig.addPanel(makeRoom.roomSetup());

        makeRoom.addLabel(makeLabel.roomDesc("Filled with many ingredients, your lovely supply room! You see cookie ingredients on the shelves."));
        makeRoom.addHunger();
        makeRoom.addTextArea(makeLabel.typeAction());
        makeLabel.typeAction().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();

                if(key == KeyEvent.VK_ENTER) {
                    makeRoom.addHunger();
                    frameConfig.loseScenario();
                    if(makeLabel.getText().equalsIgnoreCase("leave supply room")) {
                        frameConfig.removePanel(makeRoom.roomSetup());
                        hallway();
                    }
                    if(makeLabel.getText().equalsIgnoreCase("get ingredients")) {
                        if(itemCheck.checkPlayersItems("ingredients")) {
                            makeLabel.changeRoomDesc("You already have the ingredients!");
                        }
                        else {
                            itemCheck.addPlayerItem("ingredients");
                            makeLabel.changeRoomDesc("You got the ingredients!");
                        }
                    }
                }
            }
        });
    }

    void workRoom() {
        frameConfig.addPanel(makeRoom.roomSetup());

        makeRoom.addLabel(makeLabel.roomDesc("Documents regarding previous meetings, the work room is quite a mess. A recipe is on the desk."));
        makeRoom.addHunger();
        makeRoom.addTextArea(makeLabel.typeAction());
        makeLabel.typeAction().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();

                if(key == KeyEvent.VK_ENTER) {
                    makeRoom.addHunger();
                    frameConfig.loseScenario();
                    if(makeLabel.getText().equalsIgnoreCase("leave work room")) {
                        frameConfig.removePanel(makeRoom.roomSetup());
                        hallway();
                    }
                    if(makeLabel.getText().equalsIgnoreCase("get recipe")) {
                        if(itemCheck.checkPlayersItems("recipe")) {
                            makeLabel.changeRoomDesc("You already have the recipe!");
                        }
                        else {
                            itemCheck.addPlayerItem("recipe");
                            makeLabel.changeRoomDesc("You got the recipe!");
                        }
                    }
                }
            }
        });
    }

}
