package algorithm;

import org.testng.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] expectedSortedArray =   {0,1,2,4,5,6,9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        int actualSortedArray[]=sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(expectedSortedArray, actualSortedArray, "Array is not Sorted");
            System.out.println("selection sort passed");

        }catch(Exception ex){
            ex.getMessage();
        }
       // -----------------------------------------------------------------------------------
       //verify if the unsorted array is sorted by the insertion sort algorithm.
         actualSortedArray=sort.insertionSort(unSortedArray);
        try {
            Assert.assertEquals(expectedSortedArray, actualSortedArray, "Array is not Sorted");
            System.out.println("Insertion sort passed");

        }catch(Exception ex){
            ex.getMessage();
        }
        // -----------------------------------------------------------------------------------
        //verify if the unsorted array is sorted by the bubble sort algorithm.

        actualSortedArray=sort.bubbleSort(unSortedArray);
        try {
            Assert.assertEquals(expectedSortedArray, actualSortedArray, "Array is not Sorted");
            System.out.println("bubble sort passed");

        }catch(Exception ex){
            ex.getMessage();
        }

        // -----------------------------------------------------------------------------------
        //verify if the unsorted array is sorted by the quick sort algorithm.

        actualSortedArray=sort.quickSort(unSortedArray);

        try {
            Assert.assertEquals(expectedSortedArray, actualSortedArray, "Array is not Sorted");
            System.out.println("quick sort passed");

        }catch(Exception ex){
            ex.getMessage();
        }
        // -----------------------------------------------------------------------------------
        //verify if the unsorted array is sorted by the heap sort algorithm.

        actualSortedArray=sort.heapSort(unSortedArray);

              try {
            Assert.assertEquals(expectedSortedArray, actualSortedArray, "Array is not Sorted");
                  System.out.println("heap sort passed");

        }catch(Exception ex){
            ex.getMessage();
        }

        // -----------------------------------------------------------------------------------
        //verify if the unsorted array is sorted by the shell sort algorithm.

        actualSortedArray=sort.shellSort(unSortedArray);
        try {
            Assert.assertEquals(expectedSortedArray, actualSortedArray, "Array is not Sorted");
            System.out.println("shell sort passed");

        }catch(Exception ex){
            ex.getMessage();
        }
        actualSortedArray=sort.mergeSort(unSortedArray);
        //verify if the unsorted array is sorted by the merge sort algorithm.
        try {
            Assert.assertEquals(expectedSortedArray, actualSortedArray, "Array is not Sorted");
            System.out.println("merge sort passed");

        }catch(Exception ex){
            ex.getMessage();
        }
        // -----------------------------------------------------------------------------------
        //verify if the unsorted array is sorted by the bucket sort algorithm.

        actualSortedArray=sort.bucketSort(unSortedArray);
        try {
            Assert.assertEquals(expectedSortedArray, actualSortedArray, "Array is not Sorted");
            System.out.println("bucket sort passed");

        }catch(Exception ex){
            ex.getMessage();
        }
        //Now do for rest of the algorithm...................below


    }
}
