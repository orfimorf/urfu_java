public class Task8 {
    public static void main(String[] args) {
        // Задание 8. Животные
        Animal dog = new Dog("Бобик", 3, "Овчарка");
        Animal cat = new Cat("Мурка", 2, "Рыба");
        Animal bird = new Bird("Кеша", 1, true);

        dog.makeSound();
        dog.showInfo();
        System.out.println();

        cat.makeSound();
        cat.showInfo();
        System.out.println();

        bird.makeSound();
        bird.showInfo();

        // Задание 8. Фигуры
        System.out.println();
        Shape circle = new Circle(5.0);
        Shape square = new Square(4.0);
        Shape triangle = new Triangle(3.0, 4.0, 5.0);

        System.out.println(circle);
        System.out.println();
        System.out.println(square);
        System.out.println();
        System.out.println(triangle);
    }



    abstract static class Animal {
        protected String name;
        protected int age;

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Абстрактный метод - должен быть реализован в подклассах
        public abstract void makeSound();

        // Общий метод
        public void showInfo() {
            System.out.println("Имя: " + name + ", Возраст: " + age + " лет");
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    static class Dog extends Animal {
        private String breed;

        public Dog(String name, int age, String breed) {
            super(name, age);
            this.breed = breed;
        }

        @Override
        public void makeSound() {
            System.out.println(name + " говорит: Гав-гав!");
        }

        public void showInfo() {
            super.showInfo();
            System.out.println("Порода: " + breed);
        }

        public String getBreed() {
            return breed;
        }
    }

    static class Cat extends Animal {
        private String foodType;

        public Cat(String name, int age, String foodType) {
            super(name, age);
            this.foodType = foodType;
        }

        @Override
        public void makeSound() {
            System.out.println(name + " говорит: Мяу-мяу!");
        }

        public void showInfo() {
            super.showInfo();
            System.out.println("Любимый корм: " + foodType);
        }

        public String getFoodType() {
            return foodType;
        }
    }

    static class Bird extends Animal {
        private boolean canFly;

        public Bird(String name, int age, boolean canFly) {
            super(name, age);
            this.canFly = canFly;
        }

        @Override
        public void makeSound() {
            System.out.println(name + " говорит: Чирик-чирик!");
        }

        public void showInfo() {
            super.showInfo();
            System.out.println("Может летать: " + (canFly ? "Да" : "Нет"));
        }

        public boolean canFly() {
            return canFly;
        }
    }

    abstract static class Shape {
        protected String color;

        public Shape() {
            this.color = "Черный";
        }

        public Shape(String color) {
            this.color = color;
        }

        public abstract double calculateArea();
        public abstract double calculatePerimeter();

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return String.format("Цвет: %s", this.getColor());
        }
    }

    static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            super();
            this.radius = radius;
        }

        public Circle(double radius, String color) {
            super(color);
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * this.radius * this.radius;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * Math.PI * this.radius;
        }

        public double getRadius() {
            return this.radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        @Override
        public String toString() {
            return String.format("Круг:\n  Цвет: %s\n  Радиус: %.2f\n  Площадь: %.2f\n  Периметр: %.2f",
                    this.getColor(), this.getRadius(), this.calculateArea(), this.calculatePerimeter());
        }
    }

    static class Square extends Shape {
        private double side;

        public Square(double side) {
            super();
            this.side = side;
        }

        public Square(double side, String color) {
            super(color);
            this.side = side;
        }

        @Override
        public double calculateArea() {
            return this.side * this.side;
        }

        @Override
        public double calculatePerimeter() {
            return 4 * this.side;
        }

        public double getSide() {
            return this.side;
        }

        public void setSide(double side) {
            this.side = side;
        }

        @Override
        public String toString() {
            return String.format("Квадрат:\n  Цвет: %s\n  Сторона: %.2f\n  Площадь: %.2f\n  Периметр: %.2f",
                    this.getColor(), this.getSide(), this.calculateArea(), this.calculatePerimeter());
        }
    }

    static class Triangle extends Shape {
        private double a, b, c;

        public Triangle(double a, double b, double c) {
            super();
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public Triangle(double a, double b, double c, String color) {
            super(color);
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getA() { return this.a; }
        public double getB() { return this.b; }
        public double getC() { return this.c; }

        public void setA(double a) { this.a = a; }
        public void setB(double b) { this.b = b; }
        public void setC(double c) { this.c = c; }

        @Override
        public double calculateArea() {
            double p = this.calculatePerimeter() / 2;
            return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
        }

        @Override
        public double calculatePerimeter() {
            return this.a + this.b + this.c;
        }

        @Override
        public String toString() {
            return String.format("Треугольник:\n  Цвет: %s\n  Стороны: %.2f, %.2f, %.2f\n  Площадь: %.2f\n  Периметр: %.2f",
                    this.getColor(), this.getA(), this.getB(), this.getC(), this.calculateArea(), this.calculatePerimeter());
        }
    }
}


