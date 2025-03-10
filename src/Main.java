import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя человека:");
        String name = in.nextLine();
        System.out.println("Введите фамилию:");
        String lastName = in.nextLine();
        System.out.println("Введите год рождения:");
        String bDate = in.nextLine();
        Person person = new Person(name, lastName, bDate);

        System.out.println("Введите марку машины:");
        String brand = in.nextLine();
        System.out.println("Введите год выпуска:");
        String date = in.nextLine();
        System.out.println("Введите мощномть двигаетля:");
        String engCapacity = in.nextLine();
        Car car = new Car(brand, date, engCapacity);

        System.out.println("Введите название книги:");
        String nameb = in.nextLine();
        System.out.println("Введите дату выпуска:");
        String dateb = in.nextLine();
        System.out.println("Введите автора:");
        String author = in.nextLine();
        Book book = new Book(nameb, dateb, author);

        person.Print();
        car.Print();
        book.Print();

        person.SpecialPrint(book, car);

    }
}
class Person {
    private String name;
    private String lastName;
    private String bDate;

    public Person (String name, String lastName, String bDate){
        this.bDate = bDate;
        this.lastName = lastName;
        this.name = name;
    }

    public void Print(){
        System.out.println(bDate + " " + lastName + " " + name);
    }
    public void SpecialPrint(Book book, Car car){
        System.out.println(name + " читает книгу " + book.nameb + " про машину " + car.brand);
    }
}
class Car {
    String brand;
    private String date;
    private String engCapacity;
    public Car (String brand, String date, String engCapacity){
        this.brand = brand;
        this.date = date;
        this.engCapacity = engCapacity;
    }
    public void Print(){
        System.out.println(brand + " " + date + " " + engCapacity);
    }
}
class Book {
    String nameb;
    private String author;
    private String dateb;
    public Book (String nameb, String author, String dateb){
        this.dateb = dateb;
        this.nameb = nameb;
        this.author = author;
    }
    public void Print(){
        System.out.println(dateb + " " + author + " " + nameb);
    }
}