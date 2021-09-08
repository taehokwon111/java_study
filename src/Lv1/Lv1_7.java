package Lv1;

import java.util.Scanner;

public class Lv1_7 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int total = 0;
        for (int i = 1; i <= count; i++){
            total = total + i;
        }
        System.out.println(total);


    }

}
