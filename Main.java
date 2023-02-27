package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Task1 myObject = new Task1();
        Random myMyObject = new Random();

        int numm =myMyObject.nextInt(10);
        ArrayList<Integer> list = myObject.generateArray(10, 15);
        ArrayList<Integer> list2 = Task1.checker(list);
        System.out.println(list2);
    }
}