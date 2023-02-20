package kurs_java_od_podstaw.zadania.zadanie_telewizory.Samsung;

import kurs_java_od_podstaw.zadania.zadanie_telewizory.Samsung.TelewizorSamsung;

public class UE43RU7172 extends TelewizorSamsung {

    private String id;
    private String hdmi;
    private String hdmi1;
    private String optyczne;
    private String usb;
    private String usb1;


    public UE43RU7172(String id) {
        super(43);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setHdmi(String hdmi) {
        this.hdmi = hdmi;
    }

    public void setHdmi1(String hdmi1) {
        this.hdmi1 = hdmi1;
    }

    public void setOptyczne(String optyczne) {
        this.optyczne = optyczne;
    }

    public void setUsb(String usb) {
        this.usb = usb;
    }

    public void setUsb1(String usb1) {
        this.usb1 = usb1;
    }
}
