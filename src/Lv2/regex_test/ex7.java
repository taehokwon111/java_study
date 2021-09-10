package Lv2.regex_test;

public class ex7 {
    public static void main(String[] args) {
        String pattern = "(\\w)(\\s+)([\\w])";
        System.out.println("Hello     World".replaceAll(pattern, "-") + " / " + "Hello     World");
        pattern = "(\\w)(\\s+)([\\w])";
        System.out.println("Hello     World".replaceAll(pattern, "$1-$3") + " / " + "Hello     World");
        pattern = "(\\w)([\\w]+)";
        System.out.println("Hello     World".replaceAll(pattern, "-"));
        pattern = "(\\s+)";
        System.out.println("Hello     World".replaceAll(pattern, "-"));
    }
}