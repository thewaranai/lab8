public class Book {
    public String nameb;
    public String author;
    public String dateb;
    public Book (String nameb, String author, String dateb){
        this.dateb = dateb;
        this.nameb = nameb;
        this.author = author;
    }
    public void Print(){
        System.out.println(dateb + " " + author + " " + nameb);
    }
}
