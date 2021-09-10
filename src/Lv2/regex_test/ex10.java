package Lv2.regex_test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex10 {
    public static void main(String[] args){
        Pattern pattern = Pattern.compile("\\d{3}-\\d{5}");
        Matcher matcher = pattern.matcher("123-45678");
        System.out.println(matcher.find());
        
        String patterns = "\\d-\\d";
        System.out.println("12345-67890".replaceAll(patterns, "*") + " / " + "12345-67890");
        patterns = "^\\d{3}-\\d{3,4}-\\d{4}$";
        System.out.println("12345-67890".replaceAll(patterns, "*") +" / "+ "12345-67890");
        System.out.println("010-5415-9989".replaceAll(patterns, "*") + " / " + "010-5849-9989");
        System.out.println("01033975792".replaceAll(patterns, "*") + " / " + "01033975792");
    
    
    }
}
