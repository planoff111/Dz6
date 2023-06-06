package org.example.controler;

public class Controler {



    public int findSymbolOccurance(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public int findWordPosition(String str1, String str2) {

        return str1.indexOf(str2);
    }

    public String stringReverse(String str){

        return new StringBuilder(str).reverse().toString();
    }

    public boolean isPalindrome(String str){
        str = str.replace(" ", "").toLowerCase();
        str = str.replace("-", "").toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        return str.equals(new StringBuilder(str).reverse().toString());


    }



    public static void  print(int num){
        System.out.println(num);
    }

    public static void  print(String str){
        System.out.println(str);
    }

    public static void  print(boolean bool){
        System.out.println(bool);
    }
}
