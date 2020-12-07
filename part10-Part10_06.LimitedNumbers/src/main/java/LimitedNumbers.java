
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number < 0) {
                break;
            }
            numbers.add(number);
        }
        ArrayList<Integer> rangeOfNumbers = numbers.stream()
                .filter(value -> value >= 1 && value <= 5)
                .collect(Collectors.toCollection(ArrayList::new));
        rangeOfNumbers.stream()
                .forEach(value -> System.out.println(value));
    }
}
