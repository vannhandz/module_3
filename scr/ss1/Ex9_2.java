package ss1;

import java.util.Scanner;

public class Ex9_2 {
    static Scanner sc = new Scanner(System.in);
    static String[] hoTen=new String[5];
    static int[] tuoi=new int[5];
    static String[] gioiTuoi=new String[5];
    public static void main(String[] args) {

        inputNV();
        outputNV();
    }

    private static void outputNV() {
        for (int i = 1; i <=5; i++) {
            System.out.println("thong tin nhan vien: "+i);
            System.out.println("ho ten nv: "+hoTen[i]);
            System.out.println("nhap tuoi nv: "+tuoi[i]);
            System.out.println("nhap gioi tuoi nv: "+gioiTuoi[i]);
        }
    }

    private static void inputNV() {
        for (int i = 1; i <=5; i++) {
            System.out.println("nhan vien: "+i);
            System.out.print("nhap ho ten nv: ");
            hoTen[i]=sc.nextLine();
            System.out.print("nhap tuoi nv: ");
            tuoi[i]=Integer.parseInt(sc.nextLine());
            System.out.print("nhap gioi tuoi nv: ");
            gioiTuoi[i]=sc.nextLine();
        }
    }
}
