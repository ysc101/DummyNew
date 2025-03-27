package testpages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import pom.DeductionApproval;

public class DeductionApprovalTest extends BaseClass {
	
	
	DeductionApproval  DA =new DeductionApproval();
	

    @BeforeClass
    public void openBrowser() throws IOException {
	  initializeBrowser();
	

    }

	  @Test(priority = 0)
	  	public void loginWithHOD() throws EncryptedDocumentException, IOException {

		  DA.enterUserName();
		  DA.enterPassword();
		  DA.clickOnLogin();
	  	}
	  	      @Test(priority = 1)
	  	public void MasterMenuisClickableforHOD() throws EncryptedDocumentException, IOException {
	  	    	DA.clickOnMasterMenu();
	  	}
	  	      @Test(priority = 2)
	  	  	public void deductionapprovalmenuisClickable() throws EncryptedDocumentException, IOException, InterruptedException {
	  	    	DA.clickOndeductionapprovalmenu();
	  	  	}

}
