package org.example;

public class SchoolElf extends Elf{
    private boolean isPaid;

    @Override
    public void work(){
        if(isPaid){
            System.out.println(super.getName() + " Получил зарплату");
        }
        else {
            System.out.println(super.getName() + " Хочет работать бесплатно");
        }
        cleanTheKitchen();
        cookFood();
        System.out.println("Работа выполнена");
    }
    private void cleanTheKitchen(){
        System.out.println(super.getName() + " убирается на кухне");
    }
    private void cookFood() {
        System.out.println(super.getName() + " готовит еду");
    }
    public boolean isPaid(boolean b){
        return  isPaid;
    }
    public void setPaid(boolean paid){
        isPaid = paid;
    }




}
