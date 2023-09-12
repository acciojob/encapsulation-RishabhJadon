package com.driver;

public class RWOnly {
    private int variable = 24;

    public int setVariable(int variable1)
    {
        this.variable = variable1;
        return variable;
    }
    public int getVariable()
    {
        return variable;
    }


}
