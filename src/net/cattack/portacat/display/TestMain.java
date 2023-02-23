package net.cattack.portacat.display;

public class TestMain {
    public static void main(String[] args) {
        ScreenBuf buf = new ScreenBuf(80, 24);
        for (int i = 0; i < 20; i++) {
            buf.put(i, i, 'x', TermColor.Green, TermColor.Blue);
            buf.flush();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
