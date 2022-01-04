package homework1;
import java.util.*;

public class H1P1 {
    static HashMap<Integer,Integer> series1= new HashMap<>();

    public static int S1(int n) {
        if(n<4)
        {
            if(n==1)
                return 1;
            else{
                return (n==2) ? 4:7;
            }
        }
        else if(series1.containsKey(n))
            return series1.get(n);
        else
        {
            series1.put(n,S1(n-1)+S1(n-2)+S1(n-3));
            return series1.get(n);
        }
    }


    public static void Prints1(int n) {
        System.out.print("Series 1: ");
        for(int i=1;i<=n;i++)
        {
            if(i!=n)
                System.out.print(S1(i)+",");
            else
                System.out.println(S1(i));
        }
    }


    public static void Prints2(int n) {
        System.out.print("Series 2: ");
        for(int i=1;i<=n;i++)
        {
            if(i!=n)
                System.out.print(i*i+",");
            else
                System.out.println(i*i);
        }
    }

    public static void Prints3(int n) {
        int fir=1,sec=5;
        System.out.print("Series 3: "+fir+","+sec);
        for(int i=1;i<=n-2;i++)
        {
            int temp=12*i;
            if(i%2==0){
                sec+=temp;
                System.out.print(","+sec);
            }
            else{
                fir+=temp;
                System.out.print(","+fir);
            }

        }
    }

    public static void Printall(int n) {
        Prints1(n);
        Prints2(n);
        Prints3(n);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Value of N: ");
        int n=sc.nextInt();
        Printall(n);

    }
}
