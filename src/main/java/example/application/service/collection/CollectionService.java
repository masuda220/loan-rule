package example.application.service.collection;

import example.domain.model.collection.EntryList;
import org.springframework.stereotype.Service;

/**
 * 蔵書サービス
 */
@Service
public class CollectionService {
    CollectionRepository 蔵書;

    public CollectionService(CollectionRepository 蔵書) {
        this.蔵書 = 蔵書;
    }

    public EntryList 蔵書品目一覧() {
        return 蔵書.蔵書品目一覧();
    }
}
