package Lv2;

import java.util.Scanner;

public class Lv2_5 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int k = 0; k < (n-i); k++){
                System.out.print(" ");
            }
            for (int j = 0; j<i; j++){
                System.out.print((j+1)+" ");
            }
            System.out.println("fuck.............");
        }
        
        for (int i = n-1; i > 0; i--){
            for (int w = 1; w <= n-i; w++){
                System.out.print(" ");
            }
            for (int j = 0; j<i; j++){
                System.out.print((j+1)+" ");
            }
            
            System.out.println("");
        }
    }

}
