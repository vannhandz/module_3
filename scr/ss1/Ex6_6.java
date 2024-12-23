package ss1;

import java.util.Scanner;

public class Ex6_6 {

    static String name;
    static int age;
    static String gender;
    static String salary;
    static double point;

    public static void main(String[] args) {
        nhap();
        xuat();
    }

    public static void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten: ");
        name = sc.nextLine();
        System.out.print("nhap tuoi: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.print("gioi tinh: ");
        gender = sc.nextLine();
        System.out.print("luong: ");
        salary = sc.nextLine();
        System.out.print("diem: ");
        point =Double.parseDouble(sc.nextLine());
    }
    public static void xuat() {
        System.out.println();
        System.out.println("ten: "+name);
        System.out.println("tuoi: "+age);
        System.out.println("gioi tinh: "+gender);
        System.out.println("luong: "+salary);
        System.out.println("diem: "+point);
    }
}
