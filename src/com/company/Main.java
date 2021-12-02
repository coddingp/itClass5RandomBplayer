//package com.company;
//
//import java.util.Random;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Random random = new Random();
//        int x = 20;
//        int[] BasketballPl = new int[20];
//        int cnt = 0;
//        double sum = 0;
//        for (int i = 0; i < BasketballPl.length; i++) {
//            BasketballPl[i] = random.nextInt((220 - 170) + 1) + 170;
//            if (BasketballPl[i] >= 180 && BasketballPl[i] <= 190) {
//                System.out.println("Баскетболист " + BasketballPl[i] + " см");
//                cnt++;
//                sum += BasketballPl[i];
//            }
//        }
//        System.out.println("Средний рост баскетболистов: " + sum / cnt);
//    }
//}


package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int x = 100;
        int[] randomNum = new int[x];
        int cnt = 0;
        float sum = 0;

        for (int i = 0; i < randomNum.length; i++) {
            randomNum[i] = random.nextInt((100 - 0) + 1) + 0;

            System.out.println("Случайное число массивва в ячейке " + cnt + " " + randomNum[i]);
            cnt++;
            sum += randomNum[i];
        }
        System.out.println("Средн арифмическое число = " + sum / cnt);
    }
}