public class Triangle extends Shape{

    public Triangle(double dim1, double dim2)
    {
        super.setDim1(dim1); 
        super.setDim2(dim2);
    } 


    public double area()
    {
        double triArea;
        triArea = super.getDim1() * super.getDim2() * 0.5;
        return triArea;
    }
    
}
