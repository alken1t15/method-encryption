package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int k = scanner.nextInt();
        String[] words = new String[]{"А","Б","В","Г","Д","Е","Ё","Ж","З","И","Й","К","Л","М","Н","О","П","Р","С","Т","У","Ф",
                "Х","Ц","Ч","Ш","Щ","Ъ","Ы","Ь","Э","Ю","Я",};
        StringBuilder stringBuilder = new StringBuilder(word);
        for (int i = 0;i<stringBuilder.length();i++){
            String temp = String.valueOf(stringBuilder.charAt(i));
            if (!temp.equals(" ")){
                for (int j = 0;j< words.length;j++){
                    if (temp.equalsIgnoreCase(words[j])){
                        if (j+k<words.length){
                            stringBuilder.setCharAt(i,words[j+k].charAt(0));
                        }
                        else {
                            int index =words.length-j;
                            index = k - index;
                            stringBuilder.setCharAt(i,words[index].charAt(0));
                        }
                    }
                }
            }
        }
        System.out.println(stringBuilder);
    }
}