package com.Lord;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double sum=0;
        System.out.println("please enter your phrase:");
        Scanner scanner=new Scanner(System.in);
        String phrase=scanner.next();
        String[] strings=phrase.split("\\+");

        for (String str: strings) {
            System.out.println(str);
           sum+= Double.parseDouble(str);
        }
        System.out.println("sum is :"+sum);
    }
}
