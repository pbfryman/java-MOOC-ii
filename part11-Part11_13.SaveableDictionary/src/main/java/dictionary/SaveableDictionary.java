/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author Blake
 */
public class SaveableDictionary {
    private String file;
    private HashMap<String, String> translations;
    
    public SaveableDictionary() {
        translations = new HashMap<>();
    }
    
    public SaveableDictionary(String file) {
        this.file = file;
        translations = new HashMap<>();
    }
    
    public boolean load() {
        try { 
            Scanner fileReader = new Scanner(Paths.get(file));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                
                add(parts[0], parts[1]);
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(file);
            for (String key : translations.keySet()) {
                writer.println(key + ":" + translations.get(key));
            }
            writer.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public void add(String word, String translation) {
        if (!(translations.containsKey(word))) {
            translations.put(word, translation);
        }
    }
    
    public void delete(String word) {
        if (translations.containsKey(word)) {
            translations.remove(translations.get(word));
            translations.remove(word);
        }
        if (translations.containsValue(word)) {
            translations.values().remove(word);
        }
    }
    
    public void print() {
        for (String key : translations.keySet()) {
            System.out.println(key + ":" + translations.get(key));
        }
    }
    
    public String translate(String word) {
        if (translations.containsKey(word)) {
            return translations.get(word);
        }
        if (translations.containsValue(word)) {
            for (String key : translations.keySet()) {
                if (translations.get(key).equals(word)) {
                    return key;
                }
            }
        }
        return null;
    }
}
