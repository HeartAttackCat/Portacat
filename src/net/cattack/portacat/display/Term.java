package net.cattack.portacat.display;

/**
 * Low-level terminal emulator control abstraction.
 */
public class Term {
    /**
     * Move the cursor to the given position, where x and y start from
     * 0.
     */
    public static void move(int x, int y) {
        // The CSI sequences expect a 1-based indexing scheme.
        x++;
        y++;

        System.out.print("\u001B[" + y + "," + x + "H");
    }

    /**
     * Put a string to the terminal, wherever the curser happens to
     * be.
     */
    public static void put(String s) {
        System.out.print(s);
    }

    /**
     * Set the foreground color.
     */
    public static void setForeground(TermColor color) {
        System.out.print("\u001B[" + color.foreground() + "m");
    }

    /**
     * Set the background color.
     */
    public static void setBackground(TermColor color) {
        System.out.print("\u001B[" + color.background() + "m");
    }

    /**
     * Clear the terminal.
     */
    public static void clear() {
        System.out.print("\u001B[2J");
    }
}
