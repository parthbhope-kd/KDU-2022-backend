import java.util.*;

class Solution {

    static boolean isDivisbleByThree(int n) {
        int sum = 0;
        while(n > 0){
            sum += n%10;
            n/=10;
        }
        return sum%3 == 0;   
    }


    static void printSequence(int n) {
        for(int i = 1 ; i <= n; i++ ) {
            if(isDivisbleByThree(i)){
                System.out.print(i+" ");
            }
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printSequence(n);
    }
}