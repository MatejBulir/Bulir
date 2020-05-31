package cz.spsejecna.bulir.c2a;

import java.util.Random;

import CZ.spsejecna.bulir.c2a.halda.Halda;

public class Main {

	public static void main(String[] args) {
		Halda h = new Halda();
		Random r =  new Random();
		for(int j = 0; j<100;j++) {
			h.insert(r.nextInt(150));
		}
int y = h.size();		
		for(int i = 0; i<y;i++) {
			System.out.println(h.extractMin());
		}

	}

}
