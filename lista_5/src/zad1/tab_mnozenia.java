package zad1;

import java.text.ParseException;
import java.util.Scanner;

public class tab_mnozenia {
	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		int n = 0;
		do {
			System.out.print("Podaj n: ");
			try {
				n = sc.nextInt();
			} catch (NumberFormatException n1) {
			}
		} while (n <= 0);
		sc.close();

		String wypisanieLinijki = " ";

		int[][] tablica = new int[n][n];

		for (int x = 0; x <= n; x++) {
			for (int y = 0; y <= n; y++) {
				if (x == 0 && y == 0) {
					wypisanieLinijki = spacje(wypisanieLinijki, 1, 1, n);
					wypisanieLinijki += "  ";
				} else if (x == 0) {
					wypisanieLinijki = spacje(wypisanieLinijki, 1, y, n);
					wypisanieLinijki += " " + y;
				} else if (y == 0) {
					wypisanieLinijki = spacje(wypisanieLinijki, x, 1, n);
					wypisanieLinijki += " " + x;
				} else {
					wypisanieLinijki = spacje(wypisanieLinijki, x, y, n);
					wypisanieLinijki += " " + (x * y);
				}
			}
			System.out.print("\n" + wypisanieLinijki);
			wypisanieLinijki = " ";
		}

	}

	static String spacje(String wypisanieLinijki, int x, int y, int n) {
		int k = n * y;
		String lenghtMax = "" + k;
		k = lenghtMax.length() + 1;
		int l = x * y;
		String lenghtNumber = "" + l;
		l = lenghtNumber.length();
		for (int g = 0; g < (k - l); g++) {
			wypisanieLinijki += " ";
		}
		return wypisanieLinijki;
	}

}
