public class Task5 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 10.0);
        System.out.println(rect.toString());

        rect.setLength(7.0);
        rect.setWidth(12.0);
        System.out.println("\nНовые размеры:");
        System.out.println(rect.toString());
    }
}

class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.getLength() * this.getWidth();
    }

    public double getPerimeter() {
        return 2 * (this.getLength() + this.getWidth());
    }

    public String toString() {
        return String.format("Длина: %.2f\nШирина: %.2f\nПлощадь: %.2f\nПереметр: %.2f",
                this.getLength(), this.getWidth(), this.getArea(), this.getPerimeter());
    }
}