package Lv2;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Lv2_1 {

    public static void main(String [] args){
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        DecimalFormat form = new DecimalFormat("#.##");
        int count = sc.nextInt();
        int [] rendarr = new int[count];
        double max = 0;
        double Variance = 0;
        for (int i = 0; i < count; i++){
            int red = rd.nextInt(88)+11;
            System.out.print(red+" ");
            rendarr[i] = red;
            max = max + red;
        }
        for (int i = 0; i < count; i++){
            Variance = Variance + ((rendarr[i] - (max/count)));

        }
        System.out.println("");
        System.out.println(form.format(Variance));
        System.out.println(Variance);



        System.out.println("평균 :" + form.format(max / count));
        System.out.println("표준편차 :" + form.format(max / count));
        System.out.println("분산 :" + form.format(max / count));


    }

}
