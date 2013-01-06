package sk.vrto.collect;

import java.util.Collection;

public class ResultTable<T> {

    private final Collection<T> collection;
    private long insertTime;
    private long deleteTime;

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

    public long getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(long deleteTime) {
        this.deleteTime = deleteTime;
    }
}
