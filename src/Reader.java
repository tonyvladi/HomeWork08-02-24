import java.util.ArrayList;

public class Reader {
    private String fullName;
    private int readerNumber;
    private String faculty;
    private String dob;
    private String Phone;
    ArrayList<Book> takenBooks = new ArrayList<>(10);

    public Reader() {
    }

    public Reader(String fullName, int readerNumber, String faculty, String dob, String phone) {
        this.fullName = fullName;
        this.readerNumber = readerNumber;
        this.faculty = faculty;
        this.dob = dob;
        Phone = phone;
    }

    public void printStatus(){
        System.out.println("Reader - " + getFullName()
                + " has number of books " + takenBooks.size()
         + " : ");
        for (Book b : takenBooks) {
            System.out.println(b.name);
        }
    }

    public void takeBook(Book b){
        if(takenBooks.size()<10){
            takenBooks.add(b);
            System.out.println("Reader - " + getFullName() + " took : " + b.name);
        }else{
            System.out.println(" Your limit of 10 books is reached,You have to return " +
                    "some books for taking other books");
        }
    }

    int searchCounter = 0;
    Book bookForDelete;

    public void returnBook(String name){
        for(Book b:takenBooks){
            if(name.equals(b.name)){
                searchCounter++;
                bookForDelete=b;
            }else {
                System.out.println(getFullName() + "hasn't "
                        + name);
            }
        }
        if(searchCounter==1){
        takenBooks.remove(bookForDelete);
        System.out.println(getFullName() + " had return: "
                + name);
        }
    }

    public String getFullName() {
        return fullName;
    }



    public int getReaderNumber() {
        return readerNumber;
    }


    public String getFaculty() {
        return faculty;
    }


    public String getDob() {
        return dob;
    }


    public String getPhone() {
        return Phone;
    }


}