package org.lang.alpha;

import org.lang.Alpha;

public class Beta extends Alpha{
	
	public void schDetails()
	{
		System.out.println("school located at Uthangarai");
		
	}

	public static void main(String[] args) {
		
      Beta b=new Beta();
      b.print();
      b.display();
      b.schDetails();
      
	}

}
