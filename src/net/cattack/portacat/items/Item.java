package net.cattack.portacat.items;

public abstract class Item {
    
    private String displayName;
    private String name;
    private String description;
    private int id;

    public Item(String name, int id) {
        this.id = id;
        this.name = name;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
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