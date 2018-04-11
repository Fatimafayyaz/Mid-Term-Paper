package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<Integer> queue = new LinkedList<>();
		System.out.println(queue.peek()); //peek function returns null value if their is no element in queue.
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);

		System.out.println(queue.peek()); //peek function returns first element if their is no element in queue.
		System.out.println(queue);//print all existing elements of queue
		queue.remove(20); //remove element 20 from queue
		System.out.println(queue);//print elements of queue
		System.out.println(queue.poll());//print current first element in queue.
		System.out.println(queue.peek()); //peek function returns null value if their is no element in queue.
		for(int i=60;i<=100;i+=10)
		{
			System.out.print("\t"+queue.add(i));
		}
		//System.out.println(queue);//print elements of queue
		System.out.println();
		for(Integer it:queue){
			System.out.print("\t"+it);
		}
		System.out.println();
		Iterator<Integer> it = queue.iterator();
		while(it.hasNext()) {
			System.out.print("\t"+it.next());
		}

	}




}


