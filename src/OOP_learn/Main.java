package OOP_learn;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int counter, wordCounter, inputCounter = 0;

        // Safety Preventions about user input
        try {
            System.out.println("How many words are you going to type?");
            input = scanner.nextLine();
            inputCounter = Integer.parseInt(input);
            if (inputCounter == 0) return;
            else if (inputCounter < 0) {
                System.out.println("Invalid value error. Program has been terminated");
                return;
            }
        }
        catch (Exception e) {
            System.out.println("Invalid value error. Program has been terminated.");
        }

        Map map = new HashMap();
        for (counter = 0; counter < inputCounter; counter++) {
            System.out.print("Type the word #" + (counter + 1) + ": ");
            input = scanner.nextLine();
            map.put(input, input.length());
        }

        System.out.println(map);
    }
}
