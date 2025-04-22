package org.example;

public class tests {
    public static void main(String[] args){

        Elf elf = new HouseElf();
        HouseElf houseElf = new HouseElf();
        SchoolElf schoolElf = new SchoolElf();

        elf.setName("kreacher");
        elf.work();

        houseElf.setName("Doby");
        houseElf.work();

        schoolElf.setName("Winky");
        schoolElf.isPaid(false);
        schoolElf.work();
    }
}




