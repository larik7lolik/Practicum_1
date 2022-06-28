// +Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму.
//Пример 1: а = 3, b = 2, ответ: 9
//Пример 2: а = 2, b = -2, ответ: 0.25
//Пример 3: а = 3, b = 0, ответ: 1
//Пример 4: а = 0, b = 0, ответ: не определено
//Пример 5
//входные данные находятся в файле input.txt в виде
//b 3
//a 10
//Результат нужно сохранить в файле output.txt
//1000

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int a = -2;
        int b = 0;
        double с = 1;

        if (b>0) {
            for (int i = 0; i < b; i++) {
                c = c * a;

            }
            System.out.println(c);}
            if ( b < 0) {
                double d = a;
                for (int i = 0; i > b; i--) {
                    c = c * (1/d);
                }
                System.out.println(c);
            }

            if ( b == 0) {

                System.out.println(1);
            }
            if (a == 0 && b == 0) {
                System.out.println("not defined");
            }
            System.out.println(Math.pow(a, b));

    }

        }


