package Shapes;

public class main1{
    public static void main(String[] args) {
        rectangle r = new rectangle();  
        r.setcolor();
        r.SetDim(10, 5);
        System.out.println("Rectangle");
        System.out.println("area: "+ r.area());
        System.out.println("peri "+ r.peri()+"\n");

        // triangle t = new triangle();
        // t.setcolor();
        // t.SetDim(6, 3, 3);
        // System.out.println("Triangle");
        // System.out.println(t.area());
        // System.out.println(t.peri()+"\n");

        // circle c = new circle();
        // c.setcolor();
        // c.SetDim(10);
        // System.out.println("Circle");
        // System.out.println(t.area());
        // System.out.println(t.peri()+"\n");

        square s = new square();
        s.setcolor();
        s.SetDim(5);
        System.out.println("Square");
        System.out.println(s.area());
        System.out.println(s.peri());
    }
}
