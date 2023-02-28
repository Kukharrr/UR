package org.example;

import java.util.ArrayList;
import java.lang.Math;
import java.util.Random;


public class Task1 {
    Random random = new Random();
    public Task1() {
    }

    public ArrayList<Integer> generateArray(int len, int max ){
        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i = 0; i <= len; i++){
            int rand = random.nextInt(max);
            numbers.add(rand);
            System.out.println(i);
        }
        return numbers;
    }
    public static ArrayList<Integer> checker(ArrayList<Integer> lst){
        ArrayList<Integer> qwerty = new ArrayList<>();
        for (int i : lst) {
            if (i % 14 == 0){
                qwerty.add(i);
            }
        }
        System.out.println(qwerty);
        return lst;



    }
}

