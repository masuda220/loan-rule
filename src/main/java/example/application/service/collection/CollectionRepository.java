package example.application.service.collection;

import example.domain.model.collection.Entry;
import example.domain.model.collection.EntryList;
import example.domain.model.collection.book.BookNumber;

public interface CollectionRepository {
    EntryList 蔵書品目一覧();

    Entry 蔵書品目(BookNumber 書籍番号);
}
