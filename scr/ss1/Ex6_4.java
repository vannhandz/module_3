package ss1;

import java.util.Scanner;

public class Ex6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        System.out.println("uscln: "+uscln(a,b));
    }

    public static int uscln(int a, int b) {
        int ucln=0;
        for (int i = a; i>=1; i--) {
            if(a%i==0 && b%i==0) {
                ucln=i;
                break;
            }
        }
        return ucln;
    }
}
