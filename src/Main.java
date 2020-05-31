import java.util.Random;
import cz.spsejecna.c2a.vorlicek.halda.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rnd = new Random();
		Halda heap = new Halda();

		for (int i = 0; i < 100; i++) {
			int rand = rnd.nextInt(1000);
			heap.insert(rand);
		}

		System.out.println(heap.size());

		for (int i = 0; i < 100; i++) {
			System.out.println(heap.extractMin());
		}

		System.out.println(heap.size());

	}

}
