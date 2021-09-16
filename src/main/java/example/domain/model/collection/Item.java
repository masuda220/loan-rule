package example.domain.model.collection;

/**
 * 蔵書
 */
public class Item {
    ItemNumber 蔵書番号;
    Entry 蔵書品目;

    @Override
    public String toString() {
        return "Item{" +
              "蔵書番号=" + 蔵書番号 +
              ", 蔵書品目=" + 蔵書品目 +
              '}';
    }
}
