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