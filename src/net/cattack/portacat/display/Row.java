package net.cattack.portacat.display;
import java.util.ArrayList;

/**
 * Row of widgets.
 */
public class Row implements Widget {
    private ArrayList<Widget> widgets;

    public Row(ArrayList<Widget> widgets) {
        this.widgets = widgets;
    }

    @Override
    public int minWidth() {
        int width = 0;
        for (Widget w : widgets)
            width += w.minWidth();
        return width;
    }

    @Override
    public int minHeight() {
        int height = 0;
        for (Widget w : widgets)
            if (w.minHeight() > height)
                height = w.minHeight();
        return height;
    }

    @Override
    public double stretchFactor() {
        return 0;
    }

    @Override
    public void draw(int x, int y, int w, int h) {
        double totalStretch = totalStretch();
        double totalWidth = totalWidth();
        double targetWidth = w;

        double neededWidth = targetWidth - totalWidth;
        double neededStretch = neededWidth / totalStretch;

        double penX = x;
        for (Widget wd : widgets) {
            double wdWidth = wd.minWidth() + neededStretch * wd.stretchFactor();
            wd.draw((int)penX, y, (int)wdWidth, h);
            penX += wdWidth;
        }
    }

    private double totalStretch() {
        double stretch = 0;
        for (Widget w : widgets)
            stretch += w.stretchFactor();
        return stretch;
    }

    private double totalWidth() {
        double width = 0;
        for (Widget w : widgets)
            width += w.minWidth();
        return width;
    }
}
