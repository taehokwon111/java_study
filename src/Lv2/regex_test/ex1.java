package Lv2.regex_test;

public class ex1 {
    public static void main(String[] args){
        String pattern = "ab.";
        System.out.println("abc".replaceAll(pattern, "complete!"));
        System.out.println("ab".replaceAll(pattern, "complete!"));
        pattern = "ab\\s\\S";
        System.out.println("ab c".replaceAll(pattern, "complete!"));
        System.out.println("ab".replaceAll(pattern, "complete!"));
    }
}
