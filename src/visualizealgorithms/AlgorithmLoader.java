package visualizealgorithms;

//Project imports
import visualizealgorithms.bll.algorithm.IAlgorithm;
import visualizealgorithms.bll.algorithm.Searching.LinearSearch;
import visualizealgorithms.bll.algorithm.Sorting.MergeSort;
import visualizealgorithms.bll.algorithm.Sorting.QuickSort;
import visualizealgorithms.bll.algorithm.Sorting.TimSort;

//Java imports
import java.util.ArrayList;

/**
 * Convenience class that adds algorithms and handles inputs
 */
public class AlgorithmLoader {

    private String inputs = "";
    private ArrayList<IAlgorithm> algorithms = new ArrayList<>();

    public AlgorithmLoader() {
        //Modify default inputs
        inputs = "1000;2000;4000;8000;16000;32000;64000;128000;256000;512000;1024000;2048000";

        //Add implemented/selected algorithms here..
        algorithms.add( new LinearSearch());
        algorithms.add(new QuickSort());
        algorithms.add(new MergeSort());
        algorithms.add(new TimSort());

        //more algorithms here :)
    }

    public String getInputs() {
        return inputs;
    }

    public ArrayList<IAlgorithm> getAlgorithms() {
        return algorithms;
    }
}
