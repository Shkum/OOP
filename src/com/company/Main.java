package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Konvertaciya(); // Конвертация валют
        //Chislo(); // Положительное или отрицательное
        //Prostoe_Chislo(); //Проверить простое число или нет
        //DelitsyaLy(); // Проверка делится ли число на 2 5 6 3 9 (1620) все вместе (или в закоментентеном по очереди)
        //Dom_Zad_No_4();
        //Dom_Zad_No_5();

    }

    static void Dom_Zad_No_4() {
        DomZadNo4 x = new DomZadNo4();
        int a[] = {9, 5, 4, 3, 1, 6, 8, 7, 9, 0, 2};
        x.print_massiv(a);
        System.out.println();
        x.print_massiv(x.Bubl_Sort(a));
    }

    static void Dom_Zad_No_5() {
        Integer a[] = {1, 2, 3, 4, 5};
        double c[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        for (int b : a) System.out.print(b + " ");
        Scanner txt = new Scanner(System.in);
        System.out.println("\nВведите целое число:");
        System.out.println(DomZadNo5.Soderzhit(a, txt.nextInt()) ? "Содержит" : "Не содержит");

        for (double b : c) System.out.print(b + " ");
        System.out.println("\n\nВведите дробное число:");
        System.out.println(DomZadNo5.Soderzhit(c, txt.nextDouble()) ? "Содержит" : "Не содержит");
    }

    static void DelitsyaLy() {
        Scanner txt = new Scanner(System.in);
        System.out.println("Введите число:");
        System.out.println(DelitsyaLyChislo.Delitsya(txt.nextInt()) ? "Делится" : "Не делится");
    }

    static void Prostoe_Chislo() {
        Scanner txt = new Scanner(System.in);
        System.out.println("Введите число:");
        System.out.println(ProstoeChislo.ProstChislo(txt.nextInt()) ? "Не простое" : "Простое");
    }


    static void Chislo() {
        PolozhOtrricatelnoe c = new PolozhOtrricatelnoe();
        Scanner txt = new Scanner(System.in);
        System.out.println("Введите число:");
        System.out.println(c.Proverka_chisla(txt.nextInt()) ? "Положительное" : "Отрицательное");
    }


    static void Konvertaciya() {
        int a = 0;
        Scanner txt = new Scanner(System.in);
        System.out.println("Выберите ржим конвертирования валюты:");
        System.out.println("1 - Доллары в гривну");
        System.out.println("2 - Гривну в доллары");
        a = txt.nextInt();
        if (a == 1) {
            System.out.println("Выбран режин конвертации долларов в гривну");
            System.out.println("Введите количество долларов для конвертации: ");
            System.out.println("Это равно: " + Exchange.UsdtoGrn(txt.nextInt()) + " гривен");
        } else if (a == 2) {
            System.out.println("Выбран режин конвертации гривны в доллары");
            System.out.println("Введите количество гривен для конвертации: ");
            System.out.println("Это равно: " + Exchange.GrntoUsd(txt.nextInt()) + " долларов");
        } else
            System.out.println("Такого режима конвертации нет");
    }
}
