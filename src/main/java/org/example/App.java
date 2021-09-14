package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yussef Abdelbary
 */
public class App 
{
    public static void main( String[] args )
    {
       System.out.println("Please enter the number of the month");
        Scanner sc = new Scanner(System.in);
        int month = Integer.parseInt(sc.nextLine());
        String res = "The name of the month is ";
        switch(month){
            case 1:
                res = res + "January.";
                break;
            case 2:
                res = res + "February.";
                break;
                case 3:
                    res = res + "March.";
                    break;
            case 4:
                res = res + "April.";
                break;
            case 5:
                res = res + "May.";
                break;
            case 6:
                res = res + "June";
                break;
            case 7:
                res = res + "July.";
                break;
            case 8:
                res = res + "august.";
                break;
            case 9:
                res = res + "September";
                break;
            case 10:
                res = res + "October";
                break;
            case 11:
                res = res + "November";
                break;
            case 12:
                res = res + "December";
                break;
            default: res = "Number of month does not exist.";
            break;
        }
        System.out.println(res);
    }
}
