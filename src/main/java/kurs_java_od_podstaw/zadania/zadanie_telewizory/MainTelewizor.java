package kurs_java_od_podstaw.zadania.zadanie_telewizory;

import kurs_java_od_podstaw.zadania.zadanie_telewizory.Philips.P43PUS65;
import kurs_java_od_podstaw.zadania.zadanie_telewizory.Philips.P55PUS7334;
import kurs_java_od_podstaw.zadania.zadanie_telewizory.Samsung.UE43RU7172;

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
        System.out.println("1. wlacz; 2. wylacz; 3. zmien program; 4. zakoncz program;");
        while (opcja!=4){
            opcja=scanner.nextInt();

            switch (opcja){
                case 1:
                    tv.wlacz();
                    break;
                case 2:
                    tv.wylacz();
                    break;
                case 3:
                    System.out.println("podaj numer programu:");
                    int numer = scanner.nextInt();
                    tv.przelaczProgram(numer);
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
        int opcja;

        System.out.println("0. Nacisnij czerwony;1. Nacisnij 1;2. Nacisnij 2;3. Nacisnij 3;4. Zakoncz");
        do {
            opcja = scanner.nextInt();
            switch (opcja){
                case 0:
                    pilot.nacisnijCzerwony();
                    break;
                case 1:
                    pilot.nacisnijJeden();
                    break;
                case 2:
                    pilot.nacisnijDwa();
                    break;
                case 3:
                    pilot.nacisnijTrzy();
                    break;
            }
        }while (opcja!=4);
        pilot.nacisnijCzerwony();
        scanner.close();
    }
}
