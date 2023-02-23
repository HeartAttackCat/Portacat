package net.cattack.portacat.entities;

import java.util.ArrayList;

import net.cattack.portacat.items.Item;

public interface Entity {
    public String getName();

    public int getMaxHealth();
    public int getHealth();

    public ArrayList<Item> getInventory();
}
