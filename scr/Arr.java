import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap n >0: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(xuatArr(arr));
        System.out.println(xuatArrLe((arr)));
    }

    private static boolean xuatArr(int[] arr) {

        for (int i : arr) {
            if (i % 2 != 0) {
                return false;
            }
        }
        return true ;

    }
    private static int xuatArrLe(int[] arr) {
        int sum=0;
        for (int i =0; i<arr.length; i++) {
            if (arr[i]% 2 != 0) {
                sum += arr[i];
            }
        }
       return sum;
    }
}
