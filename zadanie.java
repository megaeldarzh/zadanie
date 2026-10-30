import java.util.ArrayList;
import java.util.List;

public class zadanie {
    public static void main(String[] args) {
        System.out.println("все работает");
    }
}

// 1 задание
class Student {
    String name;
    int age;
    String group;

    public Student(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }
}

// 2 задание
class Car {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
}

// 3 задание
class Book {
    String title;
    String author;
    int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
}

// 4 задание
class Phone {
    String brand;
    String model;
    double price;

    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
}

// 5 задание
class Cat {
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void meow() {
        System.out.println("мяу");
    }
}

// 6 задание
class Dog {
    String name;
    String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void bark() {
        System.out.println("гав");
    }
}

// 7 задание
class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}

// 8 задание
class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// 9 задание
class Employee {
    String name;
    String position;
    double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
}

// 10 задание
class Laptop {
    String brand;
    int ram;
    double price;

    public Laptop(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }
}

class BankAccount {
    String owner;
    double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double sum) {
        balance += sum;
    }

    public void withdraw(double sum) {
        if (sum <= balance) {
            balance -= sum;
        }
    }
}

// 12 задание
class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }
}

// 13 задание
class StudentExam {
    String name;
    int grade;

    public StudentExam(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public boolean isPassed() {
        return grade >= 50;
    }
}

// 14 задание
class Counter {
    int count;

    public Counter(int count) {
        this.count = count;
    }

    public void inc() { count++; }
    public void dec() { count--; }
    public void reset() { count = 0; }
}

// 15 задание
class Movie {
    String title;
    String genre;
    int duration;

    public Movie(String title, String genre, int duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    public void printInfo() {
        System.out.println(title + ", " + genre + ", " + duration + " мин");
    }
}

// 16 задание
class Temperature {
    double celsius;

    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    public double toFahrenheit() {
        return celsius * 1.8 + 32;
    }

    public double toKelvin() {
        return celsius + 273.15;
    }
}

// 17 задание
class Point {
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance() {
        return Math.sqrt(x * x + y * y);
    }
}

// 18 задание
class ShoppingCart {
    String productName;
    double price;
    int quantity;

    public ShoppingCart(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotal() {
        return price * quantity;
    }

    public void setQuantity(int q) {
        this.quantity = q;
    }
}

// 19 задание
class Clock {
    int hours, minutes, seconds;

    public Clock(int h, int m, int s) {
        this.hours = h;
        this.minutes = m;
        this.seconds = s;
    }

    public void showTime() {
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }
}

// 20 задание
class Flight {
    String flightNumber;
    String destination;
    int availableSeats;

    public Flight(String flightNumber, String destination, int seats) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.availableSeats = seats;
    }

    public boolean book() {
        if (availableSeats > 0) {
            availableSeats--;
            return true;
        }
        return false;
    }
}

// 21 задание
class Computer {
    String brand;
    String processor;
    int ram;
    double price;

    public Computer(String brand, String processor, int ram, double price) {
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
        this.price = price;
    }

    public void printInfo() {
        System.out.println(brand + " " + processor + " " + ram + "GB " + price);
    }
}

// 22 задание
class Account {
    String owner;
    double balance;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void addMoney(double amount) { balance += amount; }
    public void getMoney(double amount) { balance -= amount; }
}

// 23 задание
class LibraryBook {
    String title;
    String author;
    boolean isAvailable = true;

    public LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void takeBook() {
        if (isAvailable) isAvailable = false;
    }

    public void returnBook() {
        isAvailable = true;
    }
}

// 24 задание
class StudentAvg {
    String name;
    double averageGrade;

    public StudentAvg(String name, double averageGrade) {
        this.name = name;
        this.averageGrade = averageGrade;
    }
}

// 25 задание
class MobilePhone {
    String brand;
    int battery = 100;
    boolean isOn = false;

    public MobilePhone(String brand) {
        this.brand = brand;
    }

    public void turnOn() { isOn = true; }
    public void turnOff() { isOn = false; }
    public void use(int percent) {
        if (isOn) battery = Math.max(0, battery - percent);
    }
}

// 26 задание
class CarMileage {
    String brand;
    double mileage;
    double fuel;

    public CarMileage(String brand, double mileage, double fuel) {
        this.brand = brand;
        this.mileage = mileage;
        this.fuel = fuel;
    }

    public void drive(double dist) {
        double cost = dist * 0.1;
        if (fuel >= cost) {
            mileage += dist;
            fuel -= cost;
        }
    }
}

// 27 задание
class Order {
    int orderNumber;
    String productName;
    double price;
    int quantity;

    public Order(int orderNumber, String productName, double price, int quantity) {
        this.orderNumber = orderNumber;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getSum() { return price * quantity; }
    public void changeQty(int q) { this.quantity = q; }
}

// 28 задание
class Player {
    String name;
    int health;
    int damage;

    public Player(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void takeHit(int dmg) {
        health = Math.max(0, health - dmg);
    }

    public void hit(Player target) {
        target.takeHit(damage);
    }
}

// 29 задание
class Warehouse {
    String productName;
    int quantity;
    int capacity;

    public Warehouse(String productName, int quantity, int capacity) {
        this.productName = productName;
        this.quantity = quantity;
        this.capacity = capacity;
    }

    public void add(int q) {
        if (quantity + q <= capacity) quantity += q;
    }

    public void remove(int q) {
        if (quantity >= q) quantity -= q;
    }
}

// 30 задание
class UniStudent {
    String name;
    public UniStudent(String name) { this.name = name; }
}

class UniTeacher {
    String name;
    public UniTeacher(String name) { this.name = name; }
}

class UniCourse {
    String title;
    UniTeacher teacher;
    List<UniStudent> students = new ArrayList<>();

    public UniCourse(String title, UniTeacher teacher) {
        this.title = title;
        this.teacher = teacher;
    }
}