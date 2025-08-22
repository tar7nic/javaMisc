package Shapes;

public abstract class shape {
    double area;
    double peri;
    String color;

    public abstract double area();
    public abstract double peri();

    public void getColor(String color){
        this.color = color;
    }
    public void setcolor(){
        System.out.println("Black");
    }
}