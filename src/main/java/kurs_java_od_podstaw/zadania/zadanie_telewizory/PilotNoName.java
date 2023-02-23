package kurs_java_od_podstaw.zadania.zadanie_telewizory;

public class PilotNoName implements Pilot {


    private Telewizor telewizor;
    @Override
    public void nacisnijCzerwony() {
        telewizor.akcjaZasilania();
    }

    @Override
    public void dodajProgram() {
        telewizor.przelaczProgram('+');
    }

    @Override
    public void odejmijProgram() {
        telewizor.przelaczProgram('-');
    }


    @Override
    public void sparujTelewizor(Telewizor telewizor) {
        this.telewizor = telewizor;
    }
}
