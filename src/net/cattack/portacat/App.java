package net.cattack.portacat;

import java.util.logging.Logger;

public class App {

    public static Logger log;

    public static void main(String[] args) throws Exception {
        log = Logger.getGlobal();

        System.out.println("Hello, World!");
        init();
        start();
        clean();
    }

    public static void start() {
        System.out.println("Starting system...");
        //Starting the system
    }

    public static void clean() {
        // TODO
    }

    public static void init() {
        // Intitialization before running
    }
}
