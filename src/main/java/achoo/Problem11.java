package achoo;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 John Kelleher
 */
public class Problem11 {
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
        double eu = a.nextDouble();
        System.out.print("what is the exchange rate? ");
        double ex = a.nextDouble();
        double us = Math.round((eu*ex)*100)/(double)100;
        System.out.println(eu+" euros at an exchange rate of "+ex+" is "+us+" us dollars");
    }
}
