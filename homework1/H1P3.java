package homework1;
import java.util.Scanner;

public class H1P3 {
    public static boolean CheckPalindrome(String temp) {
        String str=temp.toLowerCase();

        for(int i=0, j=str.length()-1; i<j ; i++,j--)
        {
            if(str.charAt(i)!=str.charAt(j))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String to Check: ");
        String str=sc.nextLine();

        if(CheckPalindrome(str))
            System.out.println("String is Palindrome!!");
        else
            System.out.println("String is Not Palindrome!!");

    }
}
