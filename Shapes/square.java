package Shapes;

public class square extends rectangle {
    double side;
    
    public void SetDim(double side){
        this.side = side;
        area = side*side;
        peri = 4*side;
    }

    public double area(){
        return side*side;
    }

    public double peri(){
        return 4*side;
    }
}
