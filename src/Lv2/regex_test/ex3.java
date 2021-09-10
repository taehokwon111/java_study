package Lv2.regex_test;

public class ex3 {
    public static void main(String[] args){
        String pattern = "mat";
        System.out.println("The cat sat on the mat".replaceAll(pattern, "*"));
        System.out.println("The cat sat on the mat");
        pattern = "mat$";
        System.out.println("The cat sat on the mat".replaceAll(pattern, "*"));
        System.out.println("The cat sat on the mat");
    }
}
