package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            //task1();
            //task2();
            task3();
            //task4();
            //task5();
        }
/**
 *  Вычислить (1 + sin 0,1)(1 + sin 0,2) ... (1 + sin 10).
 */

        private static void task1() {
            double resultValue = 1;
            for( double i = 0.1; i <= 10; i += 0.1)
                resultValue *= (1+Math.sin(i));
            System.out.println("Ответ: " + resultValue);

        }
/**Вычислить сумму  при x+x^3/3 + x^5/5 + ... + x^11/11 . x = 2*/
        private static void task2() {
            double resultValue = 0;
            for( double i = 1; i <= 11; i += 2)
                resultValue += (Math.pow(2, i)/i);
            System.out.println("Ответ: " + resultValue);
        }

 /**Известна масса каждого из 12 предметов. Определить массу самого тяжёлого предмета.*/

        private static void task3() {
           int Lenght = 12;
           double max_weight = -101;
            double[] Array = new double[Lenght];
            for(int i = 0; i < Lenght; i++){
                Array[i] = Math.random()*200-100;
                System.out.println(Array[i] + " ");
                if(Array[i] > max_weight)
                    max_weight = Array[i];
            }
            System.out.println("Максимальный вес:" + max_weight);
        }


 /**Сколько можно купить быков, коров и телят, платя за быка 7000 грн., за корову — 3000 грн., а за телёнка — 1000 грн., если на 100000 грн. надо купить 100 голов скота? Для решения задачи составить алгоритм. */

    private static void task4() {
        second:
        for (int bull = 0; bull < 101; bull++) {
            if (bull == 100 && bull * 7000 <= 100000) {
                System.out.println("Нужно купить: " + bull + "быков");
                break second;
            }

            for (int cow = 0; cow < 101; cow++) {
                if (bull + cow == 100 && bull * 7000 + cow * 3000 <= 100000) {
                    System.out.println("Нужно купить: " + bull + " быков и " + cow + " коров");
                    break second;
                }

                for (int calves = 0; calves < 101; calves++) {
                    if (bull + cow + calves == 100 && bull * 7000 + cow * 3000 + calves * 1000 <= 100000) {
                        System.out.println("Нужно купить: " + bull + " быков и " + cow + " коров и " + calves + "телят");
                        break second;
                    }
                }
            }
        }
    }

/**Проверить, действительно ли число n^5 + 5n^3 + 4n при любом натуральном n делится на 12.
*/
 private static void task5() {
 Scanner Scanner = new Scanner(System.in);
 System.out.println("Введите натуральное n: ");
 int n = Scanner.nextInt();
 if(n<1)
 System.out.println("Число n не натуральное");
 else
 if((Math.pow(n,5)+5*Math.pow(n,3)+4*n)%120==0)
 System.out.println("Делится");
 else
 System.out.println("Не делится");
 }
}
