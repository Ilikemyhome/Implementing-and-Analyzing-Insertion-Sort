
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class testInsertionSort {
  @Test
    public void testSmallArray() {
        int[] arr = {5, 2, 9, 1, 5};
        int[] expected = {1, 2, 5, 5, 9};

        InsertionSort.insertionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int[] expected = {};

        InsertionSort.insertionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSingleElement() {
        int[] arr = {42};
        int[] expected = {42};

        InsertionSort.insertionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testReversedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};

        InsertionSort.insertionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testNearlySortedArray() {
        int[] arr = {1, 2, 3, 4, 0};
        int[] expected = {0, 1, 2, 3, 4};

        InsertionSort.insertionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testLargeRandomArray() {
        int[] arr = generateRandomArray(5000);
        int[] expected = Arrays.copyOf(arr, arr.length);
        Arrays.sort(expected);

        InsertionSort.insertionSort(arr);
        assertArrayEquals(expected, arr);
    }


    private int[] generateRandomArray(int size) {
        Random r = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = r.nextInt(10000);
        return arr;
    }


}