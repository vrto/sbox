package sk.vrto.collect.commands;

import sk.vrto.collect.CrudCommand;
import sk.vrto.collect.DataContainer;

import java.util.Collection;

public class DeleteCommand implements CrudCommand<String> {
    @Override
    public void execute(Collection<String> collection) {
        for (String data : DataContainer.data) {
            collection.remove(data);
        }

    }
}
