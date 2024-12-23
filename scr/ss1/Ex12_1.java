package ss1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex12_1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("nhap n phan tu: ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        input(n, list);
        output(list);
        System.out.println();
        System.out.println("so phan tu le: "+countLe(list));
        System.out.print("nhap phan tu k can tim: ");
        int k = sc.nextInt();
        System.out.println("vi tri can tim trong mang: "+check(list,k));
        System.out.println("mang tang dan:"+tangDang(list));
        System.out.println("dao mang:"+daoMang(list));
        System.out.print("nhap phan tu can xoa: ");
        int rm=sc.nextInt();
        System.out.println("mang sau khi xoa: "+xoaK(list,rm));
        System.out.println("phan tu lon nhi mamg: "+lonNhi(list));


    }

    private static void output(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }

    private static void input(int n, ArrayList<Integer> list) {
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
    }
    // dem le
    private static int countLe(ArrayList<Integer> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) %2!=0) {
                count++;
            }
        }
        return count;
    }
    // tim phan tu K
    private static ArrayList check(ArrayList<Integer> list,int k) {
        ArrayList temp = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)==k) {
                temp.add(i);
            }
        }
        return temp;
    }
    // mang tang dang
    private static ArrayList tangDang(ArrayList<Integer> list) {
        Collections.sort(list);
        return list;
    }
    // dao mang
    private static ArrayList daoMang(ArrayList<Integer> list) {
        Collections.reverse(list);
        return list;
    }
    // xoa phan tu nhap tu bang phim
    private static ArrayList xoaK(ArrayList<Integer> list,int k) {
        list.removeAll(Arrays.asList(k));
        return list;
    }
    private static void minMax(ArrayList<Integer> list) {
        int max=Collections.max(list);
        int min=Collections.min(list);
    }
    private static int lonNhi(ArrayList<Integer> list) {
        tangDang(list);
        daoMang(list);
        list.remove(0);
        return list.get(0);
    }
}
