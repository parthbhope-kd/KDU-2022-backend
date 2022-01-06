import java.util.*;

class Solution {


    static boolean checkPallindrome(String s) {
        int len= s.length();
        String rev = "";

        for (int i = len-1; i >=0; --i) {
            rev = rev + s.charAt(i);
        }

        return s.toLowerCase().equals(rev.toLowerCase()) ; 
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(checkPallindrome(str)) {
            System.out.println(str+" is a Pallindrome");
        } else {
            System.out.println(str+" is not a Pallindrome");
        }
    }
}