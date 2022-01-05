


public class Series {
    public  static void main(String[] args) {
        isThreeMultiple(10);
        System.out.println(" ");
        series1(20);
        System.out.println(" ");
        series2(20);
        System.out.println(" ");
        series3(20);

    }

    static void isThreeMultiple(Integer n) {
        for(Integer i = 1; i < n; i++) {
            if(i%3 == 0){
                System.out.print(i);
                System.out.print(" ");
            }
        }

    }

    static void series1(Integer n) {
        Integer a = 1, b = 4, c = 7;
        while(n>=1) {
            System.out.print(a);
            System.out.print(" ");
            Integer temp = c;
            c = temp + a + b;
            a = b;
            b = temp;
            n -= 1;
        }
    }
    static void series2(Integer n) {
        for(Integer i = 1; i <= n; i++) {
            System.out.print(i*i);
            System.out.print(" ");
        }
    }

    static void series3(Integer n) {
        Integer k = 1, mul = 4;
        for(Integer i = 1; i <= n; i++) {

            System.out.print(k+mul);
            k += mul;
            mul *=2;
            System.out.print(" ");
        }
    }
}


