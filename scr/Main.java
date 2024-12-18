import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n = in.nextInt();
        System.out.println(changeNumber(n));
        System.out.println("doi xung: " + doiXung(n));
        System.out.println("chinh phuong: " + chinhPhuong(n));
        System.out.println("tong chinh phuong: " + sumChinhPhuong(n));
    }

    // số đảo
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

    //  số đối xứng

    public static boolean doiXung(int x) {
        return changeNumber(x) == x;
    }

    // chinh phuong

    public static boolean chinhPhuong(int x) {
        if (x % Math.sqrt(x) == 0) {
            return true;
        }
        return false;
    }

    // sum chinh phuomg
    public static int sumChinhPhuong(int x) {
        int sum = 0;
        int check=0;
        for (int i = 0; x > 0; i++) {
            check= x % 10;
            if (chinhPhuong(check)) {
                sum += check;
            }
            x /= 10;
        }
        return sum;
    }


}
