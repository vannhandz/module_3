import java.util.Scanner;

public class Ex7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chuoi a: ");
        String str1 = sc.nextLine();
        System.out.print("nhap chuoi b: ");
        String str2 = sc.nextLine();
        if(str1.length() < str2.length()) {
            System.out.println("chuoi 2 lon hon");
        }else
        {
            System.out.println("chuoi 1 lon hon");
        }
    }
}
