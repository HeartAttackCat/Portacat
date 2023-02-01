package net.cattack.portacat.items;

public abstract class Item {
    
    private String displayName;
    private int id;
    private String description;

    public Item(String displayName, int id) {
        this.id = id;
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void onUse() {

    }

    public String getDisplayName() {
        return displayName;
    }

    public int getID() {
        return id;
    }

}
