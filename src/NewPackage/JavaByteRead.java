package NewPackage;

import java.io.*;

public class JavaByteRead {
	
   static byte Val1 = 65;
   static byte Val2 = 66;

    public static void Main (String[] args){        	
	
    	try{
    		
    		FileOutputStream fos = new FileOutputStream("C:\\Users\\user\\workspace\\Data\\NewFile.txt");
    		
    		fos.write(Val1);
    		//fos.write(Val2);
    		fos.close();
		
    	}
    	catch(Exception e){
		
    	}    		
		    	
    }	

}
