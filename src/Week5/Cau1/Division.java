package Week5.Cau1;

public class Division extends BinaryExpression {
    public Division(Expression left, Expression right) {
        super(left, right);
    }
    public String toString(){
        return "(" + left.toString() + " / " + right.toString() + ")";
    }
    public double evaluate() throws ArithmeticException{
        double l=left.evaluate();
        double r=right.evaluate();
        if (r == 0){
            throw new ArithmeticException("Lỗi chia cho 0");
        }
        else{
            return l/r;}
    }
}
