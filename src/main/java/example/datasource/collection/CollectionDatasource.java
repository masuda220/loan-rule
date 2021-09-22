package example.datasource.collection;

import example.application.service.collection.CollectionRepository;
import example.domain.model.collection.Entry;
import example.domain.model.collection.EntryList;
import example.domain.model.collection.book.BookNumber;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CollectionDatasource implements CollectionRepository {
    CollectionMapper mapper;

    public CollectionDatasource(CollectionMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public EntryList 蔵書品目一覧() {
        List<Entry> result = mapper.entryList();
        return EntryList.of(result);
    }

    @Override
    public Entry 蔵書品目(BookNumber 書籍番号) {
        return mapper.entry(書籍番号);
    }
}
