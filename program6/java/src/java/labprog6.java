package java;

import java.util.Scanner;

abstract class Shape {
    public abstract float calculatePerimeter();
    public abstract float calculateArea();
}

class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public float calculatePerimeter() {
        return (float) (2 * Math.PI * radius);
    }

    @Override
    public float calculateArea() {
        return (float) (Math.PI * radius * radius);
    }
}

class Triangle extends Shape {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public float calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public float calculateArea() {
        float s = (a + b + c) / 2.0f;
        return (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

public class labprog6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.print("Enter your option: ");
        int option = scanner.nextInt();

        Shape shape;
        float perimeter;
        float area;

        switch (option) {
            case 1:
                System.out.print("Enter radius: ");
                int radius = scanner.nextInt();
                shape = new Circle(radius);
                perimeter = shape.calculatePerimeter();
                area = shape.calculateArea();
                System.out.println("Perimeter: " + perimeter);
                System.out.println("Area: " + area);
                break;

            case 2:
                System.out.print("Enter 3 sides of the triangle: ");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                shape = new Triangle(a, b, c);
                perimeter = shape.calculatePerimeter();
                area = shape.calculateArea();
                System.out.println("Perimeter: " + perimeter);
                System.out.println("Area: " + area);
                break;

            default:
                System.out.println("Invalid option!");
        }
    }
}
