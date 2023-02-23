package net.cattack.portacat.display;

/**
 * A buffer representing the state of the screen.
 */
public class ScreenBuf {
    private int width;
    private int height;

    /**
     * Buffer of the characters on the screen, indexed as a 2-D
     * matrix.
     */
    private char[] characters;

    /**
     * Colors of the foregrounds of the characters, corresponding to
     * `characters`.
     */
    private TermColor[] foregrounds;

    /**
     * Colors of the foregrounds of the characters, corresponding to
     * `characters`.
     */
    private TermColor[] backgrounds;

    /**
     * Whether each character is "dirty", i.e., needs to be re-drawn.
     */
    private boolean[] dirty;

    /**
     * Whether the ScreenBuf has ever been drawn before; if this is
     * false, then the entire screen needs to be cleared and redrawn
     * when flush() is called.
     */
    private boolean ever_drawn;

    /**
     * Create a new ScreenBuf with the given maximum width and height.
     */
    public ScreenBuf(int width, int height) {
        this.width = width;
        this.height = height;
        this.ever_drawn = false;

        characters = new char[width * height];
        foregrounds = new TermColor[width * height];
        backgrounds = new TermColor[width * height];
        dirty = new boolean[width * height];

        for (int i = 0; i < width * height; i++) {
            characters[i] = ' ';
            foregrounds[i] = TermColor.Default;
            backgrounds[i] = TermColor.Default;
            dirty[i] = true;
        }
    }

    /**
     * Draw every pixel on the screen that needs to be redrawn.
     */
    public void flush() {
        if (!ever_drawn)
            Term.clear();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (!ever_drawn || dirty[char_index(x, y)]) {
                    redraw_char(x, y);
                    dirty[char_index(x, y)] = false;
                }
            }
        }

        Term.move(width - 1, height - 1);
        ever_drawn = true;
    }

    /**
     * Redraw the entire screen by force.
     */
    public void force_flush() {
        ever_drawn = false;
        flush();
    }

    /**
     * Put a character at the given coordinates.
     */
    public void put(int x, int y, char c,
                    TermColor foreground, TermColor background) {
        int idx = char_index(x, y);
        if (characters[idx] == c &&
            foregrounds[idx] == foreground &&
            backgrounds[idx] == background)
            return;

        characters[idx] = c;
        foregrounds[idx] = foreground;
        backgrounds[idx] = background;
        dirty[idx] = true;
    }

    /**
     * Redraw the character at the given coordinates.
     */
    private void redraw_char(int x, int y) {
        Term.move(x, y);
        Term.setForeground(foregrounds[char_index(x, y)]);
        Term.setBackground(backgrounds[char_index(x, y)]);
        Term.setBackground(backgrounds[char_index(x, y)]);
        Term.put(characters[char_index(x, y)]);
    }

    /**
     * Get the index of the character at the given coordinates.
     */
    private int char_index(int x, int y) {
        return x + y * width;
    }
}
