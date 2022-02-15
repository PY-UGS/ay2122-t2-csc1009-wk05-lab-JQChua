public class Circle extends Shape{

    public Circle(double dim1, double dim2)
    {
        super.setDim1(dim1); 
        super.setDim2(dim2);
    }
    
    public double area()
    {
        double circleArea;
        circleArea = super.getDim1() * super.getDim2() * Math.PI;
        return circleArea;
    }
    
}
