import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		User a = new User();
		UserMenu y= new UserMenu();
		Scanner z=new Scanner(System.in);
		System.out.println("******************************************************************");
		System.out.println("\t\t Press 1: User Menu");
		System.out.println("\t\t Press 2: Order Menu");
		System.out.println("\t\t Press : ");
		int b=z.nextInt();
		System.out.println("******************************************************************");
		switch(b) 
		{
		case 1:
				boolean c=a.login();
				if(c==true)
				{
					y.Umenu();
				}
				break;
		case 2:
			
		}
	}
}

