package ss1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex12_2 {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> hoTen = new ArrayList<>();
    static ArrayList<Integer> tuoi = new ArrayList<>();
    static ArrayList<String> gioiTinh = new ArrayList<>();
    static ArrayList<Double> luongCb = new ArrayList<>();
    static ArrayList<Double> diemTb = new ArrayList<>();

//    public static void main(String[] args) {
//
//        System.out.print("so nhan vien muon them: ");
//        int n = sc.nextInt();
//        input(n);
//        output(n);
//    }

    public static void input(int n) {
        double diem;
        System.out.println("==== Nhap thong tin nhan vien ====");
        for (int i = 0; i < n; i++) {
            System.out.print("ten nhan vien: ");
            hoTen.add(sc.next());
            System.out.print("tuoi nhan vien: ");
            tuoi.add(sc.nextInt());
            System.out.print("gioi tinh: ");
            gioiTinh.add(sc.next());
            System.out.print("luong cb: ");
            luongCb.add(sc.nextDouble());
            do {
                System.out.print("diem tb: ");
                diem = sc.nextDouble();
                if (diem < 0 || diem > 10) {
                    System.out.println("diem khong hop le nhap lai");
                }
            } while (diem < 0 || diem > 10);
            diemTb.add(diem);
        }
    }

    public static void output(int i) {

        System.out.println("==== Thong tin nhan vien ====");
        System.out.println("ten nhan vien: " + hoTen.get(i));
        System.out.println("tuoi nhan vien: " + tuoi.get(i));
        System.out.println("gioi tinh: " + gioiTinh.get(i));
        System.out.println("luong cb: " + luongCb.get(i));
        System.out.println("diem tb: " + diemTb.get(i));

    }
}
