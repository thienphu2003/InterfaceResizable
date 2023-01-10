public class Main {
    public static void main(String[] args) {
        Circle c =new Circle(3,"blue",true);
        Rectangle r = new Rectangle(3,4,"yellow",false);
        Square s = new Square(3,"red",false);
        System.out.println(c.getRadius());
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
        System.out.println(c);
        System.out.println(r.getWidth());
        System.out.println(r.getLength());
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        System.out.println(r);
        System.out.println(s.getSide());
        System.out.println(s.getArea());
        System.out.println(s.getPerimeter());
        System.out.println(s);
        c.resize(30);
        System.out.println(c.getPerimeter());
        System.out.println(c.getArea());
        System.out.println(c.getRadius());
        s.resize(100);
        r.resize(50);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        System.out.println(s.getSide());
        System.out.println(s.getArea());
        System.out.println(s.getPerimeter());
    }
}