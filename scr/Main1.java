public class Main1 {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.substring(6,str.length()));
        System.out.println(str.replace("o","f"));
        System.out.println(str.replaceAll("[^l]+","").length());

    }
}

