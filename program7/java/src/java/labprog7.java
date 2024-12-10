package java;

import java.util.Scanner;

class Rectangle implements Resizable {
    private int height;
    private int width;

    public Rectangle() {
        this.height = 0;
        this.width = 0;
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void resizeHeight(int height) {
        this.height = height;
    }

    @Override
    public void resizeWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Height: " + this.height + " Width: " + this.width;
    }
}

interface Resizable {
    void resizeHeight(int height);
    void resizeWidth(int width);
}

public class labprog7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the height and width of the rectangle:");
        int height = scanner.nextInt();
        int width = scanner.nextInt();

        Rectangle rectangle = new Rectangle(height, width);
        System.out.println("Initial Rectangle: " + rectangle);

        System.out.println("Enter the new height and width:");
        int newHeight = scanner.nextInt();
        int newWidth = scanner.nextInt();

        
        Resizable resizable = rectangle;
        resizable.resizeHeight(newHeight);
        resizable.resizeWidth(newWidth);

        System.out.println("Updated Rectangle: " + rectangle);
    }
}
