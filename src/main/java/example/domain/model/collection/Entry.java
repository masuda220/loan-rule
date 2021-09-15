package example.domain.model.collection;

import example.domain.model.collection.book.Book;

/**
 * 蔵書品目
 */
public class Entry {
    Book 書籍;

    public String description() {
        return 書籍.description();
    }

    public String number() {
        return 書籍.number();
    }

    @Override
    public String toString() {
        return "Entry{" +
              "書籍=" + 書籍 +
              '}';
    }
}
