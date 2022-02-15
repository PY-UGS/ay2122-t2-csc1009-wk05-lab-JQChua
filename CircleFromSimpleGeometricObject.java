public class CircleFromSimpleGeometricObject extends GeometricObject{
  private double radius;

  public CircleFromSimpleGeometricObject()
  {

  }

  public CircleFromSimpleGeometricObject(double radius)
  {
    this.radius = radius;
  }
  
  public CircleFromSimpleGeometricObject(double radius, String color, boolean filled)
  {
    this.radius = radius;
    this.setColor(color);
    this.setFilled(filled);
  }

  public double getRadius()
  {
    return this.radius;
  }

  public void setRadius(double radius)
  {
    this.radius = radius;
  }
  
  public double getArea()
  {
    double Area = (Math.PI*Math.pow(this.radius,2));
    return Area;
  }

  public double getPerimeter()
  {
    double Perimeter = 2 * Math.PI* this.radius;
    return Perimeter;
  }

  public double getDiameter()
  {
    double Diameter = 2 * this.radius;
    return Diameter;
  }
}