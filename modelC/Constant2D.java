public class Constant2D extends Function2D
{
    private double value;
    public Constant2D(double value)
    {
        this.value = value;
    }

    @Override
    public double eval(double x)
    {
        super.eval(x);  // call eval method from the superclass
        return this.value;
    }
}
