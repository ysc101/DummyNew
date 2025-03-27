package testpages;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import pom.DeductionMapping;

public class DeductionMappingTest extends BaseClass {
		

	DeductionMapping objDeduction ;
	
		

	      @BeforeClass
	      public void openBrowser() throws IOException {
		  initializeBrowser();
		  objDeduction = new DeductionMapping();
		  
			
	}

	@Test(priority = 0)
	public void loginWithMaker() throws EncryptedDocumentException, IOException {

		objDeduction.enterUserName();
		objDeduction.enterPassword();
		objDeduction.clickOnLogin();
		
	}
	      @Test(priority = 1)
	public void MasterMenuisClickable() throws EncryptedDocumentException, IOException {
	    	  objDeduction.clickOnMasterMenu();
	}
	      @Test(priority = 2)
	  	public void deductionmappingmenuisClickable() throws EncryptedDocumentException, IOException {
	  	    	  objDeduction.clickOndeductionmappingmenu();
	  	}
	      @Test(priority = 3)
		  	public void Biitypeisslecatble() throws EncryptedDocumentException, IOException, InterruptedException {
		  	    	  objDeduction.selectbilltype();
		  	}
	      @Test(priority = 4)
	  	public void adddetailsforsurchargeaccpayee() throws EncryptedDocumentException, IOException, InterruptedException {
	  	objDeduction.adddetailsforsurchargeaccpayee();
}
	      @Test(priority = 5)
		  	public void canadddetailsforbnkname() throws EncryptedDocumentException, IOException, InterruptedException {
		  	objDeduction.adddetailsforBankname();
	}
	      @Test(priority = 6)
	 		  	public void Brnachnameisacceptable() throws EncryptedDocumentException, IOException, InterruptedException {
	 		  	objDeduction.adddetailsforbranchname();
	 	}
	      @Test(priority = 7)
	 		  	public void canaddaccountnumber() throws EncryptedDocumentException, IOException, InterruptedException {
	 		  	objDeduction.entertheaccountnumber();
	 	}
	      @Test(priority = 8)
		  	public void TextfieldacceptIFSCCode() throws EncryptedDocumentException, IOException, InterruptedException {
		  	objDeduction.entertheIFSCCode();
	}
	      @Test(priority = 9)
		  	public void TextfieldacceptMICRCode() throws EncryptedDocumentException, IOException, InterruptedException {
		  	objDeduction.enterthesrchrgeMICR();
	}
	      @Test(priority = 10)
		  	public void Textfieldacceptaddress() throws EncryptedDocumentException, IOException, InterruptedException {
		  	objDeduction.entertheaddress();
	}
	      @Test(priority = 11)
		  	public void CanEnterPlacedetails() throws EncryptedDocumentException, IOException, InterruptedException {
		  	objDeduction.entertheplace();
	}
	      @Test(priority = 12)
		  	public void Textfieldacceptdistrict() throws EncryptedDocumentException, IOException, InterruptedException {
		  	objDeduction.enterthedistrict();
	}
	      @Test(priority = 13)
		  	public void Canadddetailsforsaletaxaccpayee() throws EncryptedDocumentException, IOException, InterruptedException {
		  	objDeduction.adddetailsforsaletaxaccpayee();
	}
		      @Test(priority = 14)
			  	public void canadddetailsforsaletaxBankname() throws EncryptedDocumentException, IOException, InterruptedException {
			  	objDeduction.adddetailsforsaletaxBankname();
		}
		      @Test(priority = 15)
		 		  	public void Brnachnameisacceptableforsaletax() throws EncryptedDocumentException, IOException, InterruptedException {
		 		  	objDeduction.adddetailsforsaletaxbranchname();
		 	}
		      @Test(priority = 16)
		 		  	public void canaddsaletaxaccountnumber() throws EncryptedDocumentException, IOException, InterruptedException {
		 		  	objDeduction.enterthesaletaxaccnumber();
		 	}
		      @Test(priority = 17)
			  	public void canaddTextfieldacceptIFSCCode() throws EncryptedDocumentException, IOException, InterruptedException {
			  	objDeduction.enterthesaletaxIFSC();
		}
		      @Test(priority = 18)
			  	public void canaddTextfieldsaletaxMICR() throws EncryptedDocumentException, IOException, InterruptedException {
			  	objDeduction.enterthesaletaxMICR();
		}
		      @Test(priority = 19)
			  	public void Textfieldacceptandcanentertheaddressfordsaletax() throws EncryptedDocumentException, IOException, InterruptedException {
			  	objDeduction.entertheaddressfordsaletax();
		}
		      @Test(priority = 20)
			  	public void CanEnterPlacedetailsfosaletax() throws EncryptedDocumentException, IOException, InterruptedException {
			  	objDeduction.enterthesaletaxplace();
		}
		      @Test(priority = 21)
			  	public void Textfieldacceptsaletaxdistrict() throws EncryptedDocumentException, IOException, InterruptedException {
			  	objDeduction.enterthesaletaxdistrict();
		}
		      @Test(priority = 22)
			  	public void Savebuttonisclickable() throws InterruptedException  {
			  	objDeduction.clickOnsavebutton();
		}
		      @Test(priority = 23)
			  	public void yesbuttonisclickable() throws InterruptedException {
			  	objDeduction.clickOnyesaftersave();
		      }
		      @Test(priority = 24)
			  	public void printbuttonisclickable() throws InterruptedException {
			  	objDeduction.clickfordeductionprint();
		}
		      @Test(priority = 25)
			  	public void Backbuttonisclickable() throws InterruptedException {
			  	objDeduction.clickOnbackbutton();
		}
		      @Test(priority = 26)
			  	public void logoutbuttonisclickable() throws EncryptedDocumentException, IOException, InterruptedException {
			  	objDeduction.clickOnlogoutbutton();
		}
		      @Test(priority = 27)
			  	public void yesbuttonclickableforlogout() throws EncryptedDocumentException, IOException, InterruptedException {
			  	objDeduction.clickOnyeslogout();
		}
		      @Test(priority = 28)
		  	public void loginWithHOD() throws EncryptedDocumentException, IOException {

		    	  objDeduction.enterUsernameforHOD();
		    	  objDeduction.enterPasswordforHOD();
		    	  objDeduction.clickOnLoginforHOD();
		  	}
		      @Test(priority = 29)
		  	public void MasterMenuisClickableforHOD() throws EncryptedDocumentException, IOException {
		  	    	  objDeduction.clickOnMasterMenu();
		  	}

