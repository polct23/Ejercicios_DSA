public class Rectangle extends Figura {
    private double i1;
    private double i2;
    public Rectangle(double i1, double i2)
    {
        this.i1 = i1;
        this.i2 =i2;
    }
    public double area()
    {
        double areatotal;
        areatotal = this.i1 * this.i2;
        return areatotal;
    }
}
