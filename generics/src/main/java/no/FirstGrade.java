package no;

import java.util.TreeSet;


public class FirstGrade {

    public static void main(String[] args) {
        TreeSet<Integer> treeSeth = new TreeSet<Integer>();
        TreeSet<Dog> allDog = new TreeSet<Dog>();

        treeSeth.add(1);
        treeSeth.add(2);
        treeSeth.add(1);


        allDog.add(new Dog(1));
        allDog.add(new Dog(1));
        allDog.add(new Dog(1));
        allDog.add(new Dog(2));

        System.out.println("allDog = " + allDog.size());
        System.out.println("treeSeth = " + treeSeth.size());
    }
}

class Dog implements Comparable {
    int sise;

    Dog(int sise) {
        this.sise = sise;
    }

    public int compareTo(Object o) {

        if (((Dog) o).sise == this.sise) {
            return 1;
        }
        return 0;
    }


}


