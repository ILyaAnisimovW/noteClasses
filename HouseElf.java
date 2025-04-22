package org.example;

public class HouseElf extends  Elf{
    @Override
    public void work() {
    doErrand();
        System.out.println("Работа выполнена!");
    }
    public void doErrand() {
        System.out.println(super.getName()+ " выполняет поручение хозяина");
    }



}
