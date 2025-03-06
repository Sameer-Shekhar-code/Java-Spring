package org.example;

public class DieselEngine implements IEngine{

    DieselEngine(){
        System.out.println("Diesel engine constructor");
    }
    @Override
    public int start() {
        return 1;
    }
}
