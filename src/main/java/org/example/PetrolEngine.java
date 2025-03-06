package org.example;

public class PetrolEngine implements IEngine{

    PetrolEngine(){
        System.out.println("Petrol engine constructor");
    }
    @Override
    public int start() {
        return 1;
    }
}
