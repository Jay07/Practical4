/**
 * Created by Jay on 12/6/2016.
 */
public class ArrayMethodDemo
{
    public static void main(String[] args)
    {
        int[] Num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int Limit = 7;
        display(Num);
        displayReverse(Num);
        displaySum(Num);
        displayLimit(Num, Limit);
        displayHigherThanAverage(Num);
    }
    public static void display(int[] Num)
    {
        System.out.print("Normal Order: ");
        for (int i = 0; i < Num.length; i++)
            System.out.print(Num[i] + " ");
        System.out.println();
    }
    public static void displayReverse(int[] Num)
    {
        System.out.print("Reverse Order: ");
        for (int i = Num.length - 1; i >= 0; i--)
            System.out.print("" + Num[i] + " ");
        System.out.println();
    }
    public static void displaySum(int[] Num)
    {
        int Sum = 0;
        for (int i = 0; i < Num.length; i++)
            Sum += Num[i];
        System.out.println("Sum: " + Sum);
    }
    public static void displayLimit(int[] Num, int Limit)
    {
        System.out.print("Values below " + Limit + ": ");
        for (int i = 0; i < Num.length; i++)
            if (Num[i] < Limit)
                System.out.print(Num[i] + " ");
        System.out.println();
    }
    public static void displayHigherThanAverage(int[] Num)
    {
        int Sum = 0;
        for (int i = 0; i < Num.length; i++)
            Sum += Num[i];
        double Average = Sum * 1.0 / Num.length;
        System.out.println("Average: " + Average);
        System.out.print("Values above average: ");
        for (int i = 0; i < Num.length; i++)
            if (Num[i] > Average)
                System.out.print(Num[i] + " ");
        System.out.println();
    }
}
