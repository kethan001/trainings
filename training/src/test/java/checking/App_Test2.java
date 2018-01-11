package checking;

import org.testng.annotations.Test;




public class App_Test2 {
	  @Test(enabled = true, priority = 0)
	 public void tc5() throws Exception {	   
		  System.out.println("Hello : first5 ");
		  	  
	  }
	  
	  @Test(enabled = true, priority = 1)
		 public void tc6() throws Exception {	   
			  System.out.println("Hello : second6 ");
			  	  
		  }
	  
	  @Test(enabled = true, priority = 2, dependsOnMethods={"tc5","tc6"})
		 public void tc7() throws Exception {	   
			  System.out.println("Hello : third7 ");
			  	  
		  }
	  @Test(enabled = true, priority = 3, dependsOnMethods={"tc5","tc6"})
		 public void tc8() throws Exception {	   
			  System.out.println("Hello : fourth8 ");
			  	  
		  }
  }



    
    
    
  


