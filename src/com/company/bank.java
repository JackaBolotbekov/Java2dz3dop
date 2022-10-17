package com.company;

import java.util.Scanner;

public class bank {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] som = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 3, 1};
            int[] amount = {2, 2, 3, 3, 2, 1, 2, 3, 5, 5, 10};
            int summa = 0;
            for (int i = 0; i < som.length; i++) {
                summa += som[i] * amount[i];
            }

            int add = scanner.nextInt();
            for (int i = 0; i < amount.length; i++) {
            if (amount[i] == 0) {
                som[i] = 0;
            }else {
            for (int e = add; i < som[i]; amount[i]--) {

            }}}

//
//            System.out.println("Введите желаемую сумму: ");
//            while (true)
//                if (scanner.hasNextInt()) {
//                    int add = scanner.nextInt();
//                    if (add == summa) {
//                        System.out.print("Вы получили ");
//                        for (int i = 0; i < amount.length; i++) {
//                            if (amount[i] >= 0 )
//                                System.out.print(amount[i] + "x" + som[i] + " ");
//                        }System.out.println("\n" + "Всего = " + (summa - add));
//
//                    }else if (add > 0 && add <= summa) {
//                        System.out.print("Вы получили ");
//                        for (int i = 0; i < amount.length; i++) {
//                            System.out.print(amount[i] + "x" + som[i] + " ");
//                        }System.out.println("\n" + "Всего = " + (summa - add));
//
//                    } else if (add == 0) {
//                        System.out.println("Вы нечего не сняли. Попробуйте снова!");
//                    } else {
//                        System.out.println("Вы можете снять только " + summa);
//                    }}
//                else if (summa == 0){break;}
//                else {System.out.println("Извините, но это неверное значение. Попробуйте снова!");break;}
      }

    }