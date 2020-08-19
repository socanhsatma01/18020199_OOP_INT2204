package Week5.Cau1;

public class Addition extends BinaryExpression {


    public Addition(Expression left, Expression right) {
        super(left, right);
    }
    public String toString() {
        return "(" + left.toString() + " + " + right.toString() + ")";
    }

    @Override
    public double evaluate() {
        return left.evaluate() + right.evaluate();
    }
}