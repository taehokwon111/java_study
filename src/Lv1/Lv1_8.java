package Lv1;

import java.util.Scanner;

public class Lv1_8 {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int total = 1;
        for (int i = 1; i <= count; i++){
            total = total * 2;
            System.out.print(total+" ");

        }


    }

}
