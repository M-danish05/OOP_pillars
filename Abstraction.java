// abstract class Vehicle {
//     abstract void start();
// }
// class Car extends Vehicle {
//     void start() { System.out.println("Car started with key"); }
// }
// class Abstraction {
//     public static void main(String[] args) {
//         Vehicle v = new Car();
//         v.start();
//     }
// }

//----------------------------------------------
//2
//----------------------------------------------

// abstract class Appliance {
//     abstract void turnOn();
// }
// class Fan extends Appliance {
//     void turnOn() { System.out.println("Fan spinning"); }
// }
// class Abstraction2 {
//     public static void main(String[] args) {
//         Appliance a = new Fan();
//         a.turnOn();
//     }
// }

//----------------------------------------------
//3
//----------------------------------------------

interface Playable {
    void play();
}
class Guitar implements Playable {
    public void play() { System.out.println("Guitar strumming"); }
}
class Abstraction3 {
    public static void main(String[] args) {
        Playable p = new Guitar();
        p.play();
    }
}

//----------------------------------------------
//4
//----------------------------------------------

// abstract class Payment {
//     abstract void pay(int amount);
// }
// class CashPayment extends Payment {
//     void pay(int amount) { System.out.println("Paid " + amount + " in cash"); }
// }
// class Abstraction4 {
//     public static void main(String[] args) {
//         Payment p = new CashPayment();
//         p.pay(1500);
//     }
// }