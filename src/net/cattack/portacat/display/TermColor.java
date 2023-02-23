package net.cattack.portacat.display;

public enum TermColor {
    Black(0),
    Red(1),
    Green(2),
    Brown(3),
    Blue(4),
    Magenta(5),
    Cyan(6),
    White(7),
    Default(9);

    private int index;
    private TermColor(int index) {
        this.index = index;
    }

    public int foreground() {
        return 30 + index;
    }

    public int background() {
        return 40 + index;
    }
}
