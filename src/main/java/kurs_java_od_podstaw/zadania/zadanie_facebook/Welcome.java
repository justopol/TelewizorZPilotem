package kurs_java_od_podstaw.zadania.zadanie_facebook;

public class Welcome {

     public void welcomeParticipants(String imie, String nazwisko){
         System.out.println("Witaj na zajęciach "+ imie+" "+nazwisko);
         takeASeat();
    }

    private void takeASeat(){
        System.out.println("Please take a seat!");
    }
}
