package CZ.spsejecna.bulir.c2a.halda;

public class Halda<T extends Comparable<T>> {
	int pole[];
	int velikost;

	public int getParent(int i) {
		if (i % 2 == 0)
			return (i - 1) / 2;
		return i / 2;
	}

	public int getLeftChild(int i) {
		return 2 * i + 1;
	}

	public int getRightChild(int i) {
		return 2 * i + 2;
	}

	public void insert(int i) {
		if (velikost <= 0) {
			velikost = 1;
			pole = new int[16];
			pole[velikost - 1] = i;
		} else {
			if (velikost >= pole.length) {
				int[] pole2 = new int[pole.length * 2];
				for (int l = 0; l < pole.length; l++)
					pole2[l] = pole[l];

				pole = pole2;

			}
			pole[velikost] = i;
			int Index = velikost;
			velikost++;
			while (Index !=0 && pole[Index] < pole[getParent(Indext)]) {
				int pomocna = pole[getParent(Index)];
				pole[Index] = pomocna;
				Index = getParent(Index);
			}
		}
	}
	public int min() {
		return pole[0];
	}

	void swap(int x, int y) {
		int temp = pole[x];
		pole[x] = pole[y];
		pole[y] = temp;
	}

	public void MinPole(int i) {
		int l = getLeftChild(i);
		int r = getRightChild(i);
		int smallest = i;
		if (l < velikost && pole[l] < pole[i])
			smallest = l;
		if (r < velikost && pole[r] < pole[smallest])
			smallest = r;
		if (smallest != i) {
			swap(i, smallest);
			MinPole(smallest);
		}
	}
	public int extractMin() {
		if (pole.length == 1) {
			velikost--;
			return pole[0];
		}
		int root = pole[0];
		pole[0] = pole[velikost - 1];
		velikost--;
		MinPole(0);
		return root;
	}

	public int size() {
		return velikost;
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < velikost; i++)
			s += pole[i] + (i < velikost - 1 ? "," : "");
		return s;
	}

}
