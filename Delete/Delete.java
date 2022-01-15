package Algorithm.Delete;

import java.util.Scanner;


class Delete 
{
    static int Array[],looper,Limiter,Target;
    static Scanner scanf = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("Input the limiter:");
        Limiter = scanf.nextInt();
        Array = new int[Limiter];
        for(looper = 0; looper < Limiter; looper++)
        {
            Array[looper]= scanf.nextInt();

        }
        System.out.println("Array list");
        for(looper = 0; looper < Limiter; looper++)
        {
            System.out.println(Array[looper]);
        }
        System.out.println("Input the Delete array");
        Target = scanf.nextInt();   
        for(looper = Target; looper < Limiter-1;looper++)
        {
            Array[looper] = Array[looper+1];
        }
        System.out.println("After Delete\n");
        Limiter -=1;
        for(looper = 0; looper < Limiter; looper++)
        {
            System.out.println(Array[looper]);
        }
    }
}
