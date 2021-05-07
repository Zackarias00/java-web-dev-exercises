package org.launchcode.java.demos.lsn2controlflowandcollections;
import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(4);
        integers.add(3);
        integers.add(1);
        integers.add(5);
        integers.add(7);
        integers.add(4);
        integers.add(9);
        integers.add(9);
        integers.add(6);
        int sum = 0;
        for(Integer num:integers){
            if(num%2==0) {
                sum += num;
            } else {}
        }
        System.out.println(sum);

    }

    public static void letterCheck(ArrayList<String> arr){
        ArrayList<String> listOfWords = new ArrayList<>();
        listOfWords.add("this");
        listOfWords.add("is");
        listOfWords.add("a");
        listOfWords.add("really");
        listOfWords.add("big");
        listOfWords.add("list");
        listOfWords.add("of");
        listOfWords.add("REALLY");
        listOfWords.add("BIG");
        listOfWords.add("WORDS");
        for(String words:listOfWords){
            if(words.length()>4){
                System.out.println(words);
            } else {}
        }
    }
}
