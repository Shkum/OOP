package com.company;

public class Exchange {
   private static float curr = (float)26.2;

    public static float UsdtoGrn(int usd){

        return usd*curr;
    }
    public static float GrntoUsd(int grn){

        return grn/curr;
    }
}
