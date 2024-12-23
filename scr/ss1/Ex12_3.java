package ss1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static ss1.Ex12_2.*;

public class Ex12_3 {
    public static void main(String[] args) {
        System.out.print("so nhan vien muon them: ");
        int n = sc.nextInt();
        input(n);
        // nhan vien có diem tb coa nhat
        System.out.println("nhan vien có diem tb cao nhat:");
        diemTb(n,diemTb);
        // tim nhan vien
        System.out.print("nhap ten nhan vien can tim:");
        String str=sc.next();
        findName(n,str);
        // sắp xếp tuôi tăng
        tuoiTang(n);
        for (int i = 0; i < n; i++) {
            output(i);
        }

    }

    // nv diem tb cao nhat
    public static void diemTb(int n, ArrayList<Double> list) {
        double max = Collections.max(list);
        for (int i = 0; i < n; i++) {
            if(diemTb.get(i)==max)
            {
                output(i);
            }
        }
    }
    // tim nhan vien
    public static void findName(int n,String str) {
        for (int i = 0; i < n; i++) {
            if(str.equals(hoTen.get(i)))
            {
                output(i);
            }else {
                System.out.println("khong có nhan vien");
            }
        }
    }
    // săp xep tuo tăng dan
    public static void tuoiTang(int n) {
        for (int i = 0; i < tuoi.size() - 1; i++) {
            for (int j = i + 1; j < tuoi.size(); j++) {
                if (tuoi.get(i) > tuoi.get(j)) {
                    Collections.swap(tuoi, i, j);
                    Collections.swap(hoTen, i, j);
                    Collections.swap(gioiTinh, i, j);
                    Collections.swap(luongCb, i, j);
                    Collections.swap(diemTb, i, j);
                }
            }
        }
    }
}
