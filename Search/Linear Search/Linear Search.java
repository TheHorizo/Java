import java.sql.Time;
import java.util.Scanner;
import java.util.concurrent.TimeoutException;

class LinerSearch{
    static int Array[], Search, NumOfTime,CounOfTime,TimeOfLoop,Target;
    static Scanner scanf = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("Enter The Limit of Number");
        NumOfTime = scanf.nextInt();
        Array = new int[NumOfTime];
        for(TimeOfLoop = 0; TimeOfLoop < NumOfTime; TimeOfLoop++)
        {
            System.out.printf("Number: %d\n",TimeOfLoop+1);
            Array[TimeOfLoop] = scanf.nextInt();

        }
        Target = scanf.nextInt();
        //Linear Search
        for(TimeOfLoop = 0; TimeOfLoop < NumOfTime; TimeOfLoop++)
        {
            if(Array[TimeOfLoop] == Target)
            {
                System.out.println("Located at"+(TimeOfLoop+1));
                break;
            }
        }
    }
}
