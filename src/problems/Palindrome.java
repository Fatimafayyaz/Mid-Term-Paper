package problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String str="Madam";
        String revStr="";
        str=str.toUpperCase();// make string case insensitive
        System.out.println("Actual string is :-  "+ str);//print actual string
        char ch[]=str.toCharArray();

        for(int i=ch.length-1;i>=0;i--){  //this loop reverse the given string
           revStr=revStr+ch[i];
        }
        System.out.println("Reverse string is :-  "+ revStr);//print reverse string
        if(str.equals(revStr))
            System.out.println("strings are palindrome");
        else
            System.out.println("strings are not palindrome");

    }
}
