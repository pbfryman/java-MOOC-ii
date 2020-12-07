
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        System.out.println("Input numbers, type 'end' to stop.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            list.add(input);
        }
        
        System.out.println("Print the average of the negative or positive numbers? (n/p)");
        String choice = scanner.nextLine();
        if (choice.equals("n")) {
            double average = list.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble();
            
            System.out.println("Average of the negative numbers: " + average);
        }
        if (choice.equals("p")) {
            double average = list.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number > 0)
                    .average()
                    .getAsDouble();
            
            System.out.println("Average of the positive numbers: " + average);
        }
        
    }
}
