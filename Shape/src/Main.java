public class Main {
    public static void main(String[] args) {
    double l=20;
    double w=15;
    double side=20;
    Rectangle r =new Rectangle(w,l);
    System.out.println("Area of Rectangle:"+r.getArea());
    System.out.println("Perimeter of Rectangle:"+r.getPerimeter());

    System.out.println("\n");

    Square s=new Square(side);
    System.out.println("Area of Square:"+s.getArea());
    System.out.println("Perimeter of Square:"+s.getPerimeter());





    }
}
