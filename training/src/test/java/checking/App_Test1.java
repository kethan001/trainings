package checking;

import org.testng.annotations.Test;

import checking.App_Test2;

public class App_Test1 {
	  @Test(enabled = true, priority = 0)
	 public void tcs1() throws Exception {	   
		  System.out.println("Hello : firsts1");
		  	  
	  }
	  
	  @Test(enabled = true, priority = 1)
		 public void tcs2() throws Exception {	   
			  System.out.println("Hello : seconds2 ");
			  	  
		  }
	  @Test(enabled = true, priority = 2)
		 public void tcs3() throws Exception {	   
			  System.out.println("Hello : thirds3 ");
			  	  
		  }
	  @Test(enabled = true, priority = 3)
		 public void tcs4() throws Exception {	   
			  System.out.println("Hello : fourth4 ");
			  	  
		  }  
  }