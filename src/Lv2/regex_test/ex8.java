package Lv2.regex_test;

import java.util.Arrays;

public class ex8 {
    public static void main(String[] args) {
        String pattern = "a*[0-9]*";
        System.out.println("aaa123".matches(pattern));
        pattern = "\\s";
        String arr[] = "Hello World Java Regex 정규식 너무 재밌다!".split(pattern);
        System.out.println(Arrays.asList(arr));
        
        pattern = "Hello";
        
        System.out.println("Hello World Hello World ".replaceFirst(pattern, "Regex"));
        
        System.out.println("Hello World Hello World ".replaceAll(pattern, "Regex"));
        
    }
}