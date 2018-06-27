package chung.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmailAddressSort
{
  public EmailAddressSort()
  {
  }
  
  public List<String> sortEmailAddressByDomain(String file) 
  {
	  List<String> emailAddresses = new ArrayList<String>();
	  emailAddresses.add("abc@abc.com");
	  emailAddresses.add("cde@yahoo.com");
	  emailAddresses.add("joe@npr.org");
	  emailAddresses.add("rwq@abc.org");
	  emailAddresses.add("dave@gibson.com");

	  List<String> tempList = new ArrayList<String>();
	  
	  for (String emailAddress : emailAddresses)
	  {
		  tempList.add(swapLocalPartAndDomain (emailAddress));
	  }
	  
	  Collections.sort(tempList);
	 
	  List<String> resultList = new ArrayList<String>();
	  
	  for (String temp : tempList)
	  {
		  resultList.add(swapLocalPartAndDomain (temp));
	  }
	  
	  return resultList;
  }
  
  private String swapLocalPartAndDomain (String emailAddress)
  {
	 String part[] = emailAddress.split("@");
	 
	 if (part.length == 2)
	 {
		 return part[1] + "@" + part[0];
	 }
	 
	 return emailAddress; 
  }
	
   private List<String> readEmailAddressFile (String filename)
   {
	  List<String> emailAddresses = new ArrayList<String>();
	   
	  Resource resource = appContext.getResource("classpath:test/" + filename);
	  try
	  {
     	     InputStream is = resource.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is));
        	
              String line;
              while ((line = br.readLine()) != null) {
                 System.out.println(line);
		 emailAddresses.add(line);
       	      } 
              br.close();
        	
      	    }
	    catch(IOException e)
	    {
    		e.printStackTrace();
    	    }
    	
          }
	
	return emailAddresses;
   }
  

}
