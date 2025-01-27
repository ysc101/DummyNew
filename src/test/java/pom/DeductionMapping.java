package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import baseclasses.BaseClass;
import baseclasses.CancelButtonClickInPrintWindow;
import baseclasses.CommonUtils;

public class DeductionMapping extends BaseClass {

	@FindBy(xpath = "//input[@id='txtUser']")
	public WebElement username;

	@FindBy(xpath = "//input[@id='txtPass']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='btnLogin']")
	public WebElement login;

	@FindBy(xpath = "//a[normalize-space()='Master']")
	public WebElement Mastermenu;

	@FindBy(xpath = "//a[normalize-space()='Deduction Account Mapping']")
	public WebElement deductionmappingmenu;

	@FindBy(xpath = "//select[@id='body_ddlBillType']")
	public WebElement selectbilltype;

	@FindBy(xpath = "//input[@id='body_grdDeductionDetails_txtgAccountPayEnglish_17']")
	public WebElement surchargeaccpayee;

	@FindBy(xpath = "//input[@id='body_grdDeductionDetails_txtgBankName_17']")
	public WebElement surchargebnkname;

	@FindBy(xpath = "//input[@id='body_grdDeductionDetails_txtgBranchName_17']")
	public WebElement branchname;

	@FindBy(xpath = "//input[@id='body_grdDeductionDetails_txtgAccountNumber_17']")
	public WebElement srchrgeaccnumber;

	@FindBy(xpath = "//input[@id='body_grdDeductionDetails_txtgIFSC_17']")
	public WebElement srchrgeIFSC;

	@FindBy(xpath = "//input[@id='body_grdDeductionDetails_txtgMICR_17']")
	public WebElement srchrgeMICR;

	@FindBy(xpath = "	//input[@id='body_grdDeductionDetails_txtgBankAddress_17']")
	public WebElement srchrgeaddress;

	@FindBy(xpath = "//input[@id='body_grdDeductionDetails_txtgBankplace_17']")
	public WebElement srchrgeplace;

	@FindBy(xpath = "//input[@id='body_grdDeductionDetails_txtgDistrict_17']")
	public WebElement district;

	@FindBy(xpath = "//input[@id='body_grdDeductionDetails_txtgAccountPayEnglish_18']")
	public WebElement saletaxaccpayee;

	@FindBy(xpath = "//input[@id='body_grdDeductionDetails_txtgBankName_18']")
	public WebElement saletaxbnkname;

	@FindBy(xpath = "//input[@id='body_grdDeductionDetails_txtgBranchName_18']")
	public WebElement saletaxbranchname;

	@FindBy(xpath = "//input[@id='body_grdDeductionDetails_txtgAccountNumber_18']")
	public WebElement saletaxaccnumber;

	@FindBy(xpath = "//input[@id='body_grdDeductionDetails_txtgIFSC_18']")
	public WebElement saletaxIFSC;

	@FindBy(xpath = "//input[@id='body_grdDeductionDetails_txtgMICR_18']")
	public WebElement saletaxMICR;

	@FindBy(xpath = "	//input[@id='body_grdDeductionDetails_txtgBankAddress_18']")
	public WebElement saletaxaddress;

	@FindBy(xpath = "//input[@id='body_grdDeductionDetails_txtgBankplace_18']")
	public WebElement saletaxplace;

	@FindBy(xpath = "//input[@id='body_grdDeductionDetails_txtgDistrict_18']")
	public WebElement saletaxdistrict;

	@FindBy(id = "body_btnDeduction")
	public WebElement deductionsave;

	@FindBy(id = "body_btnYes")
	public WebElement deductionyes;

	@FindBy(xpath = "//input[@id='body_b_print']")
	public WebElement deductionprint;

	@FindBy(xpath = "//input[@id='body_btnBack']")
	public WebElement deductionback;

	@FindBy(xpath = "//input[@id='btnLogout']")
	public WebElement logout;

	@FindBy(xpath = "//input[@id='btnYesLogout']")
	public WebElement yeslogout;
	
	@FindBy(xpath = "//a[normalize-space()='Deduction Mapping Approval']")
	public WebElement deductionapprovalmenu;
	
	@FindBy(xpath = "	//input[@id='body_grdApprovalPending_chkApproval_0']")
	public WebElement selectcheckbox;

	@FindBy(id = "body_btnApprove")
	public WebElement approvebutton;

	@FindBy(xpath = "//input[@id='body_btnOK']")
	public WebElement approveyesbutton;

	@FindBy(xpath = "//input[@id='body_btnDeductionApprovalOk']")
	public WebElement approveokbutton;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public DeductionMapping() {
		PageFactory.initElements(driver, this);
	}

	public void enterUserName() throws EncryptedDocumentException, IOException {
		username.sendKeys(CommonUtils.getExcelData(1, 2));
	}

	public void enterPassword() throws EncryptedDocumentException, IOException {
		password.sendKeys(CommonUtils.getExcelData(1, 3));
	}

	public void clickOnLogin() {
		login.click();
	}

	public void clickOnMasterMenu() {
		Mastermenu.click();
	}

	public void clickOndeductionmappingmenu() {
		deductionmappingmenu.click();
	}

	public void selectbilltype() throws InterruptedException {
		Select Sel = new Select(selectbilltype);
		Sel.selectByVisibleText("WORKS");
		Thread.sleep(1000);
	}

