package org.example;

import java.util.ArrayList;

abstract public class Telephone {

    abstract public void ring();

    abstract public void lift();

    abstract public void disconnect();

}

class SmartTelescope extends Telephone{

    @Override
    public void ring() {
        System.out.println("The phone is ringing bro.");
    }

    @Override
    public void disconnect() {
        System.out.println("Why did you disconnect the phone bro.");
    }

    @Override
    public void lift() {
        System.out.println("What the fuck the bro. Whatchu doin");
    }
}

class forMain2{
    public static void main(String[] args) {
        SmartTelescope phone = new SmartTelescope();

        phone.ring();
        phone.disconnect();
        phone.lift();
    }
}