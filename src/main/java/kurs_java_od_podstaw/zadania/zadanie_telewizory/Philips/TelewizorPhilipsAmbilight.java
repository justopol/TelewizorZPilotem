package kurs_java_od_podstaw.zadania.zadanie_telewizory.Philips;

public abstract class TelewizorPhilipsAmbilight extends TelewizorPhilips{


    protected TelewizorPhilipsAmbilight(String id, int cale) {
        super(id, cale);
    }

    @Override
    public void wlacz() {
        super.wlacz();
        amblilight();
    }

    @Override
    public void wylacz() {
        super.wylacz();
    }

    private void amblilight(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (statusWlaczony){
                    try {
                        System.out.println("wyswietlaj kolorki z tylu");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
