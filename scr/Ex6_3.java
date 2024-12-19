import java.util.Scanner;

public class Ex6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        System.out.println("tong n: "+sumN(n));
        System.out.println("tong n^2: "+sumNPow2(n));
        System.out.println("tong 1/n: "+sumNChia2(n));
        System.out.println("tong 1*n: "+ sumTichN(n));
        System.out.println("tong n! "+sumGiaiThua(n));

    }

    // a
    public static int sumN(int n) {
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        return sum;
    }

    //b

    public static double sumNPow2(int n) {
        double sum=0;
        for (int i = 1; i <= n; i++) {
           sum+=Math.pow(i, 2);
        }
        return sum;
    }

    //c

    public static double sumNChia2(int n) {
        double sum=0;
        for (int i = 1; i <= n; i++) {
            sum+=1.0/n;
        }
        return sum;
    }
    //d

    public static int sumTichN(int n) {
        int sum=1;
        for (int i = 1; i <= n; i++) {
            sum*=i;
        }
        return sum;
    }

    // e
    public static double sumGiaiThua(int n) {
        double sum=0;
        double giaiThua=1;
        for (int i = 1; i <= n; i++) {
            giaiThua*=i;
            sum+=giaiThua;
        }
        return sum;
    }


}
