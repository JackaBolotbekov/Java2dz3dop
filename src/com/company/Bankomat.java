package com.company;
import java.util.*;

public class Bankomat {

        static int com[] = {500, 200, 100, 50, 20, 10, 5, 3, 1};

        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int result = 0;

            for(int i = 0; i < com.length; i++) {
                result += n / com[i];
                n = n % com[i];
            }if (n > 0) {
                System.out.println("-1");
            }else
                System.out.println(result);
            scanner.close();
        }
    }

