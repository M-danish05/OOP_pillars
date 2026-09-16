// class Student {
//     private String name;
//     public void setName(String n) { name = n; }
//     public String getName() { return name; }
// }
// class Encapsulation {
//     public static void main(String[] args) {
//         Student s = new Student();
//         s.setName("Danish");
//         System.out.println("Name: " + s.getName());
//     }
// }


//-----------------------------------------------
//2
//-----------------------------------------------

// class BankAccount {
//     private double balance = 0;
//     public void deposit(double amt) { balance += amt; }
//     public double getBalance() { return balance; }
// }
// class Encapsulation2 {
//     public static void main(String[] args) {
//         BankAccount acc = new BankAccount();
//         acc.deposit(5000);
//         System.out.println("Balance: " + acc.getBalance());
//     }
// }

// -------------------------------------------
// 3
// -------------------------------------------
// class Employee {
//     private int salary;
//     public void setSalary(int s) { if (s > 0) salary = s; }
//     public int getSalary() { return salary; }
// }
// class Encapsulation3 {
//     public static void main(String[] args) {
//         Employee e = new Employee();
//         e.setSalary(50000);
//         System.out.println("Salary: " + e.getSalary());
//     }
// }


// -------------------------------------------
// 4
// -------------------------------------------

class Password {
    private String pass = "1234";
    public boolean check(String input) { return pass.equals(input); }
    public void change(String p) { pass = p; }
}
class Encapsulation4 {
    public static void main(String[] args) {
        Password pw = new Password();
        System.out.println("Correct: " + pw.check("1234"));
        pw.change("abcd");
        System.out.println("Correct: " + pw.check("1234"));
    }
}