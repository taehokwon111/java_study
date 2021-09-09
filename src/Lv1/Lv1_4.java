package Lv1;

import java.util.Arrays;
import java.util.Scanner;

public class Lv1_4 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int casecount = sc.nextInt();
        int [] count = new int[casecount];
        int r = 0;

        for (int j = 1; j <= casecount; j++){


                count[j - 1] = sc.nextInt();

                if(j % 2 != 0){
                    r = r + 1;
                }

        }

        Arrays.sort(count);

    System.out.println(count[r+1]+" "+r);
    }

}
