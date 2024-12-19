import java.util.Scanner;

public class Ex6_8 {
    static String name;
    static int age;
    static String gender;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("So nv muon them: ");
        int dem = 1;
        int check;
        do {

            System.out.println("nhan vien: " + dem);
            nhap();
            System.out.println();
            System.out.print("co muon nhap them nv ? nhap 1 neu co: ");
            check = sc.nextInt();
            if (check == 1) {
                dem++;
            }
        } while (check == 1);

        for (int j = 1; j<=dem; j++) {
            System.out.print("thong tin nhan vien: ");
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
        System.out.println("ten: " + name);
        System.out.println("tuoi: " + age);
        System.out.println("gioi tinh: " + gender);

    }
}
