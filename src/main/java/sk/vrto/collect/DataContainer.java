package sk.vrto.collect;

import java.util.UUID;

public class DataContainer {

    public static String data[];

    static {
        data = new String[CrudCommand.ITERATIONS];
        for (int i = 0; i < CrudCommand.ITERATIONS; i++) {
            data[i] = UUID.randomUUID().toString();
        }
    }

    private DataContainer() {}

}
