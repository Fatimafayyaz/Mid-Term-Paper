package math;

public class MakePyramid {
    public static void main(String[] args) {

        //   Implement a large Pyramid of stars in the screen with java.
        //
        //                    *
        //                   * *
        //                  * * *
        //                 * * * *
        //                * * * * *
        //               * * * * * *

        //Start Here

        for(int i=1;i<=6;i++)
        {
            for(int space=1;space<=6-i;space++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println("\n");
        }



         }
  }
