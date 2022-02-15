public abstract class Shape {
    private double dim1;
    private double dim2;


    public double getDim1()
    {
        return this.dim1;
    }

    public double getDim2()
    {
        return this.dim2;
    }
    public void setDim1(double dim1)
    {
        this.dim1 = dim1;
    }

    public void setDim2(double dim2)
    {
        this.dim2 = dim2;
    }

    public abstract double area();

    public static void main(String[] args){
        Rectangle r  = new Rectangle(9,5);
        Triangle t  = new Triangle(10,8);
        Circle c = new Circle(5,5);
        Ellipse e = new Ellipse(7,7);
        Square s = new Square(6,6);
        Shape figref;
        figref = r;
        System.out.println("Inside area for Rectangle. ");
        System.out.println("Area is " + String.format("%.2f", figref.area()));
        figref = t;
        System.out.println("Inside area for Triangle. ");
        System.out.println("Area is " + String.format("%.2f", figref.area()));
        figref = c;
        System.out.println("Inside area for Circle. ");
        System.out.println("Area is " + String.format("%.2f", figref.area()));
        figref = e;
        System.out.println("Inside area for Ellipse. ");
        System.out.println("Area is " + String.format("%.2f", figref.area()));
        System.out.println("Inside area for Sqaure: ");
        figref = s;
        System.out.println("Area is " + String.format("%.2f", figref.area()));
  
      
      }
    
   
    
}
