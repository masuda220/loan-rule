package example.datasource.collection;

import example.application.service.collection.CollectionRepository;
import example.domain.model.collection.Entry;
import example.domain.model.collection.EntryList;
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
}
