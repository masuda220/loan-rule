package example.datasource.collection;

import example.domain.model.collection.Entry;
import example.domain.model.collection.book.BookNumber;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CollectionMapper {
    List<Entry> entryList();

    Entry entry(BookNumber bookNumber);
}
