public class  GeometricObject {
    private String color = "White";
    private boolean filled = false;
    private java.util.Date dateCreated;
  
    public GeometricObject()
    {
      this.dateCreated = new java.util.Date();  
  
    }
  
    public GeometricObject(String color, boolean filled)
    {
      this.dateCreated = new java.util.Date();  
      this.color = color;
      this.filled = filled;
    }
  
    public String getColor()
    {
      return this.color;
    }
  
    public void setColor(String color)
    {
      this.color = color;
    }
  
    public boolean isFilled()
    {
      return this.filled;
    }
  
    public void setFilled(boolean filled)
    {
      this.filled = filled;
    }
    
    public java.util.Date getDateCreated()
    {
      return this.dateCreated;
    }
  
    public String toString()
    {
      String geometricString = " created on " + this.getDateCreated() + "\ncolor: " + this.getColor() + " and filled: " + this.isFilled(); 
      return geometricString;
  
    }
  
    public static void main(String[] args)
    {
  
    }
  
}
