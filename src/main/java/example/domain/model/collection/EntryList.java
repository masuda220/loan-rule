package example.domain.model.collection;

import java.util.Iterator;
import java.util.List;

/**
 * 品目リスト
 */
public class EntryList {
    List<Entry> list;

    EntryList(List<Entry> list) {
        this.list = list;
    }

    @Deprecated(since = "MyBatis")
    public EntryList() {}

    public static EntryList of(List<Entry> source) {
        return new EntryList(source);
    }

    public Iterator<Entry> list() {
        return list.iterator();
    }

    @Override
    public String toString() {
        return "EntryList{" +
              "list=" + list +
              '}';
    }
}
