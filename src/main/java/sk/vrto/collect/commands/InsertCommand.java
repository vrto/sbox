package sk.vrto.collect.commands;

import sk.vrto.collect.CrudCommand;
import sk.vrto.collect.DataContainer;

import java.util.Collection;

public class InsertCommand implements CrudCommand<String> {

    @Override
    public void execute(Collection<String> collection) {
        for (int i = 0; i < ITERATIONS; i++) {
            collection.add(DataContainer.data[i]);
        }
    }

}
