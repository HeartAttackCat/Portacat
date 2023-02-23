package net.cattack.portacat.display;

/**
 * Empty, stretchable space in a Widget.
 */
public class Space implements Widget {
    @Override
    public int minWidth() {
        return 0;
    }

    @Override
    public int minHeight() {
        return 0;
    }

    @Override
    public double stretchFactor() {
        return 1;
    }

    @Override
    public void draw(int x, int y, int w, int h) {
        // do nothing.
    }
}
