package Lv2;

import java.util.Random;
import java.util.Scanner;

public class Lv2_4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int life = sc.nextInt();
        String[] testcase = new String[life];
        
        for (int q = 0; q < life; q++) {
            testcase[q] = sc.next();
        }
        
        for (int i = 0; i < life; i++) {
            char anotherChar = testcase[i].charAt(0);
            int count = -1;
            for (int j = 0; j < testcase[i].length(); j++) {
                if (testcase[i].charAt(0) == testcase[i].charAt(j)){
                    count = count + 1;
                    
                    
                }
                
            }
            if (count != 0) {
                System.out.println("#" + (i+1) + "  해당 문자열 포함 :"+ " " + (count+1) +" / " + "해당 문자열 미포함 :"+ " " + count);
            }
        }
    }
}
