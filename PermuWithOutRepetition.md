
import java.math.BigInteger;


class PermuWithOutRepetition extends Factorial{

    private int num;
    private int num1;
    
        public BigInteger getNum() {            //insert formula for PERMUTATION WITHOUT repetition here.
        BigInteger n = factorialOf(num);
        
        BigInteger nr = factorialOf(num - num1);
        BigInteger answer = n.divide(nr);

        return answer;
    }

    public void setNum(int newNum, int newNum1) {
        this.num = newNum;
        this.num1 = newNum1;
    }

}
