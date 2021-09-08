package Lv2;

import java.util.Random;

public class Lv2 {

    public static void main(String [] args){
        Random rd = new Random();

        for (int i = 0; i < 10; i++){
            System.out.println(rd.nextInt(88)+11);
        }

    }

}
