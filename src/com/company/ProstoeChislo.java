package com.company;

public class ProstoeChislo {

    public static Boolean ProstChislo(int chislo) {
        Boolean i = false;
        for (int j = 2; j <= chislo/2; j++) {
            if (chislo%j==0)
                i=true;
        }
        return i;
    }
}
