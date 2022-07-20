public class Function2D
{
    protected double lastUsedX = 0;
    /**
     * Evaluates the function and returns the value at point x
     * @param x the point at which to evaluate the function
     *        the default implementation returns 0, subclasses
     *        need to override eval method
     */
    public double eval(double x)
    {
       this.lastUsedX = x;
       return 0;
    }
}
