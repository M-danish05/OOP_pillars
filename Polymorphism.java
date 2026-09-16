// class Shape {
//     void draw() { System.out.println("Drawing Shape"); }
// }
// class Circle extends Shape {
//     void draw() { System.out.println("Drawing Circle"); }
// }
// class Polymorphism {
//     public static void main(String[] args) {
//         Shape s = new Circle();
//         s.draw();
//     }
// }

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// 2
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// class Calculator {
//     int add(int a, int b) { return a + b; }
//     int add(int a, int b, int c) { return a + b + c; }
// }
// class Polymorphism2 {
//     public static void main(String[] args) {
//         Calculator calc = new Calculator();
//         System.out.println("2 nums: " + calc.add(5, 3));
//         System.out.println("3 nums: " + calc.add(5, 3, 2));
//     }
// }
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// 3
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// class Printer {
//     void print(String s) { System.out.println("String: " + s); }
//     void print(int n) { System.out.println("Number: " + n); }
// }
// class Polymorphism3 {
//     public static void main(String[] args) {
//         Printer p = new Printer();
//         p.print("Hello");
//         p.print(42);
//     }
// }
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// 4
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

class Bird {
    void fly() { System.out.println("Bird flies"); }
}
class Eagle extends Bird {
    void fly() { System.out.println("Eagle soars high"); }
}
class Polymorphism4 {
    public static void main(String[] args) {
        Bird b = new Eagle();
        b.fly();
    }
}