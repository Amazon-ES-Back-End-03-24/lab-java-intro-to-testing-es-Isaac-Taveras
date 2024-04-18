package org.example.videoGame;

public class Warrior extends Player{
    private int strengthPlus;

    public Warrior(int health, int strength, int lives) {
        super(health, strength, lives);
        this.strengthPlus = strength;
    }

    public int getStrengthPlus() {
        return strengthPlus;
    }

    public void setStrengthPlus(int strengthPlus) {
        this.strengthPlus = strengthPlus;
    }

    public Elf convertToElf(){
        return new Elf(getHealth(), getStrength(), getLives());
    }
}
