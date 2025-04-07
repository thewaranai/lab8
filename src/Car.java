public class Car {
    public String brand;
    public String date;
    public String engCapacity;
    public Car (String brand, String date, String engCapacity){
        this.brand = brand;
        this.date = date;
        this.engCapacity = engCapacity;
    }
    public void Print(){
        System.out.println(brand + " " + date + " " + engCapacity);
    }
}
