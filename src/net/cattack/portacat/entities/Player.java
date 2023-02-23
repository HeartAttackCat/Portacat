package net.catattack.portacat.entities;

import java.util.ArrayList;

import net.cattack.portacat.items.Item;
import net.cattack.portacat.entities.Entity;

public class Player implements Entity {
    private String name;
    private int health;

    private ArrayList<Item> inventory;

    public Player(String name) {
        this.name = name;
        this.health = getMaxHealth();
        this.inventory = new ArrayList<Item>();
    }

    public String getName() {
        return name;
    }

    public int getMaxHealth() {
        return 100;
    }

    public int getHealth() {
        return health;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }
}
