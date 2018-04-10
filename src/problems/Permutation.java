package problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        String str="ABC";
        char ch[]=str.toCharArray();
        int i=0;int n=str.length()-1;
        permuatation(ch,i,n);
         }

         public static void permuatation(char st[],int i,int n)
         {
          if(i==n){
              System.out.println(st);
          }
          else{
              for(int j=i;j<=n;j++){
                  swap(st,i,j);
                  permuatation(st,i+1,n);
                  swap(st,i,j);
              }
          }
         }
         public static void swap(char st[],int i,int j)
         {
             char temp='\0';
             temp=st[i];
             st[i]=st[j];
             st[j]=temp;

         }


}
