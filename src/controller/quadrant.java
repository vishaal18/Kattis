

package controller;


import java.util.Scanner;

public class quadrant {

    static void quad(int x, int y)
    {
        if (x > 0 && y > 0)
            System.out.println("1");

        else if (x < 0 && y > 0)
            System.out.println("2");

        else if (x < 0 && y < 0)
            System.out.println("3");

        else
            System.out.println("4");


    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
              int  x = sc.nextInt();
              int  y = sc.nextInt();
              quad(x, y);

    }
}