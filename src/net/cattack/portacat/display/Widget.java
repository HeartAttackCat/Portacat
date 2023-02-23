package net.cattack.portacat.display;

/**
 * Text user interface widget.
 */
public interface Widget {
    /**
     * Get the minimum height for this widget; the widget should never
     * be drawn below that height.
     */
    public int minWidth();

    /**
     * Get the minimum width for this widget; the widget should never
     * be drawn below that width.
     */
    public int minHeight();

    /**
     * Get the factor by which this widget can stretch.
     */
    public double stretchFactor();

    /**
     * Draw the widget at the given coordinates, with the given size.
     */
    public void draw(int x, int y, int w, int h);
}
