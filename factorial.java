import java.util.Scanner;

public class factorial {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int factNum=sc.nextInt();
        int fact=1;
        int i;
        for( i=1;i<=factNum;i++)
            fact=fact*i;
        System.out.println("Factorial of "+factNum+" is "+fact);
    }
}
