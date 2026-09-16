// class Animal {
//     void sound() { System.out.println("Animal makes sound"); }
// }
// class Dog extends Animal {
//     void sound() { System.out.println("Dog barks"); }
// }
// class Inheritance {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.sound();
//     }
// }

// ==============================================
// 2
// ==============================================

// class Person {
//     String name = "Danish";
//     void display() { System.out.println("Name: " + name); }
// }
// class Student extends Person {
//     int roll = 70167589;
//     void show() { System.out.println("Roll: " + roll); }
// }
// class Inheritance2 {
//     public static void main(String[] args) {
//         Student s = new Student();
//         s.display();
//         s.show();
//     }
// }

// ==============================================
// 3
// ==============================================

// class Phone {
//     void call() { System.out.println("Calling..."); }
// }
// class SmartPhone extends Phone {
//     void browse() { System.out.println("Browsing..."); }
// }
// class Inheritance3 {
//     public static void main(String[] args) {
//         SmartPhone sp = new SmartPhone();
//         sp.call();
//         sp.browse();
//     }
// }

// ==============================================
// 4
// ==============================================

class Fruit {
    String color = "Unknown";
}
class Apple extends Fruit {
    Apple() { color = "Red"; }
}
class Inheritance4 {
    public static void main(String[] args) {
        Apple a = new Apple();
        System.out.println("Apple color: " + a.color);
    }
}