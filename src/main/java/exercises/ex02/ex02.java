package exercises.ex02;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erik Dokken
 */
public class ex02 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        ex02 example02 = new ex02();

        String in = example02.inputString();
        int lengthFunction = example02.lengthCounter(in);
        example02.printOutput(lengthFunction, in);
    }
    private String inputString(){
        System.out.print("What is the input string? ");
        String input = in.nextLine();
        return input;
    }

    private int lengthCounter(String input){
        int num = 0;
        for(int x = 0; x < input.length();x++)
        {
            if(input.charAt(x) != ' ');
            num++;
        }
        return num;
    }

    private void printOutput(int num, String in) {
        // output
        System.out.println(in + " has " + num + " characters");
    }
}
