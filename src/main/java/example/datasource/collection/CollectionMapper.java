package example.datasource.collection;

import example.domain.model.collection.Entry;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CollectionMapper {
    List<Entry> entryList();
}
