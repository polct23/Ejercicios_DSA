public class Cercle extends Figura{
    private double r;

    public Cercle(double i) {
        this.r = i;
    }

    public double area(){
        return (Math.PI * this.r * this.r);
    }
}
