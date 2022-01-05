package homework1;
import java.util.*;

public class H1P2 {
    public static boolean CheckNum(int n) {
        int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n=n/10;
        }
        return (sum % 3 == 0) ? true : false;
    }
    public static void PrintNum(int n) {
        System.out.print("Numbers Divisible by 3 before "+n+" :");
        for(int i=1;i<=n;i++)
        {
            if(CheckNum(i))
                System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value of N: ");
        int num=sc.nextInt();
        PrintNum(num);

    }
}
