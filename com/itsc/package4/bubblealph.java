package com.itsc.package4;
public class bubblealph {

        public static void main(String[] args) {

            char[] chars = {'a','b','c','d','e','l','m','n','a','p','q','B','C','D'};
            bubbleSort(chars);
            for (char charElement : chars) {
                System.out.print(charElement+ " ");
            }

        }

        static void bubbleSort(char[] chars) {
            int n = chars.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (chars[j] > chars[j + 1]) {
                        chars[j] = (char) (chars[j] + chars[j + 1]);
                        chars[j + 1] = (char) (chars[j] - chars[j + 1]);
                        chars[j] = (char) (chars[j] - chars[j + 1]);
                    }
                }
            }
        }
}

