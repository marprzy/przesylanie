package com.MartaPrzybyl;

public class Main {

    public static void main(String[] args) {
        // write your code here

      boolean wyn;

    hasEqualSum(5,3,1);
    hasEgualSum(4,8);

        System.out.println("Jesli 1 to rok jest przestępny: " + areEqualThreeDecimalPlaces(1.433, 1.333));

    }

    public static boolean areEqualThreeDecimalPlaces(double number1, double number2)
    {
        number1 = number1*1000;
        number2 = number2*1000;

        int n1 = (int) number1;
        int n2 = (int) number2;

        if (n1==n2)
            return true;

        else
            return  false;
    }

    public static boolean hasEgualSum(int n1, int n2)
    {
        System.out.println("Skrocona metoda");
        return true;
    }

    public static boolean hasEqualSum( int first, int second, int third)
    {
        System.out.println("Druga metoda");
        if (first+second==third)

        {
            return true;
        } else
        return false;
    }

}
