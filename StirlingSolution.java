import java.math.BigInteger;
class StirlingSolution extends Factorial{

    private int valueOfN;
    private int valueOfJ;

    public BigInteger getNum() {
        BigInteger j1 = BigInteger.valueOf(-1);
        BigInteger j2 = BigInteger.valueOf(-1);
        
        BigInteger answer = BigInteger.valueOf(0);
        
        for(int x = 0; x < valueOfJ;x++){
            j1 = (j1).multiply(j2);
            BigInteger combi = factorialOf(valueOfJ).divide(factorialOf(x).multiply(factorialOf(valueOfJ-x)));
            BigInteger n1 = BigInteger.valueOf(valueOfJ).subtract(BigInteger.valueOf(x));
            BigInteger n2 = BigInteger.valueOf(valueOfJ).subtract(BigInteger.valueOf(x));
            
            for(int z = 1;z < valueOfN;z++){
                n1 = n1.multiply(n2);
            }
            answer = answer.add((j1).multiply(combi).multiply(n1));
        }
        BigInteger Final = answer.divide(factorialOf(valueOfJ));
        return Final;
    }

    public void setNum(int newNum, int newNum1) {
        this.valueOfN = newNum;
        this.valueOfJ = newNum1;
    }

}
