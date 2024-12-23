package ss1;

import java.util.Scanner;

public class Ex6_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        fibo(n);
    }

    public static void fibo(int n) {
        int sum=1;
        int x=0, y=1;
        for (int i = 1; i <= n; i++) {
            sum=x+y;
            x=y;
            y=sum;
            System.out.print(sum+" ");
        }
    }
}
