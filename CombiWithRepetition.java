import java.math.BigInteger;
class CombiWithRepetition extends CombiWithOutRepetition {

    private int num;
    private int num1;

    @Override
    public BigInteger getNum() {            //insert formula for COMBINATION WITH repetition here.
        
        
        BigInteger r = factorialOf(num1);
        BigInteger n = factorialOf(num + (num1 -1));
        BigInteger nr = factorialOf(num-1);
        
        BigInteger denominator = r.multiply(nr);
        BigInteger answer = n.divide(denominator);
        
        return answer;
    }

    @Override
    public void setNum(int newNum, int newNum1) {
        this.num = newNum;
        this.num1 = newNum1;
    }
    
}