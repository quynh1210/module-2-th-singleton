public class BookSingleton {
    private String author;
    private String title;
    private static BookSingleton book;
    private static boolean isLoanedOut;

    private BookSingleton() {
        author = "Gamma, Helm,Johnson, Vlissides";
        title = "Design Pattern";
        book = null;
        isLoanedOut = false;
    }

    public static BookSingleton borrowBook() {
        if (!isLoanedOut) {
            if (book == null) {
                book = new BookSingleton();
            }
            isLoanedOut = true;
            return book;
        }
        return null;
    }

    public void returnBook(BookSingleton bookReturned) {
        isLoanedOut = false;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorAndTitle() {
        return getTitle() + "  by " + getAuthor();
    }

    private BookSingleton borrowedBook;
    private boolean haveBook = false;

    public void borrowBook(){
        borrowedBook = BookSingleton.borrowBook();

        if (borrowedBook == null){
            haveBook = false;
        } else {
            haveBook = true;
        }
    }

    public String getAuthorTitle(){
        if (haveBook){
            return borrowedBook.getAuthorTitle();
        }
        return "I don't have the book";
    }

    public void returnBook(){
        borrowedBook.returnBook(borrowedBook);
    }
}
