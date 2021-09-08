package Lv1;

import java.util.Scanner;

public class Lv1_6 {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        String count = sc.next();

        for (int i = 0; i < count.length(); i++){
            char memory = count.charAt(i);
            System.out.print(((int)memory - 64)+ " ");
        }

    }

}
