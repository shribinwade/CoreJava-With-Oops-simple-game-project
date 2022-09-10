package com.game;

public class Player1 {
	 private String name;
	    private String weapon;
	    private int health;
	    
	    public Player1(final String name, final String weapon, final int health) {
	        this.name = name;
	        this.weapon = weapon;
	        if (health < 0 || health > 100) {
	            this.health = 100;
	        }
	        else {
	            this.health = health;
	        }
	    }
	    
	    public void damgeByGun1() {
	        this.health -= 30;
	        if (this.health <= 0) {
	            this.health = 0;
	        }
	        System.out.println("Got hit by gun 1. Health is reduced by 30  New health is:" + this.health);
	        if (this.health == 0) {
	            System.out.println(String.valueOf(this.getName()) + " is dead");
	        }
	    }
	    
	    public void damgeByGun2() {
	        this.health -= 50;
	        if (this.health <= 0) {
	            this.health = 0;
	        }
	        System.out.println("Got hit by gun 2. Health is reduced by 50 New health is:" + this.health);
	        if (this.health == 0) {
	            System.out.println(String.valueOf(this.getName()) + " is dead");
	        }
	    }
	    
	    public String getName() {
	        return this.name;
	    }
	    
	    public void setName(final String name) {
	        this.name = name;
	    }
	    
	    public String getWeapon() {
	        return this.weapon;
	    }
	    
	    public void setWeapon(final String weapon) {
	        this.weapon = weapon;
	    }
	    
	    public int getHealth() {
	        return this.health;
	    }
	    
	    public void setHealth(final int health) {
	        this.health = health;
	    }
}
