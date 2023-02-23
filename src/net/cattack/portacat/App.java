package net.cattack.portacat;

import java.util.logging.Logger;

import net.cattack.portacat.lang.LangHandler;

public class App {

    public static String langFile;
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
        langFile = "test.txt";
        //Starting the system
    }

    public static void clean() {
        // TODO
    }

    public static void init() {
        LangHandler lang = new LangHandler(langFile);
        lang.parseLang();
    }
}
