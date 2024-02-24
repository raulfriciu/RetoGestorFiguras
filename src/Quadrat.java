public class Quadrat extends Rectangle{
    public Quadrat(double l1){
        super(l1,l1);
    }

    public double area(){
        return this.getL1()*this.getL1();
    }

    @Override
    public double getL1() {
        return super.getL1();
    }
}
