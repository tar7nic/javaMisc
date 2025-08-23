package Shapes;
public class testshape
{
    public static void main(String[] args) 
    {
        
        // Testing Rectangle class
        rectangle r1 = new rectangle();
        r1.setDimensions(10, 5);
        r1.setColor("Black");
        System.out.println("\nRectangle:-");
        System.out.println("Area: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter());
        System.out.println("Color: " + r1.getColor() + "\n");


        // Testing Circle class
        circle c1 = new circle();
        c1.setRadius(7.7);
        c1.setColor("Blue");
        System.out.println("Circle:-");
        System.out.println("Area: " + c1.area());
        System.out.println("Perimeter: " + c1.perimeter());
        System.out.println("Color: " + c1.getColor() + "\n");


        // Testing Triangle class
        triangle t1 = new triangle();
        t1.setVals(3, 4, 7, 4.5);
        t1.setColor("Green");
        System.out.println("Triangle:-");
        System.out.println("Area: " + t1.area());
        System.out.println("Perimeter: " + t1.perimeter());
        System.out.println("Color: " + t1.getColor());
    }
}
