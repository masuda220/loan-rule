package example.domain.model.collection.book;

/**
 * 書籍番号
 */
public class BookNumber {
    String value;

    public BookNumber(String value) {
        this.value = value;
    }

    @Deprecated(since = "MyBatis")
    public BookNumber() {}

    @Override
    public String toString() {
        return value;
    }
}
