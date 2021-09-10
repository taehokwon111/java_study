package Lv2;

import java.util.Scanner;

public class Lv2_3_1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
    
        int[][] snail = new int[p][p];
        int k = 1;
        int r = - 1;
        int b = 0;
        int t = 1;
        
        for (int i = 5; i > 0; i--) {
            
            for (int j = 0; j < p; j++) {
                r += t;
                snail[b][r] = k;
                k++;
            }
            
            p--;
            
            for (int j = 0; j < p; j++) {
                b += t;
                snail[b][r] = k;
                k++;
            }
            
            t = t * (- 1);
        }
        
        for (int i = 0; i < snail.length; i++) {
            for (int j = 0; j < snail[i].length; j++) {
                System.out.printf("%2d ", snail[i][j]);
            }
            System.out.println();
        }
    }
    
}

