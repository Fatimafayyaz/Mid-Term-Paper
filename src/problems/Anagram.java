package problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String str1="Army";
        String str2="Mry";
        if(areAnagrams(str1,str2)==true)
        System.out.println("String1: "+str1+"\tstring2: "+str2+" \tare anagrams");
        else
            System.out.println("String1: "+str1+"\tstring2: "+str2+" \tare not anagrams");

         }
        public static boolean areAnagrams(String s1,String s2){

        s1=s1.toLowerCase();   //u can also convert both in uppercase bec for comparing there is different values for upper and lower case
        s2=s2.toLowerCase();
        char s1_char[]=s1.toCharArray();//convert string s1 into array of characters
        char s2_char[]=s2.toCharArray();//convert string s2 into array of characters
            Arrays.sort(s1_char);  //it sorts first char array
            Arrays.sort(s2_char);  //it sorts second charater array
           return Arrays.equals(s1_char,s2_char); //this built-in function compares two char arrays
        }


}
