package Lv1;

import java.util.Scanner;

public class Lv1_1 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int casecount = sc.nextInt();
        boolean errer = false;
        int [] total = new int[casecount+1];
        int [] arr = new int[10];
        int max = 0;
        for (int j = 1; j <= casecount; j++){
            max = 0;
            for (int i = 0; i < 10; i++){

                arr[i] = sc.nextInt();

                if(arr[i] < 10000 && arr[i] > 0){
                    errer = true;
                    System.out.println("제약사항에 맞지않음");
                    break;
                }

                if (arr[i] % 2 != 0){
                    max = max + arr[i];
                }
            }
            total[j] = max;


        }
        for (int i = 1; i <= casecount; i++){
            if(errer = true){
                break;
            }
            System.out.println("#"+i+" "+total[i]);
        }

    }

}
