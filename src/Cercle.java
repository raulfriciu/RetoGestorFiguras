public class Cercle extends Figura{
    private double r;
    public Cercle (double r){
        this.r=r;
    }
    public double area(){
        return Math.PI*this.r*this.r;
    }
    public String toString() {
        return "un Cercle";
    }
}
