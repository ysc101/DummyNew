package pom;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import baseclasses.BaseClass;
import baseclasses.CommonUtils;

public class WorkDetails extends BaseClass  {
	String WorkUniqueID = "";
	String generateNum = generateAccountNumber(mapAANumber);
	String prmanumber="";


	@FindBy(xpath = "//input[@id='txtUser']")
	public WebElement username;

	@FindBy(xpath = "//input[@id='txtPass']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='btnLogin']")
	public WebElement login;

	@FindBy(xpath = "//a[normalize-space()='Administrative Work']")
	public WebElement AdministrativeWork;

	@FindBy(linkText = "Work Details")
	public WebElement workDetails;
	
	@FindBy(xpath = "//a[normalize-space()='Work Details Creation']")
	public WebElement Workdetailcreation;
	
	@FindBy(xpath = "//select[@id='body_ddlGroupCashbook']")
	public WebElement rokhvahigat;

	@FindBy(xpath = "//select[@id='body_ddlCashBook']")
	public WebElement rokhvahi;
	
	@FindBy(xpath = "//input[@id='body_txtHeadtype']")
	public WebElement enterheadcode;
	
	@FindBy(xpath="//a[@id='body_grdHeadType_btnHeadCode_0']")
	public WebElement selectheacode;
	
	@FindBy(xpath="//select[@id='body_ddlAdminApprovalNo']")
	public WebElement selectprama;
	
	@FindBy(xpath="//input[@id='body_txtDocumentDetails']")
	public WebElement ducumentdetail;

	@FindBy(xpath="//a[@id='body_grdPartyDetails_lblPartyName_0']")
	public WebElement clickonparty;
		
	@FindBy(id="body_txtWorkName")  //*[@id="body_txtWorkName"]
	public WebElement workname;
	
	@FindBy(xpath="//input[@id='body_txtWorkordNo']")
	public WebElement workordernumber;
	
	@FindBy(xpath="//input[@id='body_txtWorkOrdDate']")
	public WebElement workdate;
	
	@FindBy(xpath="//a[normalize-space()='14']")
	public WebElement workdateselect;
	
	@FindBy(xpath="//input[@id='body_txtWorkOrderEndDate']")
	public WebElement workenddate;
	
	@FindBy(xpath="//a[normalize-space()='30']")
	public WebElement workenddateselect;
	
	@FindBy(xpath="//input[@id='body_txtNivalTotal']")
	public WebElement worktenderamount;
	
	@FindBy(xpath="//input[@id='body_txtNetPayment']")
	public WebElement paidamount;
	
	@FindBy(xpath="//input[@id='FileUpload']")
	public WebElement fileupload;
	
	@FindBy(id="Button1")
	public WebElement fileuploadbutton;
	
	@FindBy(xpath="//input[@id='body_btnSave']")
	public WebElement worksavebutton;
	
	@FindBy(xpath="//input[@id='body_btnYes']")
	public WebElement workyesbutton;
	
	@FindBy(xpath="//span[@id='body_lblWorkDetailsUID']")
	public WebElement workid;
	
	@FindBy(xpath="//input[@id='body_btnRedirect']")
	public WebElement workokbutton;
	
	@FindBy(xpath="//input[@id='body_btnBack']")
	public WebElement workbackbutton;
	
	@FindBy(xpath="//a[normalize-space()='Work Details OutBox']")
	public WebElement makerworkoutbox;
	
	@FindBy(xpath="//select[@id='body_ddlStatus']")
	public WebElement workstatus;
	
	@FindBy(xpath="//input[@type='search']")
	public WebElement workuidsearch;

	@FindBy(xpath="//div[@class='btnDatatable']")
	public WebElement viewworkslip;
	
	@FindBy(xpath="//input[@id='body_Button1']")
	public WebElement workoutboxback;
	
	@FindBy(xpath="//input[@id='btnLogout']")
	public WebElement logout;
	
	@FindBy(xpath="//input[@id='btnYesLogout']")
	public WebElement yeslogout;
	
