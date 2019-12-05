import java.math.BigInteger;

class PermuWithRepetition extends PermuWithOutRepetition {

    private int num;
    private int num1;

    @Override
    public BigInteger getNum() {      //insert formula for PERMUTATION WITH repetition here.
    BigInteger answer = BigInteger.valueOf(num);
    BigInteger n = BigInteger.valueOf(num);
    
    if(num1 != 0){
        for(int i = 1; i < num1; i++){
            answer = answer.multiply(n);
        }
    }
    else if(num1 == 0){
        answer = BigInteger.ONE;
    }
    return answer;
    }
    
    @Override
    public void setNum(int newNum, int newNum1) {
        this.num = newNum;
        this.num1 = newNum1;
    }

}
