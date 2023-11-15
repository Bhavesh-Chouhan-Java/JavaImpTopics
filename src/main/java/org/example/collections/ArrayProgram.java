package org.example.collections;

import java.util.Arrays;
import java.util.List;

public class ArrayProgram {
    public static void main(String[] args) {

        System.out.printf("args : "+args.length);
        int[] array = {1,2,3,4,5};
        int[] array2 = new int[array.length];   //arr.length
        int[] a = new int[0];
        //array2(a); //compile time error

        System.out.println("Print : "+array.length);

        List<int[]> integerList = Arrays.asList(array2);    //create List
        List<int[]> list =  List.of(array2);                //create List
        String string = Arrays.toString(array);             //create String

        for(int i = 0 ; i < array.length ;i++){
            System.out.println("array : "+array[i]);
            array2[i] = array[i];
        }

        for(int i = 0 ; i < array2.length ;i++){
            System.out.println("array2 : "+array2[i]);
        }

        System.out.println("string : "+string);


    }

    private static void aPrint(int[] a){
        System.out.println("Print : "+a.length);
    }
}
