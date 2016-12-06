/**
 * Created by Jay on 12/6/2016.
 */

import java.util.Scanner;

public class CountByAnything
{
    public static void main(String[] args)
    {
        final int End = 300;
        Scanner keyboard = new Scanner(System.in);
        int stepValue;
        System.out.print("Enter number:");
        stepValue = keyboard.nextInt();
        int NewLine = stepValue * 10;
        for(int i = stepValue; i <= End; i += stepValue)
        {
            System.out.print(i + "  ");
            if(i % NewLine == 0)
                System.out.println();
        }
    }
}
