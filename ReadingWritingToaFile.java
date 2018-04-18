package javaAssignments;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadingWritingToaFile {

	public static void main(String[] args) throws IOException {
		
	
	FileInputStream in = null;
    FileOutputStream out = null;

    try {
       in = new FileInputStream("C:\\Users\\pswat\\Desktop\\fileIO.txt");
       out = new FileOutputStream("C:\\Users\\pswat\\Desktop\\output.txt");
       int c;
       while ((c = in.read())!= -1) {
    	
        out.write(c);
          
       }
    }finally {
       if (in != null) {
          in.close();
       }
       if (out != null) {
          out.close();
       }
    }
	}
}