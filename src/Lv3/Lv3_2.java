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
            int max = 0;
            for (int j = 1; j < 4; j++){
                if (tetes[i].charAt(0) == tetes[i].charAt(j) && max == 0){
                    max = max + 1;
                }else if(max == 1){
                    YnN[i] = "Yes";
                    max = max + 1;
                }
            }
            System.out.println(tetes[i] +" / "+ YnN[i]);
        }

    }

}



