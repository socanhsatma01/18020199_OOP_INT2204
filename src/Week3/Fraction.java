package Week3;

public class Fraction {
    /**
     * declare attributes here
     */
    private int numerator;
    private int denominator;
    public void setNumerator(int numerator){
        this.numerator = numerator;
    }
    public void setDenominator(int denominator){
        if (denominator == 0) denominator = 1;
        this.denominator = denominator;
    }
    public int getNumerator(){
        return  numerator;
    }
    public int getDenominator(){
        return  denominator;
    }
    /**
     * declare constructor here
     */
    public Fraction(int numerator, int denominator){
        if (denominator == 0) denominator = 1;
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public int UCLN(int numerator, int denominator){
        int a = Math.abs(this.numerator);
        int b = Math.abs(this.denominator);
        if (a==0||b==0) return a+b;
        else {
            while (a != b) {
                if (a > b) a = a - b;
                else if (a < b) b = b - a;
            }
            return a;
        }
    }
    public Fraction reduce(){
        int ucln = UCLN(this.numerator, this.denominator);
        this.numerator = this.numerator / ucln;
        this.denominator = this.denominator / ucln;
        return this;
    }
    /**
     * methods
     */
    // add
    public Fraction add(Fraction other) {
        this.numerator = this.numerator*other.denominator;
        other.numerator = other.numerator*this.denominator;
        this.denominator = this.denominator*other.denominator;
        this.numerator += other.numerator;
        this.reduce();
        return this;
    }
    // subtract
    public Fraction subtract(Fraction other) {
        this.numerator = this.numerator*other.denominator;
        other.numerator = other.numerator*this.denominator;
        this.denominator = this.denominator*other.denominator;
        this.numerator -= other.numerator;
        this.reduce();
        return this;
    }
    // multiple
    public Fraction multiply(Fraction other) {
        this.numerator = this.numerator*other.numerator;
        this.denominator = this.denominator*other.denominator;
        this.reduce();
        return this;
    }
    // divide
    public Fraction divide(Fraction other) {
        this.numerator = other.denominator*this.numerator;
        this.denominator = this.denominator*other.numerator;
        this.reduce();
        return this;
    }
    /**
     * compare this with other, notice that param is Object type
     */
    public boolean equals(Object obj) {
        if (obj instanceof Fraction) {
            Fraction other = (Fraction) obj;
            // compare this vs other here
            if (this.numerator*other.denominator-other.numerator*this.denominator == 0) return true;
            else return false;
        }
        else return false;
    }


}