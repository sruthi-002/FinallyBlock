package com.company;
import java.util.Scanner;
class trycatch
{
    public  static void trycatchex()
    {
        int n;
        float avg;
        int sum;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        sum =in.nextInt();
        try {
            avg = sum/n;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Please enter the valid number");
        }
        finally{
            System.out.println("You have an another chance");
            n = in.nextInt();
            sum= in.nextInt();
            avg = sum/n;
            System.out.println("The average is"+" "+avg);
        }
    }
}
public class Main {

    public static void main(String[] args) {
        trycatch n = new trycatch();
        n.trycatchex();
    }
}
