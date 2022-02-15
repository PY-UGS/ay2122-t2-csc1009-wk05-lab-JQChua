public class Rectangle extends Shape{

    public Rectangle(double dim1, double dim2)
    {
        super.setDim1(dim1); 
        super.setDim2(dim2);
    }
    
    public double area()
    {
        double recArea;
        recArea = super.getDim1() * super.getDim2();
        return recArea;
    }
    
}
