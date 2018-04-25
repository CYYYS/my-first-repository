import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author cys
 *
 */
public class PhoneShell {
	public static void main(String[] args) {
		 try { // ��ֹ�ļ��������ȡʧ�ܣ���catch��׽���󲢴�ӡ��Ҳ����throw  

             /* ����TXT�ļ� */  
             String pathname = "C:\\Users\\cys\\Desktop\\1.txt"; // ����·�������·�������ԣ������Ǿ���·����д���ļ�ʱ��ʾ���·��  
             File filename = new File(pathname); // Ҫ��ȡ����·����input��txt�ļ�  
             InputStreamReader reader = new InputStreamReader(  
                     new FileInputStream(filename)); // ����һ������������reader  
             BufferedReader br = new BufferedReader(reader); // ����һ�����������ļ�����ת�ɼ�����ܶ���������  
             File writename = new File("C:\\Users\\cys\\Desktop\\1.xml"); // ���·�������û����Ҫ����һ���µ�output��txt�ļ�  
             writename.createNewFile(); // �������ļ�  
             BufferedWriter out = new BufferedWriter(new FileWriter(writename));  
             String line = "";  
             line = br.readLine();  
             String head="<?xml version="+"\"1.0\""+" encoding="+"\"UTF-8\""+" ?><Contacts>";
             out.write(head);
             out.write("\r\n");// \r\n��Ϊ����  

             String foot = "</Contacts>";
             while (line != null) {  
                 line = br.readLine(); // һ�ζ���һ������  
                 
                 out.write(toxml(line));
                 out.write("\r\n");// \r\n��Ϊ����  
             }  
             
             /* д��Txt�ļ� */  
            
             out.write(foot);
             out.flush(); // �ѻ���������ѹ���ļ�  
             out.close(); // ���ǵùر��ļ�  

         } catch (Exception e) {  
             e.printStackTrace();  
         }  
     
	}
	public static String toxml(String number){
		
		
		String xml=""
		+"<Contact><Name></Name>"
		+"<Categories>"
		+"</Categories>"
		+"<PhoneList>"
		+"<Phone Type="+"\"2\""+"><![CDATA["+number+"]]></Phone>"
		+"</PhoneList>"
		+"<EMailList>"
		+"</EMailList>"
		+"<IMList>"
		+"</IMList>"
		+"<AddressList>"
		+"</AddressList>"
		+"<OrgList>"
		+"</OrgList>"
		+"</Contact>"
		+"";
		return xml;
    }
}
