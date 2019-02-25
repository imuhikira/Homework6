package edu.dmacc.codedsm.hw6;


import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import javax.naming.Name;
import javax.sound.midi.Soundbank;

public class StringCombiner {


    public static void main(String[] args) {
        String fistname= "Ismael";
        String lastname= "Muhikira";
    String name= getName(fistname,lastname);

        System.out.println(name);

        String todaysDate = outputDate();
        System.out.println(todaysDate);

        String Namedate= getName(name,todaysDate);
        System.out.println(Namedate);
        
    }

    public static String getName (String stringFirstname ,String stringLastname){

        return stringFirstname + " "+ stringLastname;


    }
    public static String outputDate(){

        SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy");
        return format.format(Date.from(Instant.now()));

    }


}
