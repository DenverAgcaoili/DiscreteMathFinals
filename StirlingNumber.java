
import java.text.NumberFormat;
import java.util.Scanner;

class StirlingNumber extends Permutation {

    public void stirlingComputation() {
        NumberFormat putCommaIn = NumberFormat.getInstance();
        Scanner input = new Scanner(System.in);
        boolean isValid = false;
        while (isValid == false) {
            System.out.print("\nDefine n:");

            if (input.hasNextInt()) {
                int num = input.nextInt();
                isValid = true;
                if (num > 500) {
                    Factorial.Less500();
                    isValid = false;
                } else if (num <= 0) {
                    Factorial.GreaterZero();
                    isValid = false;
                } else {
                    Scanner input1 = new Scanner(System.in);     //Loop for the second digit
                    boolean isValid1 = false;
                    while (isValid1 == false) {
                        System.out.print("\nDefine k:");

                        if (input1.hasNextInt()) {
                            int num1 = input1.nextInt();
                            isValid1 = true;
                            if (num1 > 500) {
                                Factorial.Less500();
                                isValid1 = false;
                            } else if (num1 <= 0) {
                                Factorial.GreaterZero();
                                isValid1 = false;
                            } else {
                                if (num >= num1) {
                                    StirlingSolution solution = new StirlingSolution();
                                    solution.setNum(num, num1);
                                    System.out.println("Number Stirling of ways is: " + putCommaIn.format(solution.getNum()));
                                }
                                else if(num<num1){
                                    Factorial.nGreaterK();
                                }
                            }
                        } else {
                            Factorial.NotANumber();
                            isValid1 = false;
                        }
                        input1.nextLine();
                    }
                }
            } else {
                Factorial.NotANumber();
                isValid = false;
            }
            input.nextLine();
        }
    }
}
