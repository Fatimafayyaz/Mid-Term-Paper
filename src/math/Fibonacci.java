package math;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */
        int prev=0,curr=1,next=1;
        System.out.print(prev+" ");
        for(int i=1;i<=40;i++){
            System.out.print(next+ " ");
            next=curr+prev;
            prev=curr;
            curr=next;
        }




    }
}
