package be.eleonore.wiheries;

import io.aos.console.AosConsole;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SortedList {

    private static final List<Integer> ints = new ArrayList<Integer>();
    private static final Random random = new Random();

    public static void main(String[] args) {

        feed(10);
        print("initial list");
        sort();
        print("sorted list");

    }

    private static void feed(int counts) {
        while (counts != 0) {
            ints.add(random.nextInt(50));
            counts--;
        }
    }

    private static void print(String s) {
        AosConsole.println(s + ": " + ints);
    }

    private static void sort() {
        Collections.sort(ints);
    }

}
