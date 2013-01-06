package sk.vrto.collect;

import java.util.Collection;

public interface CrudCommand<T> {

    int ITERATIONS = 10_000;

    void execute(Collection<T> collection);

}
