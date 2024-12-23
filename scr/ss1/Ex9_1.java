package ss1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex9_1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhap sl phan tu mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        inputArr(n, arr);
        outArr(n, arr);
        System.out.println();
        System.out.println("toan chan:" + checkAllChan(n, arr));
        System.out.println("toan nguyen to: " + checkAllNgTo(n, arr));
        System.out.println("mang tang dan:" + checkTangDang(n, arr));
        System.out.println("phan tu le: " + demLe(n, arr));
        System.out.println("tong phan tu le: " + sumle(n, arr));
        System.out.println("tong so chia het cho 4 va khong chia het cho 5: " + chiaHet(n, arr));
        System.out.println("tong nguyen to: " + sumNgTo(n, arr));
        System.out.println("nguyen to dau: " + firstNgTo(n, arr));
        System.out.println("so nho nhat: " + minNum(n, arr));
        System.out.print("Nhap phan tu K:");
        int k = sc.nextInt();
        System.out.println("vị tri K: " + Arrays.toString(checkK(n, arr, k)));
        minMaxNum(n, arr);
    }


    //1
    private static void inputArr(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    private static void outArr(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //2
    //a toan chan
    private static boolean checkAllChan(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkNT(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // b check nguyen to
    private static boolean checkAllNgTo(int n, int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (!checkNT(arr[i])) {
                return false;
            }
        }
        return true;
    }

    //c check tang dan
    private static boolean checkTangDang(int n, int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //3
    //a dem le
    private static int demLe(int n, int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum++;
            }
        }
        return sum;
    }

    //b tong duong ke
    private static int sumle(int n, int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] > 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    //c chia het 4 k chia he 5
    private static int chiaHet(int n, int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 4 == 0 && arr[i] % 5 != 0) {
                sum++;
            }
        }
        return sum;
    }

    // d tong nguyen to
    private static int sumNgTo(int n, int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (checkNT(arr[i])) {
                sum += arr[i];
            }
        }
        return sum;
    }

    //4
    //b
    private static int firstNgTo(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (checkNT(arr[i])) {
                return i;
            }
        }
        return -1;
    }

    //c
    private static int minNum(int n, int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1] && arr[i] > 0) {
                min = arr[i + 1];
            }
        }
        return min;
    }

    //d tim vi tri k nhap tu ban phim
    private static int[] checkK(int n, int[] arr, int k) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                arr2[i] = i;
            }
        }
        return arr2;
    }

    //e min max trong mảng
    private static void minMaxNum(int n, int[] arr) {
        int min = arr[0], max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                max = arr[i];
            } else {
                min = arr[i];
            }
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}
