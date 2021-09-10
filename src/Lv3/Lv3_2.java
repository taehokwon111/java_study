package Lv3;

import java.util.Random;
import java.util.Scanner;

public class Lv3_2 {

    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int life = sc.nextInt();
        String [] tetes = new String[life];
        String [] YnN = new String[life];

        for (int i = 0; i < life; i++) {
            tetes[i] = sc.next();
            YnN[i] = "No";
        }

        for (int i = 0; i < life; i++) {
            int a = 0, b = 0, c = 0, d = 0;
            char anotherChar = '1';
            for (int j = 1; j < 4; j++){
                if (tetes[i].charAt(0) == tetes[i].charAt(j) && a == 0){
                  a = 1;
                }
                if (tetes[i].charAt(0) != tetes[i].charAt(j) && b == 0){
                    b = 1;
                    anotherChar = tetes[i].charAt(j);
                    d = j;
                }
                if(anotherChar == tetes[i].charAt(j) && c == 0 && j != d){
                    c = 1;
                }
                if (a == 1 && b == 1 && c == 1){
                    YnN[i] = "Yes";
                }
            }
            System.out.println(tetes[i] +" / "+ YnN[i]);
        }
        System.out.println();

    }

}



