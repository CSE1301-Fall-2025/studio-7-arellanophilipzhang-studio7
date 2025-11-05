public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;

    }

    public double getArea(){
        return this.length * this.width;
    }
    
    public double getPerimeter(){
        return 2*this.width + 2*this.length;
    }

    public boolean isSquare(){
        if (this.length == this.width){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean compareRectangle(Rectangle b)
    {
        if (this.getArea() < b.getArea())
        {
            return false;
        }
        else{
            return true;
        }
    }

    public static void main(String[] args) {
        Rectangle a = new Rectangle(5,6);
        System.out.println(a.getArea());
        System.out.println(a.getPerimeter());
        System.out.println(a.isSquare());
        Rectangle b = new Rectangle(2,3);
        System.out.println(a.compareRectangle(b));

    }
}
