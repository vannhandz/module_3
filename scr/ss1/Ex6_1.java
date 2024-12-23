package ss1;

public class Ex6_1 {
    public static void main(String[] args) {
        changeKiTu('K');
        numLevel1(3,4);
        numLevel2(5,6,7);
        System.out.println(min4So(5,6,2,6));
    }

    // chuyen kis tu sang thuong
    public static void changeKiTu(char ch)
    {
        if (ch>='A' && ch<='Z')
        {
            ch+=32;
            System.out.println(ch);
        }
    }
    // bac 1
    public static void numLevel1(double a,double b)
    {
        if (a != 0) {
            if (b == 0) {
                System.out.println("vo so nghiem");
            } else {
                System.out.println("x = " + (b / a));
            }
        } else {
            System.out.println("vo nghiem");
        }
    }

    // bac 2
    public static void numLevel2 (double a,double b,double c)
    {
        double delta = b * b - 4 * a * c;
        if (a == 0) {
            if (b != 0) {
                if (c == 0) {
                    System.out.println("Vo so nghiem");
                } else {
                    System.out.println("x = " + (-c / b));
                }
            } else {
                System.out.println("Vo nghiem");
            }
        } else {
            if (delta < 0) {
                System.out.println("Vo nghiem");
            } else if (delta == 0) {
                System.out.println("x = " + (-b / (2 * a)));
            } else {
                System.out.println("x1 = " + (-b - Math.sqrt(delta)) / (2 * a));
                System.out.println("x2 = " + (-b + Math.sqrt(delta)) / (2 * a));
            }
        }
    }


    // min 4 so

    public static int min4So(int a,int b,int c,int d)
    {
        int  min = a ;
         if (min>b) min = b ;
         if (min>c) min = c ;
         if (min>d) min = d ;
        return min ;
    }


}
