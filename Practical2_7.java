/*
 * Created By:- Nishkumar Patel
 * Id:- 21CE102
 * Aim:- Write a program that counts the occurrences of words in a text and displays the words 
 * and their occurrences in alphabetical order of the words. Using Map and Set Classes.
 * Github Repository Link:- https://github.com/NishPatel1/21CE102_Java_Part7.git
 */

import java.util.*;

public class Practical2_7 {
    public static void main(String[] args) {
        String str = "This is a java a code using code Map and Set Collection java class";
        String s[] = str.split(" ");
        SortedMap<String,Integer> string = new TreeMap<String, Integer>();
        SortedSet<String> sa = new TreeSet<String>();
        for (String string2 : s) {
            sa.add(string2);
        }
        Iterator i = sa.iterator();
        while(i.hasNext()){
            int count = 0;
            String a = (String)i.next();
            for(int j=0;j<s.length;j++){
                if(a.equals(s[j])){
                    count++;
                }
            }
            string.put(a, count);
        }
        System.out.println(string);
    }
}
