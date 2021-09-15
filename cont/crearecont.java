package cont;

import java.util.Scanner;

class crearecont{
	crearecont()
	{
		main();
	}
	public static String match="The password does not match, rewrite the password";
public String strong="The pasword is not strong enough, you must use a capital letter, normal letters, numbers and a special carater"; 

	public static void main(){
		try
		{
		System.out.print("Introduce your Username: ");
		Scanner scanner = new Scanner(System.in);
		String usrname= scanner.next();
		System.out.print("Intoduce your password: ");
		String password= scanner.next();
		System.out.print("Reintroduce your password: ");
		String password1= scanner.next();
		
		if(password!=password1)
		{
			throw new Exception();
		}
		
		boolean mare=false;
		boolean mica=false;
		boolean cifre=false;
		boolean caracter=false;

		char[] a = new char[password.length()];

		for(int i=0;i<password.length();i++)
		{a[i]=password.charAt(i);
			if(a[i] >= 'A' && a[i]<='Z')
			{
				mare=true;
			}

			if(a[i]>='a' && a[i]<='z')
			{
				mica=true;
			}

			if (a[i] >= '0' && a[i] <= '9') {
				cifre = true;
			}

			if (a[i] >= 33 && a[i] <=47 ) {
				caracter = true;
			}
		}

		if(!(mare==true && mica==true && cifre==true && caracter==true))
		{
			throw new Exception();
		}

		}
		
		catch(Exception e){
				
		}
	}
}