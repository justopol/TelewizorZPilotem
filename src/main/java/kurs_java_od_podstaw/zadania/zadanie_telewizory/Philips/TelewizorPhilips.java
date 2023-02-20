package kurs_java_od_podstaw.zadania.zadanie_telewizory.Philips;

import kurs_java_od_podstaw.zadania.zadanie_telewizory.Telewizor;

public class TelewizorPhilips implements Telewizor {

    private String id;
    protected boolean statusWlaczony = false;

    private int obecnyProgram = 3;
    private int cale;

    public TelewizorPhilips(String id, int cale) {
        this.id = id;
        this.cale = cale;
    }

    public String getId() {
        return id;
    }

    public int getCale() {
        return cale;
    }

    @Override
    public void wlacz() {
        statusWlaczony =true;
        emitujSygnalNaEkranie();
        System.out.println("witaj");
    }

    @Override
    public void wylacz() {
        statusWlaczony = false;
        System.out.println("czarnosc");
    }

    @Override
    public void akcjaZasilania() {
        if (statusWlaczony){
            wylacz();
        }else {
            wlacz();}
    }

    @Override
    public void przelaczProgram(int numer) {

        if(statusWlaczony){
            obecnyProgram = numer;
        }
    }

    private void emitujSygnalNaEkranie(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (statusWlaczony){
                System.out.println("program: "+obecnyProgram);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        }).start();
    }
}
