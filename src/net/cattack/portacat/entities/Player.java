package net.cattack.portacat.entities;

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

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMaxHealth() {
        return 100;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public ArrayList<Item> getInventory() {
        return inventory;
    }
}
