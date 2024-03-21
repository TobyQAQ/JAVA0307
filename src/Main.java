
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
/*
        System.out.print("Hello,World!");
//========================================================

        int a = 5;

        float b = 0.5f;

        char c = 'j';
        char[] java ={'j','a','v','a'};

        String string = "string";

        boolean d = false;

//========================================================

        int age = 15;

        float GPA = 3.5f;

        String name = "Toby";

        boolean att = true;

//========================================================

        System.out.println("你叫甚麼名字？");
        Scanner name = new Scanner(System.in);
        String b = name.nextLine();
        System.out.println(b);

//========================================================

        System.out.println("請輸入1-10中的一個整數");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        if(n<5)
        {
            System.out.println("數字小於五");
        }
        else
        {
            System.out.println("數字大於等於五");
        }
//========================================================
*/
        System.out.println("請輸入1-10中的一個整數");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        if(n<3)
        {
            System.out.println("數字小於三");
        }
        else if (n<7)
        {
            System.out.println("數字介於三跟七之間");
        }
        else
        {
            System.out.println("數字大於等於七");
        }


    }

}