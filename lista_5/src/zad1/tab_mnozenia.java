package zad1;

import java.text.ParseException;
import java.util.Scanner;

public class tab_mnozenia {
	public static void main(String[] args) throws ParseException {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj n: ");
		int n = sc.nextInt();
		sc.close();
		
		String wypisanieLinijki=" ";
		
		int[][] tablica= new int [n][n];
		
		for(int x=0;x<=n;x++)
		{
			for(int y=0;y<=n;y++)
			{
				int k=n*y;
				String lenghtMax = "" + k;
				k=lenghtMax.length()+1;
				int l=x*y;
				String lenghtNumber = "" + l;
				l=lenghtNumber.length();
				for(int g=0;g<(k-l);g++)
				{
					wypisanieLinijki+=" ";
				}
				if(x==0 && y==0)
					wypisanieLinijki+="  ";
				else if(x==0)
					wypisanieLinijki+=" " + y;
				else if(y==0)
					wypisanieLinijki+=" " +x;
				else
					wypisanieLinijki+=" " +(x*y);
			}
			System.out.print("\n" + wypisanieLinijki);
			wypisanieLinijki=" ";
		}
		
	}

}
