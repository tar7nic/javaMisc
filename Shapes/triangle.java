package Shapes;

class triangle extends shape {
    double s1;
    double s2;
    double base;
    double height;

    public void setVals(double a, double b, double c, double h) {
        s1 = a;
        s2 = b;
        base = c;
        height = h;
        area = 0.5 * base * height;
        perimeter = s1 + s2 + base;
    }

    public double area() {
        return 0.5 * base * height;
    }

    public double perimeter() {
        return s1 + s2 + base;
    }
}
