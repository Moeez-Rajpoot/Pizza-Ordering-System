import java.util.Scanner;
public class User 
{
	int attempt=3;
	boolean check=true;
	String user="zulkefal";
	String code="1234";
	
	public boolean login()
	{
		Scanner in =new Scanner(System.in);
		for (int i=0; i<3;i++)
		{
			System.out.println("******************************************************************");
			System.out.println("\t\tEnter User Name: ");
			String name=in.next();
			if(name.equals(user))
			{
				System.out.println("\t\tEnter Password : ");
				String pass=in.next();
				if(pass.equals(code))
				{
					System.out.println("******************************************************************");
					System.out.println("\t\t Access Granted");
					System.out.println("******************************************************************");
					check=true;
					break;
				}
				else 
				{
					System.out.println("******************************************************************");
					System.out.println("\t\t Wrong Password ");
					System.out.println("******************************************************************");
					System.out.println("\t\t Remaining Attempt are : "+ attempt);
					System.out.println("******************************************************************");
				}
			}
			else
			{
				--attempt;
				if (attempt!=0)
				{
					System.out.println("******************************************************************");
					System.out.println("\t\t Wrong User Name ");
					System.out.println("******************************************************************");
					System.out.println("\t\t Remaining Attempt are : "+ attempt);
					System.out.println("******************************************************************");
				}
				else
				{
					System.out.println("******************************************************************");
					System.out.println("\t\t Attempt Limit Exceeded");
					System.out.println("******************************************************************");
				}
			}
		}
		return check;
	}
}
