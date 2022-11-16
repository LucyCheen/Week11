public class Circle {
    private double redius;
    public static final double PI = 3.14;


    public Circle(){
        this(1);
    }
    public Circle(double redius){
        this.redius = redius;
    }
    public double computeArea(){
        return this.PI * Math.pow(this.redius,2);   //半徑平方
    }
}
