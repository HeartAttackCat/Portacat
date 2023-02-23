package net.cattack.portacat.lang;

import java.io.File;
import java.util.Scanner;

public class LangHandler {
    
    public File lang;

    public LangHandler(String langFile) {
        lang = new File(langFile);
    }

    public void parseLang() {
        try {
            Scanner scan = new Scanner(lang);

        } catch (Exception e) {
            System.out.println("[LangHandler]: File not found.");
            System.exit(-1);
        }
    }
}
