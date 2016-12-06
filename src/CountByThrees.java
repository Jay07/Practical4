/**
 * Created by Jay on 12/6/2016.
 */
public class CountByThrees
{
    public static void main(String[] args)
    {
        final int x = 3;
        final int End = 300;
        for(int i = 3; i <= End; i += 3)
        {
            System.out.print(i + "  ");
            if(i % 30 == 0)
                System.out.println();
        }
    }
}
