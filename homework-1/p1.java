import java.util.*;

class Solution {

    static void patternOne(int n) {
        int a = 1, b = 4, c = 7;
        int nextNumber = a + b + c;
        if(n == 1) {
            System.out.print(a+" ");    
        }

        if( n == 2 ){
            System.out.print(a+" "+b+" ");
        }
        if(n >= 3) {
            System.out.print(a+" "+b+" "+c+" ");
        }
        for(int i=3; i<n ;i++) {
            System.out.print(nextNumber + " ");
            a = b;
            b = c;
            c = nextNumber;
            nextNumber = a + b + c;
        }
        System.out.println();
    }

    static void patternTwo(int n) {
        for(int i=1;i<=n;i++){
            if(i%4 == 0){
                n++;
                continue;
            }
            System.out.print(i*i + " ");
        }
        System.out.println();
    }

    static void patternThree(int n) {
        int prevNumber = 1, nextNumber;
        System.out.print(prevNumber +" ");
        for(int i=1; i<n; i++){
            if(i % 3 == 0){
                n++;
                continue;
            }
            else {
                nextNumber = prevNumber + 4*(i-1) ;
                System.out.print(nextNumber + " ");
                prevNumber = nextNumber;
            }
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        patternOne(n);
        patternTwo(n);
        patternThree(n);
    }
}