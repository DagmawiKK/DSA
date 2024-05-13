package com.itsc.package6;
public class deleteArrayElement {
    public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 4};
        int index = 4;
        deleteElement(array, index);
    }

    static void deleteElement(int[] array, int index) {

        if(index < 0 || index >= array.length) {
            System.out.println(" Invalid index.");
        }
        else {
            int[] arrayresult  = new int[array.length - 1];
            for(int i = 0; i < index; i++) {
                arrayresult[i] = array[i];
            }
            for(int j = index; j < arrayresult.length; j++) {
                arrayresult[j] = array[j + 1];
            }
            for(int i = 0; i < arrayresult.length; i++){
                System.out.print(arrayresult[i] + " ");
            }
        }
    }


}
