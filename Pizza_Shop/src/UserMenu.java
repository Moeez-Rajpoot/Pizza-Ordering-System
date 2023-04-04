import java.util.Scanner;

public class UserMenu {
	availablestock item = new availablestock();
	
	public void Umenu()
	{
		boolean again= true;
		Scanner d=new Scanner(System.in);
		System.out.println("\t\t PIZZAS");
		
		item.insert("Chicken Tikka", 5, 400, 5, 800, 10,1200);
		item.insert("Chicken Fatija", 5, 400, 5, 800, 10,1200);
		item.insert("Chicken Mughlai", 5, 400, 5, 800, 10,1200);
		item.insert("Euro Base      ", 5, 400, 5, 800, 10,1200);
		item.insert2("Coke         ", 10 , 100);
		item.insert2("Dew          ", 10 , 100);
		item.insert2("7UP          ", 10 , 100);
		item.insert2("Sprite      ", 10 , 100);
		item.insert2("Pepsi       ", 10 , 100);
		do
		{
			System.out.println("******************************************************************");
			System.out.println("\t\t Press 1: Updating the Stock");
			System.out.println("\t\t Press 2: Checking the Stock");
			System.out.println("\t\t Press 3: Adding New Pizza ");
			System.out.println("\t\t Press 4: Total Earning");
			System.out.println("\t\t Press 5: Bills Searching ");
			System.out.println("\t\t Press : ");
			int e=d.nextInt();
			System.out.println("******************************************************************");
			switch(e)
			{
				case 1: 
					item.show();
					System.out.println("\t\t Press 1 : Pizza Stock  \n\t\t Press 2 : Cold Drinks \nPress: ");
					int m=d.nextInt();
					if(m==1)
					{
						System.out.println("\t\t Enter The Item Number You want to Update : ");
						int a=d.nextInt();
						System.out.println("\t\t Enter Quantity of Small : ");
						int b=d.nextInt();
						System.out.println("\t\t Enter Quantity of Medium : ");
						int c=d.nextInt();
						System.out.println("\t\t Enter Quantity of Large : ");
						int e1=d.nextInt();
						item.update(a,b,c,e1);
					}
					else
					{
						System.out.println("\t\t Enter The Item Number You want to Update : ");
						int a=d.nextInt();
						System.out.println("\t\t Enter Quantity : ");
						int b=d.nextInt();
						item.update2(a,b);
					}
					break;
				case 2:
					item.show();
					break;
				case 3:
					System.out.println("\t\t Enter Name of Pizza : ");
					String f= d.next()+ d.nextLine();
					System.out.println("\t\t Enter Quantity of Small : ");
					int g= d.nextInt();
					System.out.println("\t\t Enter Price of Small Size : ");
					int h= d.nextInt();
					System.out.println("\t\t Enter Quantity of Medium : ");
					int i= d.nextInt();
					System.out.println("\t\t Enter Price of Medium size : ");
					int j= d.nextInt();
					System.out.println("\t\t Enter Quantity of Large : ");
					int k= d.nextInt();
					System.out.println("\t\t Enter Price of Large size  : ");
					int l= d.nextInt();
					item.insert(f,g,h,i,j,k,l);
					break;
				case 5:
					again=false;
					break;
			}
		}while(again);
	}

}
