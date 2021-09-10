package Lv2.regex_test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex9 {
    public static void main(String[] args) {
        
        Pattern pattern = Pattern.compile("\\bcat\\b");
        Matcher matcher = pattern.matcher("cat cat dog dog");
        int count = 0;
        while(matcher.find()) {
            count++;
            System.out.println("Match number " + count);
            System.out.println("group(): " + matcher.group());
            System.out.println("start(): " + matcher.start());
            System.out.println("end(): " + matcher.end());
        }
    }
}