
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number > 0) {
                sum += number;
                count++;
            }
            if (number == 0) {
                break;
            }
        }
        if (count == 0) {
            System.out.println("Cannot calculate average");
        } else {
            double avg = (double)(sum) / (double)(count);
            System.out.println(avg);
        }

    }
}
