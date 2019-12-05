import java.text.NumberFormat;
class PascalRow extends Factorial{

    int num;
    
    public void setNum(int newNum) {
        NumberFormat putCommaIn = NumberFormat.getInstance();
        this.num = newNum;
        
        for (int r = 0; r <= num; r++) {
            System.out.print(" |"+putCommaIn.format(combinationOf(num,r))+"| ");   
        }
    }

}
