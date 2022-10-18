package org.example;

import java.sql.SQLOutput;


    class Cellphone{
        int c = 1;
        public String Ring (){
            String Ringing = "Ring  ing";
            return Ringing;
        }
        public String Vibrate (){
            String vibrate = "Vibrating";
            return vibrate;
        }
}
public class Main {

    public static void main(String[] args) {
        Cellphone phone = new Cellphone();

        System.out.println(phone.Ring());
        System.out.println(phone.Vibrate());
    }

}

