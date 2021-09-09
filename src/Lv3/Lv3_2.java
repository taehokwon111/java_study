package Lv3;

import java.util.Random;
import java.util.Scanner;

public class Lv3_2 {

    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int life = sc.nextInt();
        String [] tetes = new String[life];


        for (int i = 0; i < life; i++) {
            tetes[i] = sc.next();
        }

        for (int c = 0; c < life; c++) {

            for (int k = 1; k < 10; k++) {


            }
            System.out.println("#"+(c+1)+tetes[c]);
        }

    }

}



