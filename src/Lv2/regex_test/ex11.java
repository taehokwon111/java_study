package Lv2.regex_test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String [] arr = new String[count];
        Pattern pattern = Pattern.compile("\\b(\\w+)\\s+\\1\\b");

        
        for (int i = 0; i < count; i++) {
    
            Matcher matcher = pattern.matcher(sc.next());
            
            if (matcher.find()) {
                System.out.println("find!");
            } else {
                System.out.println("false!");
            }
        }
    }
}
