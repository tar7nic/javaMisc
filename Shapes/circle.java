package Shapes;

class circle extends shape {
    double radius;

    public void setRadius(double r) {
        radius = r;
        area = 3.14 * radius * radius;
        perimeter = 2 * 3.14 * radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }

    public double perimeter() {
        return 2 * 3.14 * radius;
    }
}
