package no;

import java.util.Arrays;
import java.util.Comparator;


public class GeoCache {
    public static void main(String[] args) {

        String[] stringArray = {"map", "marple", "key"};
        Othello othello = new Othello();
        Arrays.sort(stringArray, othello);

        for (String stringObject : stringArray) {
            System.out.println("stringObject = " + stringObject);
            System.out.println("binary for  " + Arrays.binarySearch(stringArray, stringObject, othello));
        }
    }


    static class Othello implements Comparator<String> {
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);
        }
    }
}
