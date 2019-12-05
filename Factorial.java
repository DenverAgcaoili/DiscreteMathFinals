import java.math.BigInteger;
class Factorial {
    
    public BigInteger factorialOf(int num) {
        BigInteger bigInteger = new BigInteger("1");
        
        for (int i = 2; i <= num; i++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));   
        }
        return bigInteger;
    }
    
    public BigInteger combinationOf(int num, int num1) {            //insert formula for COMBINATION WITHOUT repetition here.
        BigInteger n = factorialOf(num);
        BigInteger r = factorialOf(num1);
        BigInteger nr = factorialOf(num - num1);

        BigInteger denominator = r.multiply(nr);
        BigInteger answer = n.divide(denominator);

        return answer;
    }
    
    public static void Less500(){
    System.out.println("\n----------------------------------");
    System.out.println("|  Number must be less than 500  |");
    System.out.println("----------------------------------");
    }
    
    public static void MustBePossitive(){
    System.out.println("\n------------------------------");
    System.out.println("|  Number must be possitive  |");
    System.out.println("------------------------------");
    }
    public static void GreaterZero(){
    System.out.println("\n--------------------------------------");
    System.out.println("|  Number must be greater than zero  |");
    System.out.println("--------------------------------------");
    }
    
    public static void GreaterThanSecond(){
    System.out.println("\n-----------------------------------------");
    System.out.println("|  Math error,n must be greater than r  |");
    System.out.println("-----------------------------------------");
    }
    public static void nGreaterK(){
    System.out.println("\n-----------------------------------------");
    System.out.println("|  Math error,n must be greater than k  |");
    System.out.println("-----------------------------------------");
    }
    
    public static void NotANumber(){
    System.out.println("\n---------------------------------------------------");
    System.out.println("|  Error that was not a number please try again.  |");
    System.out.println("---------------------------------------------------");
    }
    
    public static void NotInChoices(){
    System.out.println("\n-----------------------------------------------------");
    System.out.println("|  Number is not in the choices, please try again.  |");
    System.out.println("-----------------------------------------------------");
    }
    
    public static void KindOfRepetition(){
    System.out.println("\n                ===================================================");
    System.out.println("                |     1-WITHOUT REPETITION  2-WITH REPETITION     |");
    System.out.println("                ===================================================");
    }
    
    public static void RowHigh(){
        System.out.println("\n------------------------------------");
        System.out.println("|  Invalid, Row number is too high  |");
        System.out.println("-------------------------------------");
    }
    
    public static void RowLow(){
        System.out.println("\n------------------------------------");
        System.out.println("|  Invalid, Row number is too low  |");
        System.out.println("------------------------------------");
    }
    
    public static void choices(){
        System.out.println("\n==============================================================================");
        System.out.println("|"+"          1-Combination                      2-PERMUTATION"+"                  |");
        System.out.println("|"+"          3-STIRLING                         4-PASCAL ROW GENERATOR"+"         |");
        System.out.println("==============================================================================");
    }
}
