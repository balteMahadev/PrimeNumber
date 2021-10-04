import java.util.Scanner;

public class CheckPrimeOrNot
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int Number = sc.nextInt();
        boolean prime = true;
        int i = 2;
        while (i<Number)
        {
            if(Number % i == 0)
            {
                prime = false;
                System.out.println(Number+" is not a prime number");
                break;
            }
            i++;
        }
        if (prime==true)
        {
            System.out.println(Number+" is a prime Number");
        }


    }
}
