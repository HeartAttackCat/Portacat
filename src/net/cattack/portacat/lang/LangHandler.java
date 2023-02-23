package net.cattack.portacat.lang;

import java.io.File;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class LangHandler {
    
    public File lang;
    public Dictionary<String, String> languageData = new Hashtable<String, String>();

    public LangHandler(String langFile) {
        lang = new File("res/" + langFile);
    }

    /**
     * After intiializing the parser, you can call this method to parse the data.
     */
    public void parseLang() {
        try {
            Scanner scan = new Scanner(lang);
            while (scan.hasNextLine()) {
                Scanner line = new Scanner(scan.nextLine());
                line.useDelimiter("=");
                languageData.put(scan.next(), scan.next());
                line.close();
            }
            scan.close();
        } catch (Exception e) {
            System.out.println("[LangHandler]: The language handler ran into an error.");
            System.exit(-1);
        }
    }
    
    /**
     * This function is for debug.
     */
    public void printLangaugeFile() {
        //TODO - Implement this function
    }

    /**
     * Get the display name of an object from the language file.
     * @param token
     * @return
     */
    public String getName(String token) {
        String name = languageData.get(token);
        if (name == null) {
            return token;
        } else
            return name;
    }
}
