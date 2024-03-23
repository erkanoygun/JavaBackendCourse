public class Book implements Comparable<Book> {
    private String _bookName;
    private int _pageSize;
    private String _authorName;
    private String _publishDate;

    public Book(String bookName, int pageSize, String authorName, String publishDate) {
        this._bookName = bookName;
        this._pageSize = pageSize;
        this._authorName = authorName;
        this._publishDate = publishDate;
    }

    public String get_bookName() {
        return _bookName;
    }


    @Override
    public int compareTo(Book otherBook) {
        return this._bookName.compareTo(otherBook.get_bookName());
    }
}
