package ss1;

public class Ex7_2 {
    public static void main(String[] args) {

        //a.
        String str = "2003";
        int a = Integer.parseInt(str);

        //b
        String str2 = String.valueOf(a);

        //c chuyen string thanh long
        String str3 = "89129512038120";
        long c = Long.parseLong(str3);

        //d chuyen long thanh string
        String str4 = String.valueOf(c);

        //e. chuyen string thanh float
        float f = Float.parseFloat(str4);

        //f. chuyen doi float thanh string
        String str5 = String.valueOf(f);

        //g. chuyen doi string thanh double
        String str6 = "1.12";
        double g = Double.parseDouble(str6);

        //h. chuyen double thanh string
        String str7 = String.valueOf(g);

        //i. chuyen string thanh short
        String str8 = "100";
        short i = Short.parseShort(str8);

        //l. chuyen doi short thanh string
        String str9 = String.valueOf(i);

    }
}
