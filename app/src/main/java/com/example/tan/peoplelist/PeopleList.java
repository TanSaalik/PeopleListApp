package com.example.tan.peoplelist;

import java.util.ArrayList;
import java.util.List;

public class PeopleList {
    private static final String[][] people = {
            {"Mati", "Nuude"},
            {"Kati", "Karu"},
            {"Mihkel", "Valk"},
            {"Mingi", "Vend"}
    };

    private final List<People> list = new ArrayList<>();

    public PeopleList(){
        for(String[] people : people) list.add(new People(people[0], people[1]));
    }
}
