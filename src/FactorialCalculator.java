public class FactorialCalculator {
    public static void main(String[] args) {
        System.out.println("Type a number to calculate the factorial: ");
        String userInput = System.console().readLine();
        int userNum = Integer.parseInt(userInput);
        int factorialValue = 1;

        for (int i = 1; i <= userNum; i++) {
            factorialValue *= i;
        }
        System.out.println("Factorial value of " + userNum + ": " + factorialValue);
    }
}
