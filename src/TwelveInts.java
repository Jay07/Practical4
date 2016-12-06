/**
 * Created by Jay on 12/6/2016.
 */
public class TwelveInts
{
    public static void main(String[] args)
    {
        int[] Num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        for (int i = 0; i < Num.length; i++)
            System.out.print(Num[i] + " ");
        System.out.println();
        for (int i = Num.length - 1; i >= 0; i--)
            System.out.print("" + Num[i] + " ");
    }
}
