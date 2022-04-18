package testngs;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Tday1 {
@Parameters("URL")
@Test
public void movierel1 (String URLname) 
{
	
	System.out.println("KGF is releasing on April 14th");
	System.out.println(URLname);
}

@Test
public void movierel2() 
{
	
System.out.println("Beast is releasing on April 13th");
}

@Test
public void movierel3() 
{
	System.out.println("Ghani is releasing on April 8th");
}



	
}
