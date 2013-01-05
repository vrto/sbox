package sk.vrto.collect;

import java.util.Collection;

public interface CrudCommand<T> {

    int ITERATIONS = 100_000;

    void execute(Collection<T> collection);

}
