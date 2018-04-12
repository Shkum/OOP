package com.company;

public class DomZadNo4 {
    public int[] Bubl_Sort(int massiv[]) {
        Boolean flag ;
        int tmp;
        do {
            flag = false;
            for (int i = 0; i < massiv.length-1; i++) {
                if (massiv[i] > massiv[(i + 1)]) {
                    tmp = massiv[(i)];
                    massiv[i] = massiv[(i + 1)];
                    massiv[(i + 1)] = tmp;
                    flag=true;
                }
            }
        } while (flag == true);
        return massiv;
    }

    public void print_massiv(int[] massiv){
        for (int a:massiv)
            System.out.print( a+ " ");
    }
}
