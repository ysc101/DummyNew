package pom;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import baseclasses.BaseClass;
import baseclasses.CommonUtils;

public class TreasuryReceipt extends BaseClass {
	
	@FindBy(xpath = "//input[@id='txtUser']")
	public WebElement username;

	@FindBy(xpath = "//input[@id='txtPass']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='btnLogin']")
	public WebElement login;

	@FindBy(xpath = "//a[normalize-space()='Financial Work']")
	public WebElement financialWork;

	@FindBy(xpath = "//a[normalize-space()='Namuna 13 Entry Form']")
	public WebElement namuna13Entry;

	@FindBy(xpath = "//select[@id='body_ddlYear']")
	public WebElement fyselect;
	
	@FindBy(xpath = "//select[@id='body_ddlEntryType']")
	public WebElement entrytype;
	
	@FindBy(xpath = "//select[@id='body_ddlGroupCashbook']")
	public WebElement groupcashbook;
	
	@FindBy(id = "body_ddlCashbook")
	public WebElement cashbook;
	
	@FindBy(xpath = "//input[@id='body_txtChalanDate']")
	public WebElement challandate;
	
	@FindBy(xpath = "//input[@id='body_txtChalanNumber']")
	public WebElement challannumber;
	
	@FindBy(xpath = "//input[@id='body_txtChequeRtgsNo']")
	public WebElement chequertgsnumber;
	
	@FindBy(xpath = "//select[@id='body_ddlDepartment']")
	public WebElement selectdept;
	
	@FindBy(xpath = "//input[@id='body_btnHeadCode']")
	public WebElement SelectHeadcode;
	
