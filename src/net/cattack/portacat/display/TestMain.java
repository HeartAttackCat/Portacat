package net.cattack.portacat.display;

public class TestMain {
    public static void main(String[] args) {
        Term.clear();
        for (int i = 0; i < 20; i++) {
            Term.move(i, 20 - i);
            Term.setForeground(TermColor.Cyan);
            Term.put("x");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
