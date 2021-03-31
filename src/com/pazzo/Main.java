package com.pazzo;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, String> songDescription = new HashMap<String, String>();

        songDescription.put("Artist", "The Script ft Will.i.am");
        songDescription.put("Song genre", "Pop Rock");
        songDescription.put("Song duration", "3minutes 22seconds");
        songDescription.put("Label", "Epic Records, Phonogenic");
        songDescription.put("Producers", "Danny O'Donoghue, Mark Sheehan, Jimbo Barry");
        songDescription.put("Song writer", "Danny O'Donoghue");
        songDescription.put("Album", "3");
        songDescription.put("Year recorded", "2012");
        songDescription.put("Year released", "2012");
        songDescription.put("Song alphabet", "H");
        songDescription.put("Copies sold", "2,912,000");

        songDescription.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
    }
}
