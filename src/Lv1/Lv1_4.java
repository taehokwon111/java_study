package Lv1;

import java.util.Arrays;
import java.util.Scanner;

public class Lv1_4 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int casecount = sc.nextInt();
        int [] count = new int[casecount];
        int r = -1;
        boolean error = false;

        for (int j = 1; j <= casecount; j++){


                count[j - 1] = sc.nextInt();
            if(count[j-1] < 10000 && count[j-1] > 0){
                error = true;
                System.out.println("제약사항에 맞지않음");
                break;
            }
                if(j % 2 != 0){
                    r = r + 1;
                }

        }

        Arrays.sort(count);

    System.out.println(count[r+1]);
    }

}