	@FindBy(xpath="//a[normalize-space()='Work Approval (Inwards)']")
	public WebElement Workinbox;
	
    @FindBy(xpath="//input[@id='body_btnApprove']")
    public WebElement Approve;
 

	
	
	
	
	public WorkDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	private String generateAccountNumber(java.util.Map<String, String> mapAANumber) {
		return null;
}

	public void enterUsername() throws EncryptedDocumentException, IOException {
		username.sendKeys(CommonUtils.getExcelData(1, 2));
	}

	public void enterPassword() throws EncryptedDocumentException, IOException {
		password.sendKeys(CommonUtils.getExcelData(1, 3));
	}

	public void clickOnLogin() {
		login.click();

	}

	public void clickOnAdministrativeWork() throws InterruptedException {
		AdministrativeWork.click();
		Thread.sleep(1000);

	}

	public void MovetoWorkDetails() throws InterruptedException {
		Actions hover = new Actions(driver);
		hover.moveToElement(workDetails).perform();
		Thread.sleep(1000);

	}

	public void clickOnWorkDetails() throws InterruptedException {
		Workdetailcreation.click();
		Thread.sleep(1000);
	}
	public void selectrokhvahigat() throws InterruptedException {
		rokhvahigat.click();
		Select select = new Select(rokhvahigat);
		select.selectByVisibleText("अभिकरण");
		Thread.sleep(1000);
	}

	public void selectrokhvahi() throws InterruptedException {
		rokhvahi.click();
		Select select = new Select(rokhvahi);
		select.selectByVisibleText("अभिकरण");
		Thread.sleep(1000);
}
	public void enterheadcode() throws InterruptedException, EncryptedDocumentException, IOException {
		enterheadcode.sendKeys(CommonUtils.getExcelData(14, 3));
		enterheadcode.sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}
		
	public void selectheadcode() throws InterruptedException, EncryptedDocumentException, IOException {
			selectheacode.click();
			Thread.sleep(1000);
		}
	public void clickonAdminApprovalNumber() throws InterruptedException {
		selectprama.click();
		 Select select = new Select(selectprama);
		 //String prmanumber =mapAANumber.get("prmanumber");
			Thread.sleep(1000);
	        //select.selectByVisibleText(prmanumber);

//		   List<WebElement> options = select.getOptions();
//		int size= options.size()-1;
		 select.selectByIndex(1);
		 
	    
//      Thread.sleep(1000);;

	}
	public void enterdocumentdetails() throws InterruptedException, EncryptedDocumentException, IOException {
		ducumentdetail.sendKeys(CommonUtils.getExcelData(21, 3));
		Thread.sleep(2000);
}
	public void Clickonbeneficiary() throws InterruptedException, EncryptedDocumentException, IOException {
		clickonparty.click();
		Thread.sleep(2000);
	}
	public void EnterWorkName() throws InterruptedException, EncryptedDocumentException, IOException, AWTException {
		//workname.sendKeys(CommonUtils.getExcelData(22, 3));
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
		//set the text
		jsExecutor.executeScript("document.getElementById('body_txtWorkName').value='मौजे कदमवाडी म पेठ येथे जि प प्राथ शाळा दुरुस्ती करणे ता पाटण'");
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(2500);
		
	}
	public void EnterWorkNumber() throws InterruptedException, EncryptedDocumentException, IOException {
		//workordernumber.sendKeys(CommonUtils.getExcelData(23, 3));
		workordernumber.sendKeys(CommonUtils.RandomCharactor(driver, 5));
		Thread.sleep(1500);
		workordernumber.sendKeys(Keys.TAB);
		
	}
	public void workdate() throws InterruptedException, EncryptedDocumentException, IOException {
		workdate.click();
		//workdate.sendKeys(Keys.TAB);
		Thread.sleep(1300);

	}
	public void workdateselect() throws InterruptedException, EncryptedDocumentException, IOException {
		workdateselect.click();
		//workdateselect.sendKeys(Keys.TAB);
		Thread.sleep(1300);

	}
	public void workenddate() throws InterruptedException, EncryptedDocumentException, IOException {
		workenddate.click();
		Thread.sleep(1200);
		//workenddate.sendKeys(Keys.TAB);

	}
	public void workenddateselect() throws InterruptedException, EncryptedDocumentException, IOException {
		workenddateselect.click();
		Thread.sleep(1200);
		//workenddateselect.sendKeys(Keys.TAB);

	}
	public void worktenderamount() throws InterruptedException, EncryptedDocumentException, IOException {
		worktenderamount.sendKeys(CommonUtils.getExcelData(24, 3));
		Thread.sleep(1000);
		worktenderamount.sendKeys(Keys.TAB);

	}
	public void workpaidamount() throws InterruptedException, EncryptedDocumentException, IOException {
		paidamount.sendKeys(CommonUtils.getExcelData(25, 3));
		Thread.sleep(1000);

	}
	public void fileupload() throws InterruptedException, EncryptedDocumentException, IOException {
		fileupload.sendKeys(CommonUtils.getExcelData(26, 3));
		Thread.sleep(1000);
		
	}
	public void fileuploadbutton() throws InterruptedException, EncryptedDocumentException, IOException {
		fileuploadbutton.click();
		Thread.sleep(1000);
		
	}
	public void Worksavebutton() throws InterruptedException, EncryptedDocumentException, IOException {
		worksavebutton.click();
		Thread.sleep(1000);
		
	}
	public void Workyesbutton() throws InterruptedException, EncryptedDocumentException, IOException {
		workyesbutton.click();
		Thread.sleep(1000);
		
	}
	public void workokbutton() throws InterruptedException, EncryptedDocumentException, IOException {
		
		WorkUniqueID= workid.getText();
		System.out.println("Unique UID ==="+WorkUniqueID );
		workokbutton.click();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click();", workokbutton);
	}
	
