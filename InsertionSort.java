public class InsertionSort {

    // inplace insertion sort
    public static void insertionSort(int[] arr){

        // loop through array
        for (int i = 1; i < arr.length ; i++){

            // store curr in temp var
            int temp = arr[i];
            int j = i - 1;

            // shift elements greater than temp to the right
            while( j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j--;
            
            }

            // instert temp in correct position

            arr[j+1] = temp;
        }
    }
}