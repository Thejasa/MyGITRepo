package TestPackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {

		FileOutputStream fop = null;
		File file;
		//String content = "This is the text content";
		String content = args[0];

		try {
			//define file
			file = new File("C:\\Users\\user\\workspace\\Data\\NewFile.txt");
			fop = new FileOutputStream(file);

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			// get the content in bytes
			byte[] contentInBytes = content.getBytes();

			fop.write(contentInBytes);
			fop.flush();
			fop.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fop != null) {
					fop.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
