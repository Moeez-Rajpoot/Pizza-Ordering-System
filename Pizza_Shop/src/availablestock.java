public class availablestock {
	
	 Items head;
	 Items current;
	 int size=0;
	 
	 public void insert(String name, int s,int sp, int m,int mp, int l,int lp)
	 {
		
		 Items item=new Items();
		 item.number=size+1;
		 item.name=name;
		 item.small=s;
		 item.sprice=sp;
		 item.medium=m;
		 item.mprice=mp;
		 item.large=l;
		 item.lprice=lp;
		 item.next=null;
		 if(head==null)
		 {
			 head=item;
			 size++;
		 }
		 else    
		 {
			 Items temp=head;
			 while(temp.next!=null)
			 {
				 temp=temp.next;
			 }
			 temp.next=item;
			 size++;
		 }
	 }
	 public void insert2(String name, int s,int sp)
	 {
		
		 Items item=new Items();
		 item.number=size+1;
		 item.name=name;
		 item.small=s;
		 item.sprice=sp;
		 item.next=null;
		 if(head==null)
		 {
			 head=item;
			 size++;
		 }
		 else    
		 {
			 Items temp=head;
			 while(temp.next!=null)
			 {
				 temp=temp.next;
			 }
			 temp.next=item;
			 size++;
		 }
	 }
	 public void show()
	 {
		Items item=head;
		while(item.next!=null)
		{
			System.out.println("Item No: "+ item.number + "\tItem Name : " + item.name + "\t Small : " + item.small + "\tMedium : " + item.medium + "\t Large : " +item.large );
			item=item.next;
		}
			System.out.println("Item No: "+ item.number + "\tItem Name : " + item.name + "\t Small : " + item.small + "\tMedium : " + item.medium + "\t Large : " +item.large );
			System.out.println("******************************************************************");
	 }
	 public void update(int i, int qs, int qm, int ql)
	 {
		 Items temp=head;
		 while(temp!=null)
		 {
			 if(temp.number==i) 
			 	{
				 
				 {
					 temp.small=temp.small+qs;
					 temp.medium=temp.medium+qm;
					 temp.large=temp.large+ql;
				 }
				 break;
			 	}
			 temp=temp.next;
		 } 
	 }
	 public void update2(int i, int qs)
	 {
		 Items temp=head;
		 while(temp!=null)
		 {
			 if(temp.number==i) 
			 	{
				 
				 {
					 temp.small=temp.small+qs;
				 }
				 break;
			 	}
			 temp=temp.next;
		 } 
	 }

	 public void Delete(int index) 
	 {
		 if (index==1)
		 {
			head=head.next;
			size--;
		 }
		else
		{
			Items temp=head;
			Items n1=null;	
			for(int i=1;i<index-1;i++)
			{
				temp=temp.next;
			}	
			n1=temp.next;
			temp.next=n1.next;
			size--;
		}
	 }
 }

