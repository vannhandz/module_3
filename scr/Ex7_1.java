public class Ex7_1 {
    public static void main(String[] args) {
        String str = " Hello World ";
        // lay chu word
        System.out.println(str.substring(str.indexOf("World")));
        // doi tat ca 'o' thanh 'f'
        System.out.println(str.replace("o","f"));
        //dem ki tu l
        System.out.println(str.replaceAll("[^l]+","").length());
        // dem ki tu l dau va cuoi
        System.out.println(str.indexOf('l') + " "+ (str.lastIndexOf('l')));
        // xoa tat ca khoang trang
        System.out.println(str.replace(" ",""));
        // xoa khoarn trang dau va cuoi
        System.out.println(str.trim());
        //dao chuoi
        String str2="";
        for (int i = str.length()-1; i>=0; i--) {
            str2+=str.charAt(i);
        }
        System.out.println(str2);
        // noi chuoi
        System.out.println("SQC".concat(str));
        // dôi kí tụ 's' sang hoa
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
    }
}

