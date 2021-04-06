package zad3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ArrayDate {
	public static void main(String[] args) throws ParseException {

		List<Date> lista1 = new ArrayList<Date>();

		Scanner sc = new Scanner(System.in);
		Date n = null;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
		Date g = simpleDateFormat.parse("10.01.1993");
		do {
			System.out.println(lista1);
			try {
				System.out.print("Podaj nazwisko: ");
				String dane = sc.next();
				n = simpleDateFormat.parse(dane);//nowa data
				int x = 0;
				if (lista1.size() == 0)
					lista1.add(x, n);
				else {
					for (x = 0; x < lista1.size(); x++) {
						g = (Date) lista1.get(x);//stara data
						if ((g.equals(n)) == true) {
							break;
						} else {
							if ((g.compareTo(n )) == 1) {// nowa data > stara data
								lista1.add(x, n);
								break;
							}
							else if (x==lista1.size()-1)//nowa najwieksza data
							{
								lista1.add(x+1, n);
								break;
							}
						}
					}
				}
			} catch (ParseException e) {
			}
		} while (lista1.size() < 4);
		sc.close();
		System.out.println(lista1);
	}
}
