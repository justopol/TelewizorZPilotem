package kurs_java_od_podstaw.zadania.zadanie_telewizory.Philips;

public class P43PUS65 extends TelewizorPhilips{

    private String hdmi;
    private String usb;


    public P43PUS65(String id) {
        super(id, 43);
    }

    public void setHdmi(String hdmi) {
        this.hdmi = hdmi;
    }

    public void setUsb(String usb) {
        this.usb = usb;
    }
}
