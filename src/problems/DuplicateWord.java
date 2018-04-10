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

    public static void main(String[] args) throws Exception {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */
         int counter=0;
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        String words[] = st.split(" ");
        Map<String, Integer> wordsMap = new HashMap<String, Integer>();
        for (String str : words) {
            //str.length()
            Integer val=wordsMap.get(str);
            if(val != null)
            {
                wordsMap.put(str, wordsMap.get(str) + 1); counter++;}
            else{
                wordsMap.put(str, 1); counter++;}

                        }

        //System.out.println("number of words: "+counter+"\tAverage length of words"+counter);
            Set<String> str2=wordsMap.keySet();
            for (String str:str2) {
                if(wordsMap.get(str)>1) {  //only shows repeated words
                    System.out.println("Words are :  " + str + "    repeated  " + wordsMap.get(str) + "  Times");
                }
            }

            
        }

    }
