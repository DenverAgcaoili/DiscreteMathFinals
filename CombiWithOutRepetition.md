import java.math.BigInteger;

class CombiWithOutRepetition extends Factorial {

    private int num;
    private int num1;

    public BigInteger getNum() {            //insert formula for COMBINATION WITHOUT repetition here.
        BigInteger answer = combinationOf(num,num1);
        return answer;
    }

    public void setNum(int newNum, int newNum1) {
        this.num = newNum;
        this.num1 = newNum1;
    }
}
