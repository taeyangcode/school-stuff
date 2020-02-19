package com.jetbrains;

import java.util.*;

public class ItemConfig {

    private ArrayList<String> playerItems = new ArrayList<>();

    void addPlayerItem(String itemName) {
        playerItems.add(itemName);
    }

    boolean checkPlayersItems(String itemName) {
        if(playerItems.contains(itemName)) {
            return true;
        }
        else {
            return false;
        }
    }

}
