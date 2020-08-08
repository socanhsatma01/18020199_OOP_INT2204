public class Cylinder extends Circle{
    private double height=1.0;



    public Cylinder(){

    }

    public Cylinder(double radius){
        this.setRadius(radius);
    }

    public Cylinder(double radius,double height){
        this.setRadius(radius);
        this.setHeight(height);
    }

    public Cylinder(double radius,double height,String color){
        super(radius,color);
        this.setHeight(height);
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height=height;
    }

    public  double getVolume(){
        return(PI*super.getRadius()*super.getRadius()*height);
    }

    public double getArea(){
        return(2*super.getArea()+2*PI*super.getRadius()*height);
    }

    public String toString(){
        return("Cylinder["+super.toString()+",height="+height+"]");
    }
}