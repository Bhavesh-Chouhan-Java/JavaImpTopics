package org.example.datatypes;

public class CharacterProgram {

    public static void main(String[] args) {

        String string = "Bhavesh";

        char[] ch = string.toCharArray();

        System.out.println(""+ch[0]);

        for(int i = 0 ; i < string.length() ; i++){

            System.out.println("char : "+string.charAt(i));

        }





    }

}
