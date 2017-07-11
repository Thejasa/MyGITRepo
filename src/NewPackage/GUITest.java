package NewPackage;

import java.awt.*;

import org.testng.annotations.Test;

public class GUITest {
	
	public Panel pnlNew;
	public Label lblUserId;
	public Button btnclick;
	
	@Test
 public void GUITest(){ 
		 
	 pnlNew = new Panel();
	 btnclick = new Button("Submit");
	 
		pnlNew.add(btnclick); 
		 
	 }
	
	
  
  //public  static void main(String[] args) {
	  
		  //new GUITest();

	  
	  
 // }
  
  
}
