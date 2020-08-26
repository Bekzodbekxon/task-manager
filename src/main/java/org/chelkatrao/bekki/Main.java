package org.chelkatrao.bekki;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Translator translator = new Translator();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово:");
        String str = scanner.next();

        System.out.println(translator.converter(str));
    }

}
