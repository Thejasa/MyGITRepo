package TestPackage;

//import org.testng.internal.annotations.TestAnnotation;

import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.ProcessBuilder;

public class ProcessTest {		
	
    @Test
	public void Test() throws IOException{		
	
		Process proc= new ProcessBuilder("C:\\Users\\user\\Desktop\\TestBatch.bat","news text").start();
		//Process proc= new ProcessBuilder("C:\\Users\\user\\Desktop\\ConsoleApplication1\\bin\\Debug\\ConsoleApplication1.exe","New text").start();
		
		
		
	}

}
