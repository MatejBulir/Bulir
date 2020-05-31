package CZ.spsejecna.bulir.c2a.halda;

public class Main {

	public static void main(String[] args) {
		Halda h = new Halda();
		h.insert(1);		
		h.insert(2);
		h.insert(3);	
		h.insert(4);	
		h.insert(5);	
		h.insert(6);	
		h.insert(7);		
		h.insert(8);
int y = h.size();		
		for(int i = 0; i<y;i++) {
			System.out.println(h.extractMin());
		}
	}

}
