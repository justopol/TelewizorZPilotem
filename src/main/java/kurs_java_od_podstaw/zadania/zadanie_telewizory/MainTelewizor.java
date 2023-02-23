package kurs_java_od_podstaw.zadania.zadanie_telewizory;

import kurs_java_od_podstaw.zadania.zadanie_telewizory.Philips.P55PUS7334;

import java.util.Scanner;

public class MainTelewizor {
    public static void main(String[] args) {

        //obslugaTelewizora();
        obslugaPilota();
    }



    private static void obslugaTelewizora(){
        Scanner scanner = new Scanner(System.in);
     Telewizor tv = new P55PUS7334("unikalneid123");

        int opcja=0;
        System.out.println("1. wlacz; 2. wylacz; 3. zmien program ++; 4. zmien program --; 5. zakoncz program;");
        while (opcja!=5){
            opcja=scanner.nextInt();

            switch (opcja){
                case 1:
                    tv.wlacz();
                    break;
                case 2:
                    tv.wylacz();
                    break;
                case 3:
                    tv.przelaczProgram('+');
                    break;
                case 4:
                    tv.przelaczProgram('-');
                    break;
            }
        }
        scanner.close();
    }

    private static void obslugaPilota(){
        Pilot pilot = new PilotNoName();
        Telewizor telewizor = new P55PUS7334("unikalneid1f233");
        pilot.sparujTelewizor(telewizor);

        Scanner scanner = new Scanner(System.in);
        char opcja;

        System.out.println("0. Nacisnij czerwony;1. dodaj program(+);2. odejmij progeam(-) ;4. Zakoncz");
        do {
            opcja = scanner.next().charAt(0);
            switch (opcja){
                case '0':
                    pilot.nacisnijCzerwony();
                    break;
                case '+':
                    pilot.dodajProgram();
                    break;
                case '-':
                    pilot.odejmijProgram();
                    break;
            }
        }while (opcja!='4');
        telewizor.wylacz();
        scanner.close();
    }
}
