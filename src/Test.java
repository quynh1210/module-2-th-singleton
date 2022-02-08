import BookBorrowed.BookBorrowed;
import BookBorrowed1.BookBorrowed1;

public class Test {
    public static void main(String[] args){
        System.out.println("BEGIN TESTING SINGLETON PATTERN");

        BookBorrowed bookBorrowed1 = new BookBorrowed();
        BookBorrowed bookBorrowed2 = new BookBorrowed();

        BookBorrowed1.borrowBook();
        System.out.println("BookBorrowed1 asked to borrow the book");
        System.out.println("BookBorrowed1 Author and Title: ");
        System.out.println(bookBorrowed1.getAuthorAndTitle());

        bookBorrowed2.borrowBook();
        System.out.println("BookBorrowed2 asked to borrow the book");
        System.out.println("BookBorrowed2 Author and Title:  ");
        System.out.println(bookBorrowed2.getAuthorAndTitle());

        bookBorrowed1.returnBook();
        System.out.println("BookBorrowed1 returned the book");

        bookBorrowed2.borrowBook();
        System.out.println("BookBorrowed2 Author and Title: ");
        System.out.println(bookBorrowed1.getAuthorAndTitle());

        System.out.println("END TESTING SINGLETON PATTERN");
    }
}
