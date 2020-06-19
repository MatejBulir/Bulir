package CZ.spsejecna.bulir.c2a.halda;

public class Main {

	public static void main(String[] args) {
		Halda h = new Halda();
		for(int i =0; i<9; i++) {
			h.insert(i);
		}
int y = h.size();		
		for(int i = 0; i<y;i++) {
			System.out.println(h.extractMin());
		}
	}

}
