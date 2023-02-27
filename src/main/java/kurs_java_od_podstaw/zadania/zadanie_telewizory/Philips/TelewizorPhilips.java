package kurs_java_od_podstaw.zadania.zadanie_telewizory.Philips;

import kurs_java_od_podstaw.zadania.zadanie_telewizory.Telewizor;

import java.util.ArrayList;
import java.util.List;

public class TelewizorPhilips implements Telewizor {

    private String id;
    protected boolean statusWlaczony = false;

    private int obecnyProgram = 3;
    private int cale;
    List<String> kanaly= new ArrayList<String>();

    public TelewizorPhilips(String id, int cale) {
        this.id = id;
        this.cale = cale;
        kanaly.add("TVP 1");
        kanaly.add("polsat");
        kanaly.add("TVP 2");
        kanaly.add("tvn");
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
    public void przelaczProgram(char znak) {
        if(statusWlaczony){
            if (znak == '+'){
                if (obecnyProgram == kanaly.size()){
                    obecnyProgram =0;
                }
                obecnyProgram ++;
            }
            else obecnyProgram --;
        }
    }

    private void emitujSygnalNaEkranie(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (statusWlaczony){
                System.out.println("program: "+kanaly.get(obecnyProgram));
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
