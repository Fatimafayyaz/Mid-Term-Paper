package algorithm;

import databases.ConnectDB;

import java.util.List;
import java.util.Random;

/*
 *Created by mrahman on 04/02/2018.
 */
public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */
   /*i will check the conclusion after running all for 1000000 data and quick sort and heap sort have less execution time
	   so these are better for given set of data */
	public static void main(String[] args) throws Exception {
		
		int [] num = new int[10];
		storeRandomNumbers(num);
		ConnectDB connectDB = new ConnectDB();
		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        connectDB.insertDataFromArrayToMySql(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectDB.readDataBase("selection_sort", "SortingNumbers");
        printValue(numbers);
		int n = num.length;
		randomize (num, n);
		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
		connectDB.insertDataFromArrayToMySql(num, "Insertion_sort", "SortingNumbers");
		List<String> numbers1 = connectDB.readDataBase("Insertion_sort", "SortingNumbers");
		printValue(numbers1);
		 n = num.length;
		randomize (num, n);
		//bubble sort
		 algo.bubbleSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in bubble Sort take: " + bubbleSortExecutionTime + " milli sec");
		connectDB.insertDataFromArrayToMySql(num, "bubble_sort", "SortingNumbers");
		List<String> numbers2 = connectDB.readDataBase("bubble_sort", "SortingNumbers");
		printValue(numbers2);
		 n = num.length;
		randomize (num, n);
		//merge sort logic

		algo.mergeSort(num);
		long mergeSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in merge Sort take: " + mergeSortExecutionTime + " milli sec");
		connectDB.insertDataFromArrayToMySql(num, "merge_sort", "SortingNumbers");
		List<String> numbers3 = connectDB.readDataBase("merge_sort", "SortingNumbers");
		printValue(numbers3);
		 n = num.length;
		randomize (num, n);

		//quick sort algo logic
		algo.quickSort(num);
		long quickSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in quick Sort take: " + quickSortExecutionTime + " milli sec");
		connectDB.insertDataFromArrayToMySql(num, "quick_sort", "SortingNumbers");
		List<String> numbers4 = connectDB.readDataBase("quick_sort", "SortingNumbers");
		printValue(numbers4);
		n = num.length;
		randomize (num, n);
		//heap sort logic

		algo.heapSort(num);
		long heapSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in heap Sort take: " + heapSortExecutionTime + " milli sec");
		connectDB.insertDataFromArrayToMySql(num, "heap_sort", "SortingNumbers");
		List<String> numbers5 = connectDB.readDataBase("heap_sort", "SortingNumbers");
		printValue(numbers5);
		n = num.length;
		randomize (num, n);

		//bucket sort logic
		algo.bucketSort(num);
		long bucketSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in bucketSort take: " + bucketSortExecutionTime + " milli sec");
		connectDB.insertDataFromArrayToMySql(num, "bucket_sort", "SortingNumbers");
		List<String> numbers6 = connectDB.readDataBase("bucket_sort", "SortingNumbers");
		printValue(numbers6);
		n = num.length;
		randomize (num, n);

		algo.shellSort(num);
		long shellSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in shellSort take: " + shellSortExecutionTime + " milli sec");
		connectDB.insertDataFromArrayToMySql(num, "shell_sort", "SortingNumbers");
		List<String> numbers7 = connectDB.readDataBase("shell_sort", "SortingNumbers");
		printValue(numbers7);
		n = num.length;
		randomize (num, n);
		//By following above, Continue for rest of the Sorting Algorithm....

		//Come to conclusion about which Sorting Algo is better in given data set.


	}

	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(10);
		}
	}

	public static void randomize( int arr[], int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.println(st);
		}
	}
}
