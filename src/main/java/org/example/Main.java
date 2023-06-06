package org.example;

import org.example.controler.Controler;

public class Main {
    public static void main(String[] args) {

        String str = "Hello man";
        char ch = 'l';
        Controler controler = new Controler();
        Controler.print(controler.findSymbolOccurance(str,ch));
        String str1 = "Apple";
        String str2 = "Plant";
        Controler.print(controler.findWordPosition(str1,str2));
        String str3 = "Ivanovich";
        Controler.print(controler.stringReverse(str3));
        String palindrome = "Not New York\", – Roy?? went';\" on";
        String palindrome1 = "Abudabi";
        Controler.print(controler.isPalindrome(palindrome));
        Controler.print(controler.isPalindrome(palindrome1));

    }


}