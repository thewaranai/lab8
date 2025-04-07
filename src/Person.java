public class Person {
    public String name;
    public String lastName;
    public String bDate;

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
