import java.util.Scanner;

public class Ex6_7 {
    static String name;
    static int age;
    static String gender;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("So nv muon them: ");
        int nv = sc.nextInt();
        for (int i = 1; i <=nv; i++) {
            System.out.println("nhan vien: "+i);
            nhap();
            System.out.println();
        }
        for (int i = 1; i <=nv; i++) {
            System.out.print("thong tin nhan vien: "+i);
            xuat();
            System.out.println();
        }
    }

    public static void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten: ");
        name = sc.nextLine();
        System.out.print("nhap tuoi: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.print("gioi tinh: ");
        gender = sc.nextLine();

    }
    public static void xuat() {
        System.out.println();
        System.out.println("ten: "+name);
        System.out.println("tuoi: "+age);
        System.out.println("gioi tinh: "+gender);

    }
}