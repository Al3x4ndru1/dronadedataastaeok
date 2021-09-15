package cont;

import java.util.Scanner;

public class contmain {
	public contmain()
	{
		main();
	}
	public static void main()
	{
		System.out.println("Do you have an account?");
		String s;
		Scanner scanner= new Scanner(System.in);
		s=scanner.next();
		scanner.close();
		if(s=="yes")
		{
			new logare();
		
		}
		else{
			new crearecont();
		}

	}
	
}
