package com.game;

public class Main {
	
	    public static void main(final String[] args) {
	        final Player1 player = new Player1("Shrihari", "sword", 100);
	        final Player2 betterPlayer = new Player2("Kishor", "Machine gun", 80, false);
	        final Player2 betterPlayer2 = new Player2("Shrihari", "Machine gun", 100, true);
	        betterPlayer2.damgeByGun1();
	    }
	}

