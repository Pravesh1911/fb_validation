package test_class;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base_utility.Base_class;

@Listeners(base_utility.Listner_class.class)
public class Fb_login_validation extends Base_class  {
	@BeforeClass
	public void Initial_activity(){
		
		Launch_Browser("Chrome");
		
		Initialize();

	}

	@Test
				public void Facebook_welcome_Text_Validation() throws InterruptedException, EncryptedDocumentException, IOException {
					
					String Actual = fb_login.Get_Welcome_Text();
					Static_wait(2);
					String Expected = ul.Get_Excel_Data(0, 0);
					
					Assert.assertEquals(Actual, Expected);
					
				
				}

	
}