	public void adddetailsforsurchargeaccpayee() throws EncryptedDocumentException, IOException, InterruptedException {
		surchargeaccpayee.sendKeys(CommonUtils.getExcelData(57, 3));
		surchargeaccpayee.sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}

	public void adddetailsforBankname() throws EncryptedDocumentException, IOException, InterruptedException {
		surchargebnkname.sendKeys(CommonUtils.getExcelData(58, 3));
		surchargebnkname.sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}

	public void adddetailsforbranchname() throws EncryptedDocumentException, IOException, InterruptedException {
		branchname.sendKeys(CommonUtils.getExcelData(59, 3));
		branchname.sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}

	public void entertheaccountnumber() throws EncryptedDocumentException, IOException, InterruptedException {
		srchrgeaccnumber.sendKeys(CommonUtils.generateAccountNumber(20));
		srchrgeaccnumber.sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}

	public void entertheIFSCCode() throws EncryptedDocumentException, IOException, InterruptedException {
		srchrgeIFSC.sendKeys(CommonUtils.getExcelData(61, 3));
		srchrgeIFSC.sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}

	public void enterthesrchrgeMICR() throws EncryptedDocumentException, IOException, InterruptedException {
		srchrgeMICR.sendKeys(CommonUtils.getExcelData(62, 3));
		srchrgeMICR.sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}

	public void entertheaddress() throws EncryptedDocumentException, IOException, InterruptedException {
		srchrgeaddress.sendKeys(CommonUtils.getExcelData(63, 3));
		srchrgeaddress.sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}

	public void entertheplace() throws EncryptedDocumentException, IOException, InterruptedException {
		srchrgeplace.sendKeys(CommonUtils.getExcelData(64, 3));
		srchrgeplace.sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}

	public void enterthedistrict() throws EncryptedDocumentException, IOException, InterruptedException {
		district.sendKeys(CommonUtils.getExcelData(65, 3));
		district.sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}

	public void adddetailsforsaletaxaccpayee() throws EncryptedDocumentException, IOException, InterruptedException {
		saletaxaccpayee.sendKeys(CommonUtils.getExcelData(57, 3));
		saletaxaccpayee.sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}

	public void adddetailsforsaletaxBankname() throws EncryptedDocumentException, IOException, InterruptedException {
		saletaxbnkname.sendKeys(CommonUtils.getExcelData(58, 3));
		saletaxbnkname.sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}

	public void adddetailsforsaletaxbranchname() throws EncryptedDocumentException, IOException, InterruptedException {
		saletaxbranchname.sendKeys(CommonUtils.getExcelData(59, 3));
		saletaxbranchname.sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}

	public void enterthesaletaxaccnumber() throws EncryptedDocumentException, IOException, InterruptedException {
		saletaxaccnumber.sendKeys(CommonUtils.generateAccountNumber(20));
		saletaxaccnumber.sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}

	public void enterthesaletaxIFSC() throws EncryptedDocumentException, IOException, InterruptedException {
		saletaxIFSC.sendKeys(CommonUtils.getExcelData(61, 3));
		saletaxIFSC.sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}

	public void enterthesaletaxMICR() throws EncryptedDocumentException, IOException, InterruptedException {
		saletaxMICR.sendKeys(CommonUtils.getExcelData(62, 3));
		saletaxMICR.sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}

	public void entertheaddressfordsaletax() throws EncryptedDocumentException, IOException, InterruptedException {
		saletaxaddress.sendKeys(CommonUtils.getExcelData(63, 3));
		saletaxaddress.sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}

	public void enterthesaletaxplace() throws EncryptedDocumentException, IOException, InterruptedException {
		saletaxplace.sendKeys(CommonUtils.getExcelData(64, 3));
		saletaxplace.sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}

	public void enterthesaletaxdistrict() throws EncryptedDocumentException, IOException, InterruptedException {
		saletaxdistrict.sendKeys(CommonUtils.getExcelData(65, 3));
		saletaxdistrict.sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}

	public void clickOnsavebutton() throws InterruptedException {
		deductionsave.click();
		Thread.sleep(1000);
	}

	public void clickOnyesaftersave() throws InterruptedException {
		deductionyes.click();
		Thread.sleep(1000);
	}

	public void clickfordeductionprint() throws InterruptedException {
		CancelButtonClickInPrintWindow aa = new CancelButtonClickInPrintWindow("CancelButtonClickInPrintWindow", 8000);
		deductionprint.click();
		Thread.sleep(1000);
	}

	public void clickOnbackbutton() throws InterruptedException {
		deductionback.click();
		Thread.sleep(1000);
	}

	public void clickOnlogoutbutton() throws InterruptedException {
		logout.click();
		Thread.sleep(1000);
	}

	public void clickOnyeslogout() throws InterruptedException {
		yeslogout.click();
		Thread.sleep(1000);
	}

	public void clickOndeductionapprovalmenu() throws InterruptedException {
		deductionapprovalmenu.click();
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
	public void enterUsernameforHOD() throws EncryptedDocumentException, IOException {
		username.sendKeys(CommonUtils.getExcelData(3, 2));
	}

	public void enterPasswordforHOD() throws EncryptedDocumentException, IOException {
		password.sendKeys(CommonUtils.getExcelData(3, 3));
	}

	public void clickOnLoginforHOD() {
		login.click();
	}


}
