package Lv2.regex_test;

public class ex6 {
    public static void main(String[] args) {
        String pattern = "a*[0-9]*";
        System.out.println("aa123".matches(pattern) + " / " + "aa99");
        pattern = "a*[0-9]+";
        System.out.println("aa123".matches(pattern) + " / " + "aa99");
        pattern = "a*[0-9]?";
        System.out.println("aa123".matches(pattern) + " / " + "aa99");
        pattern = "a*[0-9]{0,1}";
        System.out.println("aa123".matches(pattern) + " / " + "aa99");
    }
}