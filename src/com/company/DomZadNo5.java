package com.company;

public class DomZadNo5 {

        public static Boolean Soderzhit(Integer[] chislo, Integer inChislo) {
            for (int i = 0; i < chislo.length; i++)
                if (chislo[i] == inChislo)
                    return true;
            return false;

        }
        public static Boolean Soderzhit(double[] chislo, double inChislo) {
            for (int i = 0; i < chislo.length; i++)
                if (chislo[i] == inChislo)
                    return true;
            return false;

        }
    }

