package handson;

import org.testng.annotations.Test;

public class testngdemo {

			@Test(priority = 4)
		    
			public void Enterthearena() 
			{
	        System.out.println("enterthearena");
	        }
	            
	        @Test(priority = 3)
	        
	        public void Dropatpocinki() 
	        {
	            System.out.println("drop at pocinki");
	        }
	        
	        @Test(priority = 2)
	        
	        public void Getthegun () 
	        {
	            System.out.println("Get the gun");
	        }
	        
	        @Test (priority = 1)
	        public void Killtheenemy () 
	        {
	            System.out.println("Kill the Enemy");
	        }
	        
	        @Test (priority = 0)
	        public void WinnerWinnerChickenDinner() 
	        {
	            System.out.println("Winner Winner Chicken Dinner");
	        }
	    
	}
