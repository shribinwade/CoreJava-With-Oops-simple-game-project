package com.game;

public class Player2 extends Player1 {
	 private int health;
	    private boolean armour;
	    
	    public Player2(final String name, final String weapon, final int health, final boolean armour) {
	        super(name, weapon, health);
	        if (health < 0 || health > 100) {
	            this.health = 100;
	        }
	        else {
	            this.health = health;
	        }
	        this.armour = armour;
	    }
	    
	    @Override
	    public void damgeByGun1() {
	        if (this.armour) {
	            this.health -= 20;
	            if (this.health <= 0) {
	                this.health = 0;
	            }
	            System.out.println("Armour is on. Got hit by Gun 1.Health is reduced by 20new health is " + this.health);
	        }
	        if (!this.armour) {
	            this.health -= 30;
	            if (this.health <= 0) {
	                this.health = 0;
	            }
	            System.out.println("Armour is off. Got hit by gun 1. Health is reduced by 30 New health is " + this.health);
	        }
	        if (this.health == 0) {
	            System.out.println(String.valueOf(this.getName()) + " is dead");
	        }
	    }
	    
	    @Override
	    public void damgeByGun2() {
	        if (this.armour) {
	            this.health -= 40;
	            if (this.health <= 0) {
	                this.health = 0;
	            }
	            System.out.println("Armour is on. Got hit by Gun 1.Health is reduced by 40new health is " + this.health);
	        }
	        if (!this.armour) {
	            this.health -= 50;
	            if (this.health <= 0) {
	                this.health = 0;
	            }
	            System.out.println("Armour is off. Got hit by gun 1. Health is reduced by 50New health is " + this.health);
	        }
	        if (this.health == 0) {
	            System.out.println(String.valueOf(this.getName()) + " is dead");
	        }
	    }
}
