package TestPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class PromoValidate {	
	
	public int linecount = 0;
	
	@Parameters({"number"})
	@Test	
	
	public  void GetText(){
		
	if ( linecount== 0) {
			
			linecount = linecount + 1;
			
			System.out.println("The line count is : "+linecount);
		}	
		
		int b = 5;
		
		int a = 2*b;
		
		System.out.println("The value is:"+a);		
		
	}
	
	

}
