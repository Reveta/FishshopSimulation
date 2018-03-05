import time.Time;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//         Time.time();
//        Time.time().skipDay();
//        System.out.println(Time.time().timeNow());
        boolean i=true;
        while (i){
            System.out.println("1-Skip Day; \n 2-Show Currently Time \n 0- Close program ");
            switch (new Scanner(System.in).nextInt()){
                case 1:
                    Time.time().skipDay(new Scanner(System.in).nextInt());
                    break;
                case 2:
                    System.out.println(Time.time().timeNow());
                    break;
                case 0:
                    i=false;
                    break;
            }
        }
    }
}
