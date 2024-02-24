public class TriangleEq extends Figura{
    private double b;
    private double h;
    public TriangleEq (double b, double h){
        this.b=b;
        this.h=h;
    }
    public double area(){
        return (this.b*this.h)/2;
    }

    public String toString() {
        return "un Triangle";
    }

}
