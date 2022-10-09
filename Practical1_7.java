/*
 * Created By:- Nishkumar Patel
 * Id:- 21CE102
 * Aim:- Create a generic method for sorting an array of Comparable objects.
 * Github Repository Link:- https://github.com/NishPatel1/21CE102_Java_Part7.git
 */

import java.util.*;

public class Practical1_7 {

    public static <E extends Comparable<? super E>> void sortArray(E[] array){
        int size = array.length;
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(array[j].compareTo(array[j+1])>0){
                    E temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (E e : array) {
            System.out.print(e + " ");
        }
    } 

    public static void main(String[] args) {
        Integer[] intArray = {4,23,6,2,3,6,7,3};
        Double[] doubleArray = {2.4,5.3,6.43,5.5,3.3,56.7,3.5};
        Character[] charArray = {'b','g','f','y','s','t','a'};

        System.out.print("Sorted interger array: ");
        sortArray(intArray);

        System.out.print("\nSorted double array: ");
        sortArray(doubleArray);

        System.out.print("\nSorted character array: ");
        sortArray(charArray);
    }
}
