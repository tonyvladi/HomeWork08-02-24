public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Game of Thrones: A song of ace and fire"
         ,"G.R.R. Martin");
        Book book8 = new Book("She: A History of Adventure"
                ,"H. Rider Haggard");
        Book book2 = new Book("The Da Vinci Code"
                ,"Dan Brown");
        Book book3 = new Book("Harry Potter and the Chamber of Secrets"
                ,"J. K. Rowling");
        Book book4 = new Book("Harry Potter and the Prisoner of Azkaban"
                ,"J. K. Rowling");
        Book book5 = new Book("Harry Potter and the Goblet of Fire"
                ,"J. K. Rowling");
        Book book6 = new Book("The Alchemist"
                ,"Paulo Coelho");
        Book book7 = new Book("The Catcher in the Rye"
                ,"J. D. Salinger");

        Reader reader1 = new Reader("Ivanov C.C.",124,"Electronic","06-10-1985","684-647-89-76");

        reader1.printStatus();
        reader1.takeBook(book5);
        reader1.printStatus();
        reader1.returnBook("Harry Potter and the Goblet of Fire");
        reader1.printStatus();
    }
}