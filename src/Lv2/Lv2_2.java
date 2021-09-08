package Lv2;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Lv2_2 {

    public static void main(String [] args){
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int [][] rendarr = new int[count][2];
        int [][] fir = new int[1][2];
        int [][] sec = new int[1][2];
        int [][] thr = new int[1][2];
        int [][] fu = new int[1][2];
        int [][] fiv = new int[1][2];
        for (int i = 0; i < count; i++){
            int red = rd.nextInt(3)+11;
            rendarr[i][0] = red;
            System.out.print(rendarr[i][0] + " ");

        }

        for (int i = 0; i < count; i++){
            for (int j = 0; j < count; j++){
                if (rendarr[i][0] == rendarr[j][0]){
                    rendarr[i][1] = rendarr[i][1]+ 1;
                }
            }

            if(fiv[0][1] < rendarr[i][1]){
                fiv[0][1] = rendarr[i][1];
                fiv[0][0] = rendarr[i][0];
            }else if(fu[0][1] < fiv[0][1]){
                fu[0][1] = fiv[0][1];
                fu[0][0] = fiv[0][0];
            }else if(thr[0][1] < fu[0][1]){
                thr[0][1] = fu[0][1];
                fu[0][0] = fiv[0][0];
            }else if(sec[0][1] < thr[0][1]){
                sec[0][1] = thr[0][1];
                fu[0][0] = fiv[0][0];
            }else if(fir[0][1] < sec[0][1]){
                fir[0][1] = sec[0][1];
                fu[0][0] = fiv[0][0];
            }





        }
        System.out.println(fir[0][1]+" "+fir[0][0]);
        System.out.println(sec[0][1]+" "+sec[0][0]);
        System.out.println(thr[0][1]+" "+thr[0][0]);
        System.out.println(fu[0][1]+" "+fu[0][0]);
        System.out.println(fiv[0][1]+" "+fiv[0][0]);


    }

}
