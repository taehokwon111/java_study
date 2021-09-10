package Lv2.regex_test;

public class ex5 {
    public static void main(String[] args){
        String pattern = "\\d";
        System.out.println("1A 1 AAA 11 AA1 A 1 AA111A".replaceAll(pattern, "*"));
        System.out.println("1A 1 AAA 11 AA1 A 1 AA111A");
        pattern = "\\D";
        System.out.println("1A 1 AAA 11 AA1 A 1 AA111A".replaceAll(pattern, "*"));
        System.out.println("1A 1 AAA 11 AA1 A 1 AA111A");
        pattern = "\\s";
        System.out.println("1A 1 AAA 11 AA1 A 1 AA111A".replaceAll(pattern, "*"));
        System.out.println("1A 1 AAA 11 AA1 A 1 AA111A");
        pattern = "\\S";
        System.out.println("1A 1 AAA 11 AA1 A 1 AA111A".replaceAll(pattern, "*"));
        System.out.println("1A 1 AAA 11 AA1 A 1 AA111A");
        pattern = "\\w";
        System.out.println("1A 1 AAA 11 AA1 A 1 AA111A".replaceAll(pattern, "*"));
        System.out.println("1A 1 AAA 11 AA1 A 1 AA111A");
        pattern = "\\W";
        System.out.println("1A 1 AAA 11 AA1 A 1 AA111A".replaceAll(pattern, "*"));
        System.out.println("1A 1 AAA 11 AA1 A 1 AA111A");
    }
}