		  	@Test(priority = 30)
		  	public void ductionapprovalmenumenuIsClickable()
		  			throws EncryptedDocumentException, IOException, InterruptedException {

		  		objDeduction.clickOndeductionapprovalmenu();
		  	}

		  	@Test(priority = 31)
		  	public void Checkboxisclickable() throws EncryptedDocumentException, IOException, InterruptedException {

		  		objDeduction.Clickoncheckbox();
		  	}

		  	@Test(priority = 32)
		  	public void Approvebuttonisclickable() throws EncryptedDocumentException, IOException, InterruptedException {

		  		objDeduction.Clickonapprovebutton();
		  	}

		  	@Test(priority = 33)
		  	public void yesbuttonisclickableforHOD() throws EncryptedDocumentException, IOException, InterruptedException {

		  		objDeduction.Clickonyesbuttonforapproval();
		  	}

		  	@Test(priority = 34)
		  	public void okbuttonisclickable() throws EncryptedDocumentException, IOException, InterruptedException {

		  		objDeduction.Clickonokbuttonforapproval();
		  	}

		  	@Test(priority = 35)
		  	public void backButtonisClickable5()
		  			throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		  		objDeduction.clickOnbackbutton();
		  	}

		  	@Test(priority = 36)
		  	public void logoutButtonisClickable1()
		  			throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		  		objDeduction.clickOnlogoutbutton();
		  	}
		  	@Test(priority = 37)
		  	public void yesbuttonclickableforlogoutforHOD() throws EncryptedDocumentException, IOException, InterruptedException {
		  	objDeduction.clickOnyeslogout();
		  	}
		      @AfterClass
		      public void CloseBrowser() throws InterruptedException {
		      	Thread.sleep(2000);
		      	driver.quit();
		      }
}   
	      

