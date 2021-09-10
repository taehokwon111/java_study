package Lv2;

import java.util.Random;
import java.util.Scanner;

public class Lv2_3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0, j = - 1, k = 0, sw = 1;
        int[][] result = new int[n][n];
        while (true) {
            for (int l = 0; l < n; l++) {
                k = k + 1;
                j = j + sw;
                result[i][j] = k;
                
            }
            n = n - 1;
            if (n < 0) {
                break;
            }
            sw = sw * - 1;
        }
        
        for (int q = 0; q < n; q++) {
            for (int w = 0; w < n; w++) {
                System.out.print(result[q][w]);
            }
            System.out.println("");
        }
        
        
    }
    
}
