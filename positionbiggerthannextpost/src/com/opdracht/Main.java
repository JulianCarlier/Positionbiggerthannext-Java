package com.opdracht;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    /***
     * je moet een methode maken dat een array van integers accepteert.
     * Deze methode moet de positie printen wanneer het volgende getal groter is dan het vorige getal.
     *
     * {10,2,5,6,3} -> position 2 en 3 moeten in dit geval geprint worden.
     * {8,7,6,3} -> nu niks want er is niks groter dan het vorige getal
     * {1,2,3,4,5} -> 1,2,3,4
     */
    public static void main(String[] args) {
        Integer numbers[] = {1,2,3,4,5} ;
        List<Integer> result = outputhigher2(numbers);
        System.out.print(result);
    }

    public static ArrayList<Integer> outputhigher(Integer[] numbers) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        for (int number = 1; number < numbers.length; number++){
            if(numbers[number] > numbers[number - 1]) {
                 myNumbers.add(number);
            }
        }
        return myNumbers;
    }

    public static ArrayList<Integer> outputhigher2(Integer[] numbers) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        for (int number = 0; number < numbers.length; number++){
            if(numbers[number] < numbers[number + 1]) {
                myNumbers.add(number + 1);
            }
            if (number + 1 == numbers.length -1) {
                 break;
            }
        }
        return myNumbers;

    }
}
