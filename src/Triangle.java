public class Triangle extends Shape {
    public double side1;
    public double side2;
    public double side3;

    Triangle() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    Triangle(double side1, double side2, double side3, String coler, boolean filled) {
        super(coler, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return (side1 + side2 + side3) / 2;
    }

    public double getArea() {
        double p = getPerimeter();
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public String toString() {
        return "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", Perimeter = " + getPerimeter() +
                ", Area = " + getArea() +
                ", "+ super.toString();
    }
}
