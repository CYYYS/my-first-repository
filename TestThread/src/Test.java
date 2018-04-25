import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 
 */

/**
 * @author cys
 *
 */
public class Test {
	public static void main(String[] args) {
		while(true){
			System.out.println("1");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void writeToTxt(String fileNameAbsPath,String info){
		File txtFile = new File(fileNameAbsPath);
		try {
			InputStream in = new FileInputStream(txtFile);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void writeByFileOutputStream(String _sDestFile,String _sContent) throws IOException{ 
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(_sDestFile);	
			fos.write(_sContent.getBytes());
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (fos != null) {
				fos.close();
				fos = null;
			}
		}
	}	
}
