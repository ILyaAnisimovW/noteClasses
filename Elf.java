package org.example;


public abstract class Elf{
    private String name;
    public abstract void work();
    public void disappear(){
        System.out.println("Эльф невидем!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}







