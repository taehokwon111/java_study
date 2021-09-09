package Lv3;

import java.util.Random;
import java.util.Scanner;

public class Lv3 {

    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int life = sc.nextInt();
        int [] test = new int[life];
        String [] tetes = new String[life];


        for (int i = 0; i < life; i++) {
            test[i] = sc.nextInt();
            tetes[i] = " No";
        }

        for (int c = 0; c < life; c++) {

            for (int k = 1; k < 10; k++) {

                for (int j = 1; j < 10; j++) {

                    if (k * j == test[c]){
                        tetes[c] = " Yes";
                    }
                    
                }

            }
            System.out.println("#"+(c+1)+tetes[c]);
        }

    }

}



