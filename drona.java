
import leduri.ledurimain;
import comanda.numaralimente;
import miscare.miscaremain;
import cont.contmain;
import checks.checksmain;

import java.util.Scanner;

public class drona {
	public static void main(String[] args) throws InterruptedException
	{
		Scanner scanner = new Scanner(System.in);
		int i=scanner.nextInt();
		
		switch(i)	{
				case 1: new ledurimain();
				break;
		
				case 2:	new numaralimente();
				break;
		
				case 3: new contmain();
				break;
		
				case 4: new miscaremain();
				break;
		
				case 5: new checksmain();
				break;
		}
	}	

}