package math;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		for(int i=101;i>0;)
		{
			if(i<=101&&i>90){ i=i-1;
				System.out.print(i+" ");}
			else if(i<=90&&i>70){ i=i-2;
				System.out.print(i+" ");}
			else if(i<=70&&i>40){ i=i-3;
				System.out.print(i+" ");}
			else { i=i-4; System.out.print(i+" ");}

		}





	}
}