	public void Clickonbackbutton() throws InterruptedException, EncryptedDocumentException, IOException {
		workbackbutton.click();
		Thread.sleep(1000);
}
	public void ClickonMakerWorkOutbox() throws InterruptedException, EncryptedDocumentException, IOException {
		makerworkoutbox.click();
		Thread.sleep(1000);
		
	}
	public void Clickonworkstatus() throws InterruptedException {
		workstatus.click();
		Select select = new Select(workstatus);
		select.selectByVisibleText("Pending");
		Thread.sleep(1000);
	}
	public void SearchWorkUID() throws InterruptedException, EncryptedDocumentException, IOException {
		workuidsearch.sendKeys(WorkUniqueID);;
		Thread.sleep(1200);
	}
	public void clickonworkslip() throws InterruptedException {
		viewworkslip.click();
		Thread.sleep(1000);
	}
	public void ClickonbackbuttonforOutbox() throws InterruptedException, EncryptedDocumentException, IOException {
		workoutboxback.click();
		Thread.sleep(1000);
}
	public void ClicktoLogout() throws InterruptedException, EncryptedDocumentException, IOException {
		logout.click();
		Thread.sleep(1000);
		
	}
	public void ClicktoYesforLogout() throws InterruptedException, EncryptedDocumentException, IOException {
		yeslogout.click();
		Thread.sleep(1000);
		
	}

	public void enterUsernameforHOD() throws EncryptedDocumentException, IOException {
		username.sendKeys(CommonUtils.getExcelData(3, 2));
	}

	public void enterPasswordforHOD() throws EncryptedDocumentException, IOException {
		password.sendKeys(CommonUtils.getExcelData(3, 3));
	}

	public void clickOnLoginforHOD() {
		login.click();

	}
	public void clickOnworkInbox() throws InterruptedException {
		Workinbox.click();
		Thread.sleep(1000);
	}
         public void clickforAAApproval() throws InterruptedException {
     	Approve.click();
         Thread.sleep(1000);
     }
    public void clickforBackafterworkApproval() throws InterruptedException {
        workbackbutton.click();
      Thread.sleep(1000);
      }
}


	
