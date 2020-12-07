package dictionary;

public class Main {
    public static void main(String[] args) {
        // You can test your dictionary here
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        boolean wasSuccessful = dictionary.load();

        if (wasSuccessful) {
            System.out.println("Successfully loaded the dictionary from file");
        }

        System.out.println("Orginal Dictionary:");
        dictionary.print();
        System.out.println("-------------------");
        
        dictionary.add("bueno", "good");
        dictionary.add("hola", "hello");
        dictionary.add("pollo", "chicken");
        dictionary.add("gato", "cat");
        dictionary.add("perro", "dog");
        dictionary.save();
        
        System.out.println("New Dictionary:");
        dictionary.print();
    }
}
