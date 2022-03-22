package visualizealgorithms.bll.algorithm.Searching;

import visualizealgorithms.bll.algorithm.AlgorithmType;
import visualizealgorithms.bll.algorithm.GenericAlgorithm;
import visualizealgorithms.bll.algorithm.IAlgorithm;

public class LinearSearch extends GenericAlgorithm {

    public LinearSearch() {
        super("Linear Search", "O(N) Search", AlgorithmType.SEARCHING);
    }

    @Override
    public void doWork() {
        int[] b = (int[]) super.getData();
        int wanted = b[b.length-1]; //worst case
        for( int i : b)
        {
            if(i == wanted)
            {
                break;
            }
        }
    }
}
