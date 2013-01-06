package sk.vrto.collect;

import sk.vrto.collect.commands.FindCommand;
import sk.vrto.collect.commands.DeleteCommand;
import sk.vrto.collect.commands.InsertCommand;

import java.util.*;

public class CollectionsMain {

    protected static List<ResultTable<String>> results = new ArrayList<>();
    protected static PerformanceBenchmark benchmark = new PerformanceBenchmark();

    public static void main(String[] args) {

        benchmarkCollection(new ArrayList<String>());
        benchmarkCollection(new LinkedList<String>());
        benchmarkCollection(new Vector<String>());
        benchmarkCollection(new Stack<String>());

        benchmarkCollection(new HashSet<String>());
        benchmarkCollection(new LinkedHashSet<String>());
        benchmarkCollection(new TreeSet<String>());

        printResults(results);
    }

    private static void benchmarkCollection(Collection<String> col) {
        ResultTable<String> resultTable = new ResultTable<>(col);

        long insertTime = benchmark.perform(col, new InsertCommand());
        resultTable.setInsertTime(insertTime);
        long findTime = benchmark.perform(col, new FindCommand());
        resultTable.setFindTime(findTime);
        long deleteTime = benchmark.perform(col, new DeleteCommand());
        resultTable.setDeleteTime(deleteTime);

        results.add(resultTable);
    }

    private static void printResults(List<ResultTable<String>> results) {
        StringBuilder sb = new StringBuilder();
        String format = "%48s%12s%12s%12s\n";

        sb.append(String.format(format, "Collection name", "Insert", "Find", "Delete"));
        sb.append("\n");
        for (ResultTable<String> table : results) {
            String collectionName = table.getCollection().getClass().getName();
            sb.append(String.format(format, collectionName, table.getInsertTime(),
                    table.getFindTime(), table.getDeleteTime()));
        }

        System.out.println(sb.toString());
    }

}
