package kurs_java_od_podstaw.zadania;

import klasy_kurs.zadanie1.Programista;
import klasy_kurs.zadanie1.zadanie2.Array;
import klasy_kurs.zadanie1.zadanie3.Math;

import java.util.Locale;

public class Main {

    public static char changeLetter(char letter) {
        int value = letter;
        if (value >= 65 && value <= 90) {
            value += 32;
            return (char) value;
        } else if (value >= 97 && value <= 122) {
            value -= 32;
            return (char) value;
        }
        return Character.MIN_VALUE;
    }


    public static void main(String[] args) throws Exception {
        // zamiana liter w ascii table
        char letter = '.';

        System.out.println("litera " + letter);

        letter = changeLetter(letter);

        System.out.println("wartosc zamieniona " + letter);

        double[][] tablica = new double[][]{{1, 2, 3}, {1, 2, 3, 4, 5}};
        //double sum  = tablica[0][0] + tablica[0][1]+ tablica[0][2];
        double sum = tablica[1][0] + tablica[1][1] + tablica[1][2] + tablica[1][3] + tablica[1][4];
        System.out.println(tablica[1].length);
        System.out.println(sum);
//liczba parzsysta i nieparzysta if
        boolean liczba = evenNumber(5);
        System.out.println(liczba);


        //kalkulator podatkowy
        int wyliczenie = taxCalculator(100000);
        System.out.println(wyliczenie);

        //kalkulator
        int wynik = switchCalculator(10, 2, '+');
        System.out.println(wynik);

        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
        }


        //silnia
        int digit = 5;
        int suma = 1;
        for (int i = 1; i <= digit; i++) {
            suma = suma * i;
        }
        System.out.println("suma " + suma);

        //Napisz program, w którym po podaniu liczby n narysujesz za pomocą * (gwiazdki) trójkąt prostokątny
        // o przyprostokątnych składających się z n-razy * (gwiazdki) ;)
        //np. podając n = 5 powinniśmy otrzymać taki trójkąt:

        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.println(' ');
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
//                for (int k =1; k<=n-j;k++){
//                    System.out.print(' ');
//                }
            }
        }

//        Narysuj odbicie lustrzane trójkąta z poprzedniego zadania tj. dla n = 5 powinniśmy ujrzeć:

        for (int i = 1; i <= n; i++) {
            System.out.println(' ');
            for (int j = n - i; j > 0; j--) {
                System.out.print('.');
            }
            for (int k = n - i; k < n; k++) {
                System.out.print('*');
            }
        }
//        Napisz program, w którym po podaniu liczby n narysujesz za pomocą * (gwiazdki) drzewko choinkowe o wysokości n
// np. podając n = 5 powinniśmy otrzymać takie drzewko: 
        for (int i = 0; i <= n; i++) {
            System.out.println(' ');
            for (int j = n - i; j >= 0; j--) {
                System.out.print('.');
            }
            for (int k = (n - i) - i; k <= n; k++) {
                System.out.print('*');
            }

        }

        //zadania string
        System.out.println("zadania stringi");
        String name = "Justyna";
        String surname = "Opolska";
        String together = "Justyna Opolska";
        System.out.println(name.length());
        System.out.println(surname.length());
        System.out.println(together.length());

        String name1 = "Alicja";
        String name2 = "Jan";
        boolean result = name == name1;
        System.out.println("result 1 " + result);
        result = name.equals(name2);
        System.out.println("result 2 " + result);
        System.out.println(surname.toUpperCase(Locale.ROOT));
        System.out.println(surname.replace('a', 'e'));
        String sentens = "Potrafie coraz wiecej z programowania";
        for (int a = 0; a < sentens.length(); a++) {
            char letter1 = sentens.charAt(a);
            System.out.println(letter1);
        }
        for (int i = sentens.length() - 1; i >= 0; i--) {//jak to zapisac najprościej
            char letter2 = sentens.charAt(i);
            System.out.print(letter2);

        }
        System.out.println();
// prostokąt petla
        int a = 5;
        int b = 6;
        for (int i = 0; i < b; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < a - 2; i++) {
            System.out.print("*");
            for (int k = 0; k < b - 2; k++) {
                System.out.print(".");
            }
            System.out.println("*");
        }
        for (int i = 0; i < b; i++) {
            System.out.print("*");
        }
//        litera x petla
        int evenNumb = 5;

        for (int i = 0; i <= evenNumb - (evenNumb / 2); i++) {
            System.out.println(".");
        }
        System.out.println("znak x");
        int c = 5;
        int d = 5;
        int Tablica[][] = new int[c][d];
        for (int i = 0; i < Tablica.length; i++) {
            for (int j = 0; j < Tablica.length; j++) {
                System.out.print("/");
            }
            System.out.println("/");
        }
        System.out.println("arrayy");
        int size = 5;
        char[][] tab = makeArrayOfSpots(size);
        for (int i = 0; i < size; i++) {
            tab[i][i]= '*';
        }
        for (int i=size-1 ;i>=0;i--){
            tab[i][size-1 - i]='*';
        }
        printArray(tab);

        Programista programista = new Programista("stan","ford", "polski", 1234);
        System.out.println(programista.pobierzImie());

        Array array = new Array(new int[]{1,2,3,4,5});
        System.out.println(array.SumAllElememts());
        System.out.println(array.maxValueOfArray());
        System.out.println(array.minValueOfArray());
        System.out.println(array.countMean());

        System.out.println("wynik "+ Math.CountCircumferenceOfRectangle(2,3));
        Math.r = 2.5;
        System.out.println(Math.CountFieldOfCircle());


    }


    public static int switchCalculator(int cyfra1, int cyfra2, char znak) {
        switch (znak) {
            case '+':
                return cyfra1 + cyfra2;
            case '-':
                return cyfra1 - cyfra2;
            case '*':
                return cyfra1 * cyfra2;
            case '/':
                return cyfra1 / cyfra2;
            default:
                System.out.println("zle dzialanie");
        }
        return 0;
    }

    public static boolean evenNumber(int liczba) {
        if (liczba % 2 == 0)
            return true;
        return false;

    }

    public static int taxCalculator(int dochod) throws Exception {
        int podatek;
        if (dochod <= 85528 && dochod > 0) {
            podatek = dochod * 17 / 100;
        } else if (dochod > 85528) {
            podatek = (85528 * 17 / 100) + ((dochod - 85528) * 32 / 100);
        } else {
            throw new Exception("too small amount");
        }
        return podatek;
    }

    public static char[][] makeArrayOfSpots(int size) {
        char[][] array = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = '.';
            }
        }
        return array;
    }

    public static void printArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }


}