	@FindBy(xpath = "//div[@class='dataTables_scrollBody']")
	public WebElement Scrolling;
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]/a[1]/div[1]")
	public WebElement headcode;
	
	@FindBy(xpath = "//input[@id='body_txtAmount']")
	public WebElement receiptamount;
	
	@FindBy(xpath = "//select[@id='body_ddlAO']")
	public WebElement approvedby;
	
	@FindBy(xpath = "//input[@id='body_txtDescription']")
	public WebElement details;
	
	@FindBy(xpath = "//input[@id='body_btnSubmit']")
	public WebElement savebutton;
	
	@FindBy(id = "body_btnYes")
	public WebElement Treasuryyesbutton;
	
	@FindBy(id = "body_Button1")
	public WebElement TreasuryOKbutton;
	
	@FindBy(xpath = "//input[@id='body_btnBack']")
	public WebElement Treasurybackbutton;
	
	@FindBy(xpath="//input[@id='btnLogout']")
	public WebElement logout;
	
	@FindBy(xpath="//input[@id='btnYesLogout']")
	public WebElement yeslogout;
	
	@FindBy(xpath="//a[normalize-space()='Master']")
	public WebElement master;
	
	@FindBy(xpath="//a[normalize-space()='Treasury Withdrawal Approval']")
	public WebElement Treasuryapproval;
	
	@FindBy(xpath="	//input[@id='body_grdApprovalPending_chkApproval_0']")
	public WebElement selectcheckbox;
	
	@FindBy(xpath="//input[@id='body_btnApproval']")
	public WebElement approvebutton;
	
	@FindBy(xpath="//input[@id='body_btnYes']")
	public WebElement approveyesbutton;
	
	@FindBy(id="Button4")
	public WebElement approveokbutton;
	

	
	
	public TreasuryReceipt(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterUsername() throws EncryptedDocumentException, IOException {
		username.sendKeys(CommonUtils.getExcelData(6, 2));
	}

	public void enterPassword() throws EncryptedDocumentException, IOException {
		password.sendKeys(CommonUtils.getExcelData(6, 3));
	}

	public void clickOnLogin() {
		login.click();

	}

	public void clickOnFinancialWork() throws InterruptedException {
		financialWork.click();
		Thread.sleep(1000);

	}

	public void clickOnNamuna13ENtryform() throws InterruptedException {
		namuna13Entry.click();
		Thread.sleep(1000);

	}
	public void SelectFYyear() throws InterruptedException {
		fyselect.click();
	   Select s =new Select(fyselect);
	   s.selectByVisibleText("2023-24");
		Thread.sleep(1000);
	}
	public void Selectentrytype() throws InterruptedException {
		entrytype.click();
	   Select s =new Select(entrytype);
	   s.selectByVisibleText("Treasury");
		Thread.sleep(1000);
	}
	public void selectgrcashbook() throws InterruptedException {
		groupcashbook.click();
	   Select s =new Select(groupcashbook);
	   s.selectByVisibleText("अभिकरण");
		Thread.sleep(1200);
	}
	public void selectcashbook() throws InterruptedException {
		cashbook.click();
	   Select s =new Select(cashbook);
	   s.selectByVisibleText("अभिकरण");
		Thread.sleep(1000);
	}
	
	public void enterchallandate() throws InterruptedException {
		challandate.sendKeys("05/04/2023");
		Thread.sleep(1500);
		//challandate.sendKeys(Keys.TAB);
	}
	
	public void enterchallannumber() throws InterruptedException, AWTException {
		//challannumber.sendKeys("16411");
	
				JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
				//set the text
				jsExecutor.executeScript("document.getElementById('body_txtChalanNumber').value='16411'");
				Robot robot= new Robot();
				robot.keyPress(KeyEvent.VK_TAB);
		        robot.keyRelease(KeyEvent.VK_TAB);
		    	Thread.sleep(1500);
		
	         }
	          public void enterRTGSDDnumber() throws InterruptedException {
	        	chequertgsnumber.sendKeys("MAHBH12345689");
		        Thread.sleep(1500);
	}
	          public void selectDepartment() throws InterruptedException {
		       selectdept.click();
	          Select s =new Select(selectdept);
	              s.selectByVisibleText("बांधकाम विभाग-३ (दक्षिण)");
		      Thread.sleep(1000);
	}
	          public void Clickforheadcodeselection() throws InterruptedException {
	         SelectHeadcode.click();
	         Thread.sleep(1000);
	         
	      } 
	          public void scrollatheadcodeselection() throws InterruptedException {
	        	  Scrolling.click();
		         Thread.sleep(1000);
		         Actions act = new Actions(driver);
		            act.sendKeys(Keys.PAGE_DOWN).build().perform(); //Page Down
		            System.out.println("Scroll down perfomed");
		            Thread.sleep(3000);
		         
		            act.sendKeys(Keys.PAGE_UP).build().perform();   //Page Up
		            System.out.println("Scroll up perfomed");
		            Thread.sleep(3000);
		      }
	          public void Clickforheadcodeselectionforselect() throws InterruptedException {
	 	       headcode.click();
	 	         Thread.sleep(1000);
	 	         
	 	      } 
	          public void enterreceiptamount() throws InterruptedException {
	        	  receiptamount.sendKeys("4585000");
			        Thread.sleep(1500);
			        //receiptamount.sendKeys(Keys.TAB);

	      	}
	          public void selectapprovedby() throws InterruptedException {
	        	  approvedby.click();
	      	   Select s =new Select(approvedby);
	      	   s.selectByVisibleText("Rajashree Patil");
	      		Thread.sleep(1500);
	      		approvedby.sendKeys(Keys.TAB);
	      	}
	          
	          
	          public void enterdetails() throws InterruptedException {
	        	  details.sendKeys("Detail for Receipt");
			        Thread.sleep(1000);
			        details.sendKeys(Keys.TAB);

	      	}
	          public void Clickforsavebutton() throws InterruptedException {
	        	  savebutton.click();
		 	         Thread.sleep(1000);
		 	         
		 	      } 
	          public void Clickforyesbutton() throws InterruptedException {
	        	  Treasuryyesbutton.click();
		 	         Thread.sleep(1000);
		 	         
		 	      } 
	          public void Clickforokbutton() throws InterruptedException {
	        	  TreasuryOKbutton.click();
		 	         Thread.sleep(1000);
		 	         
		 	      } 
	          public void Clickforbackbutton() throws InterruptedException {
	        	  Treasurybackbutton.click();
		 	         Thread.sleep(1000);
		 	         
		 	      } 
	          public void Clickforlogoutbutton() throws InterruptedException {
	        	  logout.click();
		 	         Thread.sleep(1000);
		 	         
		 	      } 
	          public void Clickforlogoutyesbutton() throws InterruptedException {
	        	  yeslogout.click();
		 	         Thread.sleep(1000);
		 	         
		 	      } 
	          public void enterUsernameforDycafo() throws EncryptedDocumentException, IOException {
	      		username.sendKeys(CommonUtils.getExcelData(4, 2));
	      	}

	      	public void enterPasswordforDycafo() throws EncryptedDocumentException, IOException {
	      		password.sendKeys(CommonUtils.getExcelData(4, 3));
	      	}

	      	public void clickOnLoginforDycafo() {
	      		login.click();

	      	}
	      	public void Mastertabclick() throws InterruptedException {
	        	  master.click();
		 	         Thread.sleep(1000);
		 	         
		 	      }
	      	public void Clickfortreasuryapproval() throws InterruptedException {
	        	  Treasuryapproval.click();
		 	         Thread.sleep(1000);
		 	         
		 	      }
	    	public void Clickoncheckbox() throws InterruptedException {
	    		selectcheckbox.click();
		 	         Thread.sleep(1000);
		 	         
		 	      }
	    	public void Clickonapprovebutton() throws InterruptedException {
	    		approvebutton.click();
		 	         Thread.sleep(1000);
		 	         
		 	      }
	    	public void Clickonyesbuttonforapproval() throws InterruptedException {
	    		approveyesbutton.click();
		 	         Thread.sleep(1000);
		 	         
		 	      }
	    	public void Clickonokbuttonforapproval() throws InterruptedException {
	    		approveokbutton.click();
		 	         Thread.sleep(1000);
		 	         
		 	      }
	    	
	          
}
