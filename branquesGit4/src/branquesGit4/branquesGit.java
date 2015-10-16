package branquesGit4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

public class branquesGit {

	public static void main(String[] args) {

		Random aleatoris = new Random();
		Scanner lector = new Scanner(System.in);

		ArrayList<Integer> array = new ArrayList<Integer>();

		for (int j = 0; j < 10; j++) {
			array.add(aleatoris.nextInt(500000));

		}
		Collections.sort(array);
		System.out.println(array);

		long x = System.nanoTime();
		boolean b = true;
		System.out.println("Entra un enter: ");
		int num = lector.nextInt();
		for (int i = 0; i < array.size(); i++) {
			if (num == array.get(i)) {
				long y = System.nanoTime();
				long time = (y - x) / 1000;
				System.out.println("He tardat " + time + " milisegons en trobar el número.");
				break;

			} else {
				b = false;
			}
		}
		if (b == false) {
			System.out.println("No es troba dins dels que ha generat el prograqma.");
		}

	}

}
