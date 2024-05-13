package com.itsc.package5;
public class merge {
    public static void main(String[] args) {
        int[] array = {1, 4,5, 3, 5, 33, 15, 7, 8,5, 2};
        mergeSort(array);
        for(int i: array){
            System.out.print(i+" ");
        }

    }

    static void mergeSort(int[] array) {

        int length = array.length;
        if(length <= 1) return;

        int m = length /2;

        int[] larr = new int[m];
        int[] rarr = new int[length - m];

        for(int i = 0, j = 0; i < length; i++) {
            if (i < m) {
                larr[i] = array[i];
            }
            else {
                rarr[j] = array[i];
                j++;
            }
        }

        mergeSort(larr);
        mergeSort(rarr);
        merge(larr, rarr, array);
    }

    static void merge(int[] larr, int[] rarr, int[] array) {

        int ls = array.length/2;
        int rs = array.length - ls;


        int i = 0, l=0,r=0;
        while(l < ls && r < rs) {
            if(larr[l] < rarr[r])
            {
                array[i] = larr[l];
                i++;
                l++;
            }
            else {
                array[i] = rarr[r];
                r++;
                i++;
            }

        }
        while(l < ls) {
            array[i] = larr[l];
            l++;
            i++;
        }
        while(r < rs) {
            array[i] = rarr[r];
            r++;
            i++;
        }

    }
}
