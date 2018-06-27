package chung.sort;

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
  public void testSwap()
  {
	  EmailSort emailSort = new EmailSort();
	  List<String> list = emailSort.sortEmailAddressByDomain("");
	  
	  for(String str : list)
	  {
		  System.out.println(str);
	  }
  }
 
}
