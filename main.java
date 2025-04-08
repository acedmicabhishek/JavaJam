import java.util.Arrays;

// Abstraction
abstract class Human {
    public abstract void describe();
}

// Encapsulation + Abstraction
class Person extends Human {
    private String name;
    private int age;

    // Getters & Setters
    public String getName() {
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int newAge) {
        if (newAge >= 0) {
            age = newAge;
        }
    }

    @Override
    public void describe() {
        System.out.println("I'm a Person.");
    }
}

// Inheritance + Polymorphism
class Student extends Person {
    private String collegeName;

    public String getCollegeName() {
        return collegeName;
    }
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    // Polymorphism: Override method
    @Override
    public void describe() {
        System.out.println("I'm a Student.");
    }

    public void printDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("College: " + getCollegeName());
    }
}

// Threading: Method 1
class MyThreadA extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from Thread A");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread A interrupted");
            }
        }
    }
}

// Threading: Method 2
class MyThreadB implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from Thread B");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread B interrupted");
            }
        }
    }
}

public class main {
    public static void main(String[] args) {
        // Basics
        int age = 24;
        boolean isHandsome = true;
        System.out.println(age);
        System.out.println(isHandsome);

        // Arrays
        int[] number = new int[5];
        number[0] = 2;
        number[1] = 3;
        System.out.println(Arrays.toString(number));
            // primitive {mutable}
    // reference using new keyword {{unmutable}}
    // strings are immutable
     // array are reference type

     
        int[] sahur = {3, 2, 6, 1, 0};
        Arrays.sort(sahur);
        System.out.println(Arrays.toString(sahur));

        // Encapsulation
        Person p = new Person();
        p.setName("Abheesh");
        p.setAge(23);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        p.describe();

        // Inheritance + Polymorphism
        Student s = new Student();
        s.setName("Abheesh Anand");
        s.setAge(23);
        s.setCollegeName("IIT Bombay");
        s.printDetails();
        s.describe();

        // Threading
        System.out.println("Starting Threads...");
        MyThreadA threadA = new MyThreadA();
        Thread threadB = new Thread(new MyThreadB());

        threadA.start();
        threadB.start();
    }
}
