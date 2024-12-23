package ss1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrList {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("nhap n >0: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
           arr.add(sc.nextInt());
        }
        xuat(n, arr);


        System.out.println(xuatArr(arr));
        System.out.println(xuatArrLe((arr)));
    }

    private static void xuat(int n, ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

    private static boolean xuatArr(ArrayList<Integer> arr) {

        for (int i : arr) {
            if (i % 2 != 0) {
                return false;
            }
        }
        return true ;

    }
    private static int xuatArrLe(ArrayList<Integer> arr) {
        int sum=0;
       for (int i =0; i < arr.size(); i++) {
           if(arr.get(i)%2!=0) {
               sum+=arr.get(i);
           }
       }
        return sum;
    }
}
