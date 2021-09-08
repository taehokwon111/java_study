package Lv1;

import java.util.Scanner;

public class Lv1_11 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String [] ymd = new String[count];
        String total = "";
        String [] tt = new String[count];


        for (int i = 0; i < count; i++) {

            ymd[i] = sc.next();

            switch (ymd[i].substring(4, 6)) {
                case "01":
                case "03":
                case "05":
                case "07":
                case "08":
                case "10":
                case "12":

                    if (Integer.parseInt(ymd[i].substring(6, 8)) <= 31 && Integer.parseInt(ymd[i].substring(6, 8)) >= 1) {
                        total = ymd[i].substring(0, 4)+"/"+ymd[i].substring(4, 6)+"/"+ymd[i].substring(6, 8);
                    } else {
                        total = "-1";
                    }
                    break;

                case "04":
                case "06":
                case "09":
                case "11":
                    if (Integer.parseInt(ymd[i].substring(6, 8)) <= 30 && Integer.parseInt(ymd[i].substring(6, 8)) >= 1) {
                        total = ymd[i].substring(0, 4)+"/"+ymd[i].substring(4, 6)+"/"+ymd[i].substring(6, 8);
                    } else {
                        total = "-1";
                    }
                    break;

                case "02":
                    if (Integer.parseInt(ymd[i].substring(6, 8)) <= 28 && Integer.parseInt(ymd[i].substring(6, 8)) >= 1) {
                        total = ymd[i].substring(0, 4)+"/"+ymd[i].substring(4, 6)+"/"+ymd[i].substring(6, 8);
                    } else {
                        total = "-1";
                    }
                    break;

                default:
                    total = "-1";

                    break;

            }

            tt[i] = total;

        }

for (int j = 1; j <= count; j++){
    System.out.println("# " +j+" "+tt[j-1]);

}

    }

}
