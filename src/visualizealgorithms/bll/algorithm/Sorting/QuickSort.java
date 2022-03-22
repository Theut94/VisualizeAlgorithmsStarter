package visualizealgorithms.bll.algorithm.Sorting;

import visualizealgorithms.bll.algorithm.AlgorithmType;
import visualizealgorithms.bll.algorithm.GenericAlgorithm;

public class QuickSort extends GenericAlgorithm {

    public QuickSort() {
        super("Quick Sort", "Fast sorting type O(N(log N)) ? ", AlgorithmType.SORTING);
    }

    @Override
    public void doWork() {
        int[] b = (int[]) super.getData();
        int begin = 0;
        int end = b.length-1;
       quickSort(b, begin,end);


    }
    private void quickSort(int[] arr, int begin, int end )
    {
        if(begin < end)
        {
            int partitionIndex = Partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);

        }
    }
    private int Partition(int[] arr, int begin, int end)
    {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;

    }
}
