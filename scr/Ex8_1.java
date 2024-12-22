import java.sql.SQLOutput;

public class Ex8_1 {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder();
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        str1.append("Hello");
        str2.append(" World");
        str.append("Hello World");
        //a
        System.out.println(str.substring(str.indexOf("World")));
        //b
        System.out.println(str.replace(4,8,"f"));
        //c
        System.out.println(str1.append(str2));
        //d
        String a="A";
        String b=new String("A");
        String c="A";
        b.concat("B");
        String d=c.concat("C");
        StringBuilder e = new StringBuilder("E");
        e.append("F");
        StringBuilder g = new StringBuilder("G");
        g.append("H");
        System.out.println(a+b+c+d+e+g);
        //e
        String chuo1="hello";
        String chuo3=new String("hello");
        StringBuilder chuoi2=new StringBuilder("hello");
        System.out.println(chuo1.equals(chuo3));
        System.out.println(chuoi2.equals(chuo3));


    }
}
