package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by mrahman on 04/22/17.
 */
//import java.lang.String;
public class DuplicateWord {

    private static String str;
     static int length;

    public static void main(String[] args) throws Exception {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        int noOfChar=st.length();
        System.out.println("Number of charaters in string:- "+noOfChar);
        String words[] = st.split(" ");
        Map<String, Integer> wordsMap = new HashMap<String, Integer>();
        for (String str : words) {
            Integer val=wordsMap.get(str);
            if(val != null)
            {
                wordsMap.put(str, wordsMap.get(str) + 1);
                length=words.length;

                    }
            else{
                wordsMap.put(str, 1);length=words.length; }

                        }
         System.out.println("total number of  words in a string: "+length);
            Set<String> str2=wordsMap.keySet();
            for (String str:str2) {
                if(wordsMap.get(str)>1) {  //only shows repeated words
                    System.out.println("Duplicate Words are :  " + str + "    repeated  " + wordsMap.get(str) + "  Times");
                }
            }

        int sum=0;
        for(int i=0;i<words.length;i++){
            sum=sum+words[i].length();
        }
        double avg= sum/(double)length;
        System.out.println("sum of length of words of string: -"+sum+"\naverage length of words in string:- "+avg);
        }

    }
