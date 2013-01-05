package sk.vrto.collect;

import java.util.Collection;

public class ResultTable<T> {

    private final Collection<T> collection;
    private long insertTime;

    public ResultTable(Collection<T> collection) {
        this.collection = collection;
    }

    public Collection<T> getCollection() {
        return collection;
    }

    public void setInsertTime(long insertTime) {
        this.insertTime = insertTime;
    }

    public long getInsertTime() {
        return insertTime;
    }

}
