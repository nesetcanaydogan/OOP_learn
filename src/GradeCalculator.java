public class GradeCalculator {
    public static void main(String[] args) {
        System.out.println("Type your midterm exam grade: ");
        String midtermGrade = System.console().readLine();
        int midtermGradeInt = Integer.parseInt(midtermGrade);

        System.out.println("Type your final exam grade: ");
        String finalGrade = System.console().readLine();
        int finalGradeInt = Integer.parseInt(finalGrade);

        double totalGrade = (midtermGradeInt * .4) + (finalGradeInt * .6);
        System.out.println("Your total grade is: " + totalGrade);
        if (totalGrade >= 50 && totalGrade <= 100) System.out.println("You passed the class!");
        else if (totalGrade < 50 && totalGrade >= 0) System.out.println("You failed the class.");
        else System.out.println("Invalid grade calculated. Program has been terminated.");
    }
}