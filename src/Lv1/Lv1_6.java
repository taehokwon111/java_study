package Lv1;

import java.util.Scanner;

public class Lv1_6 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int casecount = sc.nextInt();
        int [][] input = new int[casecount][2];

        for (int i = 0; i < casecount; i++){
            for (int k = 0; k < 2; k++){
                input[i][k] = sc.nextInt();
            }
        }

        for (int j = 1; j <= casecount; j++){
                System.out.println("#" + j + " " + (input[j-1][0] / input[j-1][1]) + " " + (input[j-1][0] % input[j-1][1]));

        }




    }

}
