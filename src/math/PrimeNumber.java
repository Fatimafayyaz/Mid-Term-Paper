package math;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		int j,counter=0;
		for (int num = 2; num < 100; num++) {

			for ( j = 2; j < num; j++) {
				if (num % j == 0)
					break;
				else
					continue;
			}
			if(num==j){
				counter++;
				System.out.print(num + " ");}
		}
		System.out.println("\ntotal prime number up to 100 are : "+ counter);



	}

}
