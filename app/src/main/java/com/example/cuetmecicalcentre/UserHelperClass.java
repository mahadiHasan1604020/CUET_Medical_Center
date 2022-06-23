package com.example.cuetmecicalcentre;

import android.widget.EditText;

public class UserHelperClass {
    String med1,med2,med3,med4;

    public UserHelperClass(String med1, String med2, String med3, String med4) {
        this.med1 = med1;
        this.med2 = med2;
        this.med3 = med3;
        this.med4 = med4;
    }

    public String getMed1() {
        return med1;
    }

    public void setMed1(String med1) {
        this.med1 = med1;
    }

    public String getMed2() {
        return med2;
    }

    public void setMed2(String med2) {
        this.med2 = med2;
    }

    public String getMed3() {
        return med3;
    }

    public void setMed3(String med3) {
        this.med3 = med3;
    }

    public String getMed4() {
        return med4;
    }

    public void setMed4(String med4) {
        this.med4 = med4;
    }

    UserHelperClass(EditText inputmed1, EditText inputmed2, EditText inputmed3, EditText inputmed4){}
}

