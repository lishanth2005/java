package java;
class OuterClass {

    public void display() {
        System.out.println("Display method of OuterClass");
        InnerClass inner = new InnerClass();
        inner.display();
    }

    class InnerClass {

        public void display() {
            System.out.println("Display method of InnerClass");
        }
    }
}

public class labprog8 {

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.display();
    }
}
