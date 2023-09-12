package com.driver;

public class RWOnly {
    private String name = "Accio";

    public String setName(String newName)
    {
        this.name = newName;
        return name;
    }
    public String getName()
    {
        return name;
    }


}
