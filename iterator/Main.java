import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Main<T> implements Iterable<T> {

	public static void main(String[] args) {

		ArrayList<String> seznam = new ArrayList<String>();

		System.out.println("Seznam povinne cetby: ");
		seznam.add("Oliver Twist");
		seznam.add("Ztrata tridni knihy");
		seznam.add("R.U.R.");
		seznam.add("Bylo nas pet");
		seznam.add("Romeo a Julie");
		seznam.add("Farma zvirat");
		seznam.add("Krysar");
		seznam.add("Maly princ");

		Iterator<String> p = seznam.iterator();

		while (p.hasNext()) {
			System.out.println(p.next());

		}
		ArrayList<String>slovo= new ArrayList<String>();

		slovo.add("Slovo");
		slovo.add("K");
		slovo.add("A");
		slovo.add("J");
		slovo.add("A");
		slovo.add("K");
		slovo.add("Porad stejne");

		ListIterator iterator = slovo.listIterator();

		System.out.println("Zobrazeni normalne: ");

		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");

		}

		System.out.println("Zobrazeni pozpatku: ");

		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous() + " ");

		}
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;

	}
}