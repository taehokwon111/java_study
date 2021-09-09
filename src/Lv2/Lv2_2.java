package Lv2;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Lv2_2 {

    public static void main(String [] args){
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++){
            int rand  = rd.nextInt(88)+11;
            System.out.print(rand+" ");
        }


    }

}
