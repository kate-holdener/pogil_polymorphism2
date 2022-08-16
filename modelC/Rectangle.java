public class Rectangle
{
   private double length;
   private double width;

   public Rectangle(float length, float width)
   {
      this.length = length;
      this.width = width;
   }

   public double getLength(){return this.length;}
   public double getWidth(){return this.width;}

   public double getArea()
   {
      return this.length * this.width;
   }
}
