package sk.vrto.collect;

import java.util.Collection;

public class PerformanceBenchmark {

    public long perform(Collection<?> collection, CrudCommand command) {
        long start = System.currentTimeMillis();
        command.execute(collection);
        long end = System.currentTimeMillis();

        return end - start;
    }

}
