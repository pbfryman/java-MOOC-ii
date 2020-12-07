import java.util.List;
import java.util.Collections;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        List<Literacy> list = readFile("literacy.csv");
        
    }
    
    public static List<Literacy> readFile(String file) {
        List<Literacy> list = new ArrayList<>();
        try {
            Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .map(parts -> new Literacy(cleanString(parts[2].trim()), parts[3].trim(), 
                    Integer.valueOf(parts[4].trim()), Double.valueOf(parts[5].trim())))
                    .sorted()
                    .forEach(line -> System.out.println(line));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return list;
    }
    
    public static void print(List<Literacy> list) {
        list.stream()
                .forEach(row -> System.out.println(row.getCountry()));
    }
    
    public static String cleanString(String line) {
        if (line.contains("female")) {
            return "female";
        } else {
            return "male";
        }
    }
}
