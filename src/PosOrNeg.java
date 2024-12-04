public class PosOrNeg {
    public static void main(String[] args) {
        // Pozitif mi Negatif mi?
        System.out.println("Type a number to decide if the number is positive or negative: ");
        String userInput = System.console().readLine();
        int userNum = Integer.parseInt(userInput);

        if (userNum > 0) System.out.println("Positive number.");
        else if (userNum < 0) System.out.println("Negative number.");
        else System.out.println("Neutral number.");
    }
}
