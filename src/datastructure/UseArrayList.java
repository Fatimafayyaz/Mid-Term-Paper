package datastructure;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<Integer> list = new ArrayList<Integer>();

		/*how elements should be added to the array list*/
		list.add(50);
		list.add(10);
		list.add(40);
		list.add(30);
		list.add(90);

		/* Displaying array list elements */
		System.out.println("Currently the array list has following elements:"+list);

		/*Add element at the given index*/
		list.add(100);
		System.out.println("Current array list after adding one element is:"+list);
		/*Remove elements from array list like this*/
		list.remove(4);
		System.out.println("Current array list after removal of index 4 element is:"+list);
		list.add(20);
		System.out.println("Current array list after adding new item is:"+list);
		System.out.println("Iterator");
		Iterator<Integer> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.print("\t"+iter.next());
		}

		/* Sort statement*/
		Collections.sort(list);

		/* Sorted List*/
		System.out.println("\nAfter Sorting:");
		for(Integer counter: list){
			System.out.println(counter);
		}

		ConnectDB connectDB = new ConnectDB();
       connectDB.insertDataFromMyArrayToMySql(list,"array_sort","SortingNumbers");

	}

}
