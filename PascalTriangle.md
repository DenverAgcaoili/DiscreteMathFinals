 
import java.util.Scanner;

class PascalTriangle extends StirlingNumber {

    public void pascalComputation() {
        Scanner input = new Scanner(System.in);
        
            boolean isValid = false;
            while (isValid == false) {
                System.out.print("\nWhich row would you like to generate?[0-500]: ");
                if (input.hasNextInt()) {
                    int rowNumber = input.nextInt();
                    isValid = true;

                    if (rowNumber > 500) {
                        Factorial.RowHigh();
                        isValid = false;
                    } else if (rowNumber < 0) {
                        Factorial.RowLow();
                        isValid = false;
                    } else if (rowNumber >= 0 && rowNumber <= 500) {
                        System.out.println("\nRow number " + rowNumber + " is: ");
                        PascalRow Pascal = new PascalRow();
                        Pascal.setNum(rowNumber);
                    }
                } else {
                    Factorial.NotANumber();
                    isValid = false;
                }
                input.nextLine();
            }
    }
}
