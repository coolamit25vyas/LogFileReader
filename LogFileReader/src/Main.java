import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		test1();
	}
	
	
	public static void test1() throws IOException {
		
		
		 try {  //http://pojo.sodhanalibrary.com/
		        //File file = new File(fileName);     
		        File file = new File("C:/Users/prajalr/Downloads/logt.txt");    
		        BufferedReader br = new BufferedReader(new FileReader(file)); 
		        StringBuffer sb = new StringBuffer();
		        String st; 
		        while ((st = br.readLine()) != null) 
		          {
		        	st = st.trim();
		        	if(st.length() > 8 && st.startsWith("Payload:")) {
		        		int startIndex = st.indexOf("<ns3:getCreditLineByAccountGroupRequest");
		        		int endIndex = st.indexOf("</ns3:getCreditLineByAccountGroupRequest>");
		        		String xmlStr = st.substring(startIndex, endIndex + "</ns3:getCreditLineByAccountGroupRequest>".length());
		        		xmlStr = xmlStr.replaceAll("<ns3:", "<").replaceAll("<ns2:", "<").replaceAll("</ns3:", "</").replaceAll("</ns2:", "</");
		        		System.out.println(xmlStr);
		        		
		        		 JAXBContext jaxbContext = JAXBContext.newInstance(GetCreditLineByAccountGroupRequest.class);
		        		 
		        		 Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
		        		 
		        		 GetCreditLineByAccountGroupRequest creLine= (GetCreditLineByAccountGroupRequest) jaxbUnmarshaller.unmarshal((new StringReader(xmlStr)));
		        		 System.out.println(creLine);
		        	}
		        	
		          }
		        	System.out.println(sb.toString());
				/*
				 * int stratPoint=st.indexOf("getCreditLineByAccountGroupRequest"); int
				 * endPoint=st.indexOf("/getCreditLineByAccountGroupRequest");
				 * System.out.println(sb.append(st.subSequence(stratPoint, endPoint)));
				 */
		        //  }
		      
			
			 /* JAXBContext jaxbContext =
			  JAXBContext.newInstance(getCreditLineByAccountGroupRequest.class);
			  Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			  getCreditLineByAccountGroupRequest quegetCreditLineByAccountGroupRequest1 =
			  (getCreditLineByAccountGroupRequest) jaxbUnmarshaller.unmarshal(file);*/
			 
		        //System.out.println(quegetCreditLineByAccountGroupRequest1.toString());  
			/*
			 * Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller(); Question
			 * que= (Question) jaxbUnmarshaller.unmarshal(file);
			 */
		 /*       System.out.println(que.getId()+" "+que.getQuestionname());  
		        Systm.out.println("Answers:");  
		        List<Answer> list=que.getAnswers();  
		        for(Answer ans:list)  
		          System.out.println(ans.getId()+" "+ans.getAnswername()+"  "+ans.getPostedby());  */
		   
		      } catch (Exception e) {  
		        e.printStackTrace();  
		      }  
		   
		    }  
	
}
