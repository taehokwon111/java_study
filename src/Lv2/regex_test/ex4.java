package Lv2.regex_test;

public class ex4 {
    public static void main(String[] args){
        String pattern = "[a-h]";
        System.out.println("holy shit! my fucking test is dead!".replaceAll(pattern, "*"));
        System.out.println("holy shit! my fucking test is dead!");
        pattern = "[a-f]";
        System.out.println("abcdefghijklmnopqrstuvwxyz / ABCDEFGHIJKLMNOPQRSTUVWXYZ".replaceAll(pattern, "*"));
        System.out.println("abcdefghijklmnopqrstuvwxyz / ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    }
}
