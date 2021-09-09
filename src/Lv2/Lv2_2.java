package Lv2;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lv2_2 {

    public static void main(String [] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] rand = new int[count+2];
        int[] randcheck = new int[count];
        int[] dasd = new int[count+2];
        int cou = 0;
        int coun = 0;

        for (int i = 0; i < count; i++) {
            rand[i] = rd.nextInt(88) + 11;
        }
        Arrays.sort(rand);
        for (int i = 1; i < count; i++) {
            System.out.print(rand[i] + " ");
            if (rand[i - 1] == rand[i]) {
                dasd[cou] = rand[i];
                cou++;
            }
        }
        System.out.println("");

        for (int i = 0; i < dasd.length; i++) {
            if(dasd[i] != 0){
                System.out.print(dasd[i] + " ");
            }
        }
            int fiv = 1;

        System.out.println("");

        for (int i = dasd.length; fiv < 6; i--){

                if(dasd[i-1] != 0 && dasd[i-1] != dasd[i-2]) {
                    if (fiv < 6){
                        System.out.println("# "+fiv+" "+dasd[i-1]);
                        fiv++;
                    }else {

                        for (int w = rand.length; fiv < 6; w--) {

                            System.out.println("# " + fiv + " " + rand[w-2]);
                            fiv++;
                        }
                    }
                }
            }
        }
    }
//미완

