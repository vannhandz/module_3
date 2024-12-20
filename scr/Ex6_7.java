import java.util.Scanner;

public class Ex6_7 {
    static String name;
    static int age;
    static boolean  gender;


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
        int choose;

        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten: ");
        name = sc.nextLine();
        System.out.print("nhap tuoi: ");
        age = Integer.parseInt(sc.nextLine());
       do {
           System.out.println("===== Menu =====");
           System.out.println("1 Nam");
           System.out.println("2 Nu");
           System.out.print("moi nhap: ");
           choose = sc.nextInt();

           if(choose !=1 && choose !=2)
           {
               System.out.println("nhap sai");
           }
       }while (choose !=1 && choose !=2);
         gender=choose==1;
    }
    public static void xuat() {

        System.out.println();
        System.out.println("ten: "+name);
        System.out.println("tuoi: "+age);
        System.out.println("gioi tinh: "+(gender ? "Nam" : "Nu"));

    }
}
