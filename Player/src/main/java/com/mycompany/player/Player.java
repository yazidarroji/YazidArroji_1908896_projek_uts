/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.player;

/**
 *
 * @author yazidarroji
 */
public class Player {
    private String name;
    private int health;
    private String weapon;

    // Konstruktor
    public Player(String name, int health, String weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    // Method attack
    public String attack() {
        return name + " is attacking\n" + name + " health before " + health;
    }

    // Method healing
    public String healing() {
        this.health += 50;
        return name + " is healing\n" + name + " health after healing " + health;
    }

    // Method changeWeapon
    public String changeWeapon(String newWeapon) {
        this.weapon = newWeapon;
        return "ChangeWeapon( "+ weapon+" )";
    }

    // Method displayWeapon
    public String displayWeapon() {
        return name + " weapon now is " + weapon;
    }

    public static void main(String[] args) {
        Player player1 = new Player("Arthur", 100, "Axe");

        System.out.println(player1.attack());
        System.out.println(player1.healing());
        System.out.println(player1.changeWeapon("Sword"));
        System.out.println(player1.displayWeapon());
    }
}

