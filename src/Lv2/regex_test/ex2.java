package Lv2.regex_test;

public class ex2 {
    public static void main(String[] args){
        String pattern = "[Tt]he";
        System.out.println("The cat sat on the mat.".replaceAll(pattern, "*"));
        System.out.println("The cat sat on the mat.");
        pattern = "^[Tt]he";
        System.out.println("The cat sat on the mat.".replaceAll(pattern, "*"));
        System.out.println("The cat sat on the mat.");
    }
}
