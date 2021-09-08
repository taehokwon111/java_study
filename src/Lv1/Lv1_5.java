package Lv1;

import java.util.Scanner;

public class Lv1_5 {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (int i = 1; i <= count; i++){
            if(count % i == 0) {
                System.out.print(i + " ");
            }
        }
       
    }

}
