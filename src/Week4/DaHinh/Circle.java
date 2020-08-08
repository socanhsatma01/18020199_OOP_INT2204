package Week4.DaHinh;

public class Circle extends Shape {
    protected double radius;

    //private final double PI=3.14;

    public Circle(){}

    public Circle(double radius){
        this.radius=radius;
    }

    public  Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }

    @Override
    public double getArea(){
        return(Math.PI*radius*radius);
    }

    @Override
    public double getPerimeter() {
        return(2*Math.PI*radius);
    }

    public String toString(){
        return ("Circle[radius="+radius+",color="+color+",filled="+filled+"]");
    }
}
