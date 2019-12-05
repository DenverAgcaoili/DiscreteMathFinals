
import java.util.Scanner;

public class DiscreteProject {

    public static void main(String[] args) {
        //Using INHERITANCE on classes Factorial, Combination, Permutaion, StirlingNumber and PascalTriangle
        PascalTriangle answer = new PascalTriangle();
        Scanner input = new Scanner(System.in);
        boolean please = true;
        while (please == true) {
            boolean isValid = false;
            while (isValid == false) {

                Factorial.choices();
                System.out.print("Choose desired operation: ");

                if (input.hasNextInt()) {
                    int choice = input.nextInt();
                    isValid = true;
                    if (choice == 1) {
                        answer.combiComputation();
                    } else if (choice == 2) {
                        answer.permuComputation();
                    } else if (choice == 3) {
                        answer.stirlingComputation();
                    } else if (choice == 4) {
                        answer.pascalComputation();
                    } else if (choice > 4 || choice <= 0) {
                        Factorial.NotInChoices();
                        isValid = false;
                    } else {
                        isValid = false;
                    }
                } else {
                    Factorial.NotANumber();
                    isValid = false;
                }
                input.nextLine();
            }//while loop
            System.out.print("Do you want to calculate again?[y/n]: ");
            char repeat = input.next().charAt(0);

            if (repeat == 'y' || repeat == 'Y') {
                please = true;
            } else if (repeat == 'n' || repeat == 'N') {
                please = false;
            } else {
                System.err.println("Invalid input! Program is closing");
                please = false;
            }
        }
    }
}
