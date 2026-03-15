public class Task6 {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape square = new Square(4.0);
        Shape triangle = new Triangle(3.0, 4.0, 5.0);

        System.out.println(circle);
        System.out.println();
        System.out.println(square);
        System.out.println();
        System.out.println(triangle);
    }
}

interface Shape {
    double getArea();
    double getPerimeter();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public String toString() {
        return String.format("Круг:\nРадиус: %.2f\nПлощадь: %.2f\nПериметр: %.2f",
                this.getRadius(), this.getArea(), this.getPerimeter());
    }
}

class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    public double getSide() {
        return side;
    }

    public String toString() {
        return String.format("Квадрат:\nСторона: %.2f\nПлощадь: %.2f\nПериметр: %.2f",
                this.getSide(), this.getArea(), this.getPerimeter());
    }
}

class Triangle implements Shape {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }
    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    public String toString() {
        return String.format("Треугольник:\nСтороны: %.2f, %.2f, %.2f\nПлощадь: %.2f\nПериметр: %.2f",
                this.getA(), this.getB(), this.getC(), this.getArea(), this.getPerimeter());
    }
}