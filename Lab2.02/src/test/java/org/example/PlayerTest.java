package org.example;

import org.example.videoGame.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    @Test
    @DisplayName("Test Warrior")
    public void testWarriorConvertToElf() {
        Warrior warrior = new Warrior(100, 10, 3);
        Elf elf = warrior.convertToElf();
        assertEquals(100, elf.getHealth());
        assertEquals(10, elf.getStrength());
        assertEquals(3, elf.getLives());
        System.out.println("testWarriorConvertToElf OK!");
    }

    @Test
    @DisplayName("Test Elf")
    public void testElf() {
        Elf elf = new Elf(80, 15, 2);
        elf.setSpeed(5);
        assertEquals(80, elf.getHealth());
        assertEquals(15, elf.getStrength());
        assertEquals(2, elf.getLives());
        assertEquals(5, elf.getSpeed());
        System.out.println("testElf OK!");
    }

    @Test
    @DisplayName("Test Wizard")
    public void testWizardConvertToElf() {
        Wizard wizard = new Wizard(120, 8, 4);
        Elf elf = wizard.convertToElf();
        assertEquals(120, elf.getHealth());
        assertEquals(8, elf.getStrength());
        assertEquals(4, elf.getLives());
        System.out.println("testWizardConvertToElf OK!");
    }
}