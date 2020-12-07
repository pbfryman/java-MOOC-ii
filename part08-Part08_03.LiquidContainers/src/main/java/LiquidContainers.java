
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        int first = 0;
        int second = 0;
        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            switch (command) {
                case "add":
                    if (amount > 0) {
                        if (first + amount > 100) {
                            first = 100;
                        } 
                        else {
                            first += amount;
                        }
                    }
                    break;
                case "move":
                    if (amount > 0) {
                        if (first - amount < 0) {
                            if (second + first > 100) {
                                second = 100;
                            } else {
                                second += first;
                            }
                            first = 0;
                        } else {
                            first -= amount;
                            if (second + amount > 100) {
                                second = 100;
                            } else {
                                second += amount;
                            }
                        }
                    }
                    break;
                case "remove":
                    if (amount > 0) {
                        if (second - amount < 0) {
                            second = 0;
                        } else {
                            second -= amount;
                        }
                    }
                    break;
            }
        }
    }

}
