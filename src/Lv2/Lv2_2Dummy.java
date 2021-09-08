package Lv2;

import java.util.Random;
import java.util.Scanner;

public class Lv2_2Dummy {

    public static void main(String [] args){
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int [][] rendarr = new int[count][2];
        int max = 0;
        int mid = 0;
        int min = 0;
        for (int i = 0; i < count; i++){
            int red = rd.nextInt(88)+11;
            rendarr[i][0] = red;
            System.out.print(rendarr[i][0] + " ");
        }
        min = rendarr[0][0];
        mid = rendarr[0][0];
        System.out.println("");
            for (int j = 0; j < count; j++){
                if(max < rendarr[j][0]){
                    max = rendarr[j][0];
                }
                if(min <= rendarr[j][0] || max < rendarr[j][0]){
                    mid = rendarr[j][0];
                }
                if(min > rendarr[j][0]){
                    min = rendarr[j][0];
                }

        }
        System.out.println(max + " " + mid + " " + min);

//        for (int i = 0; i < count; i++){
//            for (int j = 0; j < count; j++){
//                if (rendarr[i][0] == rendarr[j][0]){
//                    rendarr[i][1] = rendarr[i][1]+ 1;
//                }
//            }
//            System.out.println(rendarr[i][1]);
//
//
//        }

    }

}
