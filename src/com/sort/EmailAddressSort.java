package com.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class EmailAddressSort
{
  public EmailAddressSort()
  {
  }
  
  public static void main (String args[])
  {
          if (args.length == 1)
          {
             if (args[0] != null && args[0].length() > 0 && args[0].endsWith(".txt"))
             {
     	        EmailAddressSort emailSort = new EmailAddressSort();
	        List<String> list = emailSort.sortEmailAddressByDomain(args[0]);
	 
	        System.out.println("!!!! result: ");
	        for(String str : list)
	        {
		  System.out.println(str);
	        }
             }
             else
             {
                System.out.println("Invalid parameter. The filename must have .txt extension");
             }
          }
          else
          {
              System.out.println("This command can only take one filename as a parameter");
          }
  }

  public List<String> sortEmailAddressByDomain(String filename) 
  {
	  List<String> emailAddresses = this.readEmailAddressFile(filename);

	  List<String> tempList = new ArrayList<String>();
	  
	  // Swap local part and domain of all email addresses to prepare 
	  // for sorting. 
	  // i.e. john@npr.org => npr.org@john
	  for (String emailAddress : emailAddresses)
	  {
		  tempList.add(swapLocalPartAndDomain (emailAddress));
	  }
	 
	  Collections.sort(tempList);
	 
	  List<String> resultList = new ArrayList<String>();
	 
	  // Swap local part and domain of all email addresses to 
	  // restore back to valid email addresses
	  // i.e. npr.org@john => john@npr.org 
	  for (String temp : tempList)
	  {
		  resultList.add(swapLocalPartAndDomain (temp));
	  }
	  
	  return resultList;
  }
  
  // Swap local part and domain only all local part, domain, and @ exist in email address.
  // Otherwise, it returns the original value without swapping
  private String swapLocalPartAndDomain (String emailAddress)
  {
	 if (emailAddress.contains("@"))
	 {		 
	    String part[] = emailAddress.split("@");
	    
	    if (part.length == 2 && !part[0].isEmpty() && !part[1].isEmpty())
	    {
		  return part[1] + "@" + part[0];
	    }
	 }
	 
	 return emailAddress; 
  }
  
  // Read email addresses from a file and return as a list of email addresses
  private List<String> readEmailAddressFile (String filename)
  {
	  List<String> emailAddresses = new ArrayList<String>();
	  
	  ApplicationContext appContext = 
	    	   new ClassPathXmlApplicationContext(new String[] {"test-beans-simple.xml"});
	   
	  Resource resource = appContext.getResource("classpath:" + filename);

	  try
	  {
             InputStream is = resource.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is));
       	
             String line;
             while ((line = br.readLine()) != null) 
             {
	       if (!line.trim().isEmpty())    
	          emailAddresses.add(line);
      	     } 
             br.close();
       	
          }
	  catch(IOException e)
	  {
   		 e.printStackTrace();
   	  }
   	
	  return emailAddresses;
  }

  

}
