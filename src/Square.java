public class Square extends Shape implements  Resizable{
    private double side =1.0;
    public Square(){};
    public Square(double side)
    {
        this.side=side;
    }
    public Square(double side ,String color , boolean filled)
    {
        super(color, filled);
        this.side=side;
    }
    public void setSide(double side)
    {
        this.side=side;
    }
    public double getSide()
    {
        return side;
    }
    public double getArea()
    {
        return this.side*this.side;
    }
    public double getPerimeter()
    {
        return 4*this.side;
    }
    @Override
    public String toString() {
        return "A Square with side="
                +" "
                +this.getSide()
                + ", which is a subclass of "
                + super.toString();
    }
    @Override
    public void resize (double percent)
    {
        if(percent>=1&&percent<=100)
        {
            this.side=this.side+(this.side/100)*percent;
        }
    }
}
