package com.sort;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/test-beans-simple.xml" })
public class EmailAddressSortTests
{
  
  @Test
  public void testGoodInput1()
  {
	  EmailAddressSort emailSort = new EmailAddressSort();
	  List<String> list = emailSort.sortEmailAddressByDomain("input1.txt");
	 
	  System.out.println("!!!! result: ");
	  for(String str : list)
	  {
		  System.out.println(str);
	  }
  }
  
  @Test
  public void testGoodInput2()
  {
	  EmailAddressSort emailSort = new EmailAddressSort();
	  List<String> list = emailSort.sortEmailAddressByDomain("input2.txt");
	 
	  System.out.println("!!!! result: ");
	  for(String str : list)
	  {
		  System.out.println(str);
	  }
  }
 
}
