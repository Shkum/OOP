package com.company;

public class DelitsyaLyChislo {
    public static Boolean Delitsya(int chislo){
        return (chislo%2==0 && chislo%5==0 && chislo%3==0 && chislo%6==0 && chislo%9==0);
        //return (chislo%2==0 || chislo%5==0 || chislo%3==0 || chislo%6==0 || chislo%9==0);
    }
}
