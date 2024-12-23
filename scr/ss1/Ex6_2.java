package ss1;

import java.util.Scanner;

public class Ex6_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n = in.nextInt();
        System.out.println(changeNumber(n));
        System.out.println("doi xung: " + doiXung(n));
        System.out.println("chinh phuong: " + chinhPhuong(n));
        System.out.println("nguyen to: "+nguyenTo(n));
        System.out.println("tong so le: "+sumLe(n));
        System.out.println("tong nguyen to: "+sumNguyenTo(n));
        System.out.println("tong chinh phuong: " + sumChinhPhuong(n));
    }

    //   a số đảo
    public static int changeNumber(int x) {
        int sum = 0;
        for (int i = 0; x > 0; i++) {
            sum += x % 10;
            x /= 10;
            if (x > 0) {
                sum *= 10;
            }
        }
        return sum;
    }

    // b  số đối xứng

    public static boolean doiXung(int x) {
        return changeNumber(x) == x;
    }

    // c chinh phuong

    public static boolean chinhPhuong(int x) {
        if (x % Math.sqrt(x) == 0) {
            return true;
        }
        return false;
    }

    // d nguyen to
    public static boolean nguyenTo(int n)
    {

        if (n<2)
        {
            return false;
        }
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    //e tong so le
    public static int sumLe(int x)
    {
        int sum=0;
        for (int i = 1; x>0; i++) {
            int donvi=x%10;
            if(donvi%2!=0) sum+=donvi;
            x/=10;
        }
        return sum;
    }

    // f tong nguyen to

    public static int sumNguyenTo(int x)
    {
        int sum=0;
        for (int i = 1; x>0; i++) {
            int donvi=x%10;
            if(nguyenTo(donvi))
            {sum+=donvi;}
            x/=10;
        }
        return sum;
    }


    //  g sum chinh phuomg
    public static int sumChinhPhuong(int x) {
        int sum = 0;
        int check = 0;
        for (int i = 0; x > 0; i++) {
            check = x % 10;
            if (chinhPhuong(check)) {
                sum += check;
            }
            x /= 10;
        }
        return sum;
    }


}
