package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LetterCheck {
    public static void main(String[] args){
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        ArrayList<String> myList  = new ArrayList<String>(Arrays.asList(sentence.split(" ")));

        Scanner input = new Scanner(System.in);
        System.out.println("What is the word length you would like to search for? ");
        int searchLength = input.nextInt();
        input.close();

        for(String words:myList){
            if(words.length()==searchLength){
                System.out.println(words);
            } else {}
        }
    }
}

