import java.text.NumberFormat;
import java.util.Scanner;

class Combination {

    public void combiComputation() {
        NumberFormat putCommaIn = NumberFormat.getInstance();
        Scanner input = new Scanner(System.in);
        boolean isValid = false;
        while (isValid == false) {//while 1
            Factorial.KindOfRepetition();
            System.out.print("What kind of combination?: ");

            if (input.hasNextInt()) {
                int answer = input.nextInt();
                isValid = true;

                if (answer == 1) {
                    Scanner input1 = new Scanner(System.in);
                    boolean isValid1 = false;
                    while (isValid1 == false) {
                        System.out.print("\nDefine n:");

                        if (input1.hasNextInt()) {
                            isValid1 = true;
                            int num1 = input1.nextInt();

                            if (num1 > 500) {
                                Factorial.Less500();
                                isValid1 = false;
                            } else if (num1 < 0) {
                                Factorial.MustBePossitive();
                                isValid1 = false;
                            } else {
                                Scanner input2 = new Scanner(System.in);
                                boolean isValid2 = false;
                                while (isValid2 == false) {
                                    System.out.print("\nDefine r:");

                                    if (input2.hasNextInt()) {
                                        isValid2 = true;
                                        int num2 = input2.nextInt();

                                        if (num2 > 500) {
                                            Factorial.Less500();
                                            isValid2 = false;
                                        } else if (num2 < 0) {
                                            Factorial.MustBePossitive();
                                            isValid2 = false;
                                        } else {
                                            if (num1 >= num2) {
                                                CombiWithOutRepetition compute = new CombiWithOutRepetition();
                                                compute.setNum(num1, num2);

                                                System.out.println("Number of combination is " + putCommaIn.format(compute.getNum()));

                                            } else {
                                                Factorial.GreaterThanSecond();
                                            }
                                        }
                                    } else {
                                        Factorial.NotANumber();
                                        isValid2 = false;
                                    }

                                    input2.nextLine();
                                }//while 3rd
                            }
                        } else {
                            Factorial.NotANumber();
                            isValid1 = false;
                        }
                        input1.nextLine();
                    }//while 2nd

                } else if (answer == 2) {
                    Scanner input1 = new Scanner(System.in);
                    boolean isValid1 = false;
                    while (isValid1 == false) {
                        System.out.print("\nDefine n:");

                        if (input1.hasNextInt()) {
                            isValid1 = true;
                            int num1 = input1.nextInt();

                            if (num1 > 500) {
                                Factorial.Less500();
                                isValid1 = false;
                            } else if (num1 < 0) {
                                Factorial.MustBePossitive();
                                isValid1 = false;
                            } else {
                                Scanner input2 = new Scanner(System.in);
                                boolean isValid2 = false;
                                while (isValid2 == false) {
                                    System.out.print("\nDefine r:");

                                    if (input2.hasNextInt()) {
                                        isValid2 = true;
                                        int num2 = input2.nextInt();

                                        if (num2 > 500) {
                                            Factorial.Less500();
                                            isValid2 = false;
                                        } else if (num2 < 0) {
                                            Factorial.MustBePossitive();
                                            isValid2 = false;
                                        } else {
                                            if (num1 >= num2) {
                                                CombiWithOutRepetition compute = new CombiWithRepetition();
                                                compute.setNum(num1, num2);

                                                System.out.println("Number of combination is " + putCommaIn.format(compute.getNum()));

                                            } else {
                                                Factorial.GreaterThanSecond();
                                            }
                                        }
                                    } else {
                                        Factorial.NotANumber();
                                        isValid2 = false;
                                    }

                                    input2.nextLine();
                                }//while 3rd
                            }
                        } else {
                            Factorial.NotANumber();
                            isValid1 = false;
                        }
                        input1.nextLine();
                    }//while 2nd

                } else {
                    Factorial.NotInChoices();
                    isValid = false;
                }
            } else {
                Factorial.NotANumber();
                isValid = false;
            }
            input.nextLine();
        }//while 1
    }//last two braces
}
