package pom;

import java.awt.AWTException;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseclasses.BaseClass;
import baseclasses.CancelButtonClickInPrintWindow;
import baseclasses.CommonUtils;

public class BeneficiaryCreation extends BaseClass {

	String accNumber = "";
	@FindBy(xpath = "//input[@id='txtUser']")
	public WebElement username;

	@FindBy(xpath = "//input[@id='txtPass']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='btnLogin']")
	public WebElement login;

	@FindBy(xpath = "//a[normalize-space()='Master']")
	public WebElement Mastermenu;

	@FindBy(xpath = "//a[normalize-space()='Vendor Creation']")
	public WebElement vendorcreation;

	@FindBy(xpath = "//input[@id='body_txtPartyName']")
	public WebElement vendorname;

	@FindBy(xpath = "//input[@id='body_txtMobile']")
	public WebElement mobilenumber;

	@FindBy(xpath = "//input[@id='body_txtEmail']")
	public WebElement vendoremail;

	@FindBy(xpath = "//textarea[@id='body_txtAddress']")
	public WebElement vendoraddress;

	@FindBy(xpath = "//input[@id='body_txtPinCode']")
	public WebElement pincode;

	@FindBy(xpath = "//input[@id='body_txtCity']")
	public WebElement city;

	@FindBy(xpath = "//input[@id='body_txtPANNO']")
	public WebElement vendorpan;

	@FindBy(xpath = "//input[@id='body_txtTANNO']")
	public WebElement vendortan;

	@FindBy(xpath = "//input[@id='body_txtGSTNO']")
	public WebElement vendorgst;

	@FindBy(xpath = "//input[@id='body_txtAdhar']")
	public WebElement vendoradhar;

	@FindBy(xpath = "//input[@id='body_txtIFSC']")
	public WebElement vendorIFSC;

	@FindBy(xpath = "//input[@id='body_txtMICR']")
	public WebElement vendorMICR;

	@FindBy(xpath = "//input[@id='body_txtBankName']")
	public WebElement vendorBank;

	@FindBy(xpath = "//input[@id='body_txtBranchName']")
	public WebElement vendorBranch;

	@FindBy(xpath = "//input[@id='body_txtAccountNo']")
	public WebElement vendoracc;

	@FindBy(xpath = "//input[@id='body_txtConfirmAccount']")
	public WebElement vendoraccconfirm;

	@FindBy(xpath = "//input[@id='FileUploadPassbook']")
	public WebElement fileuploadpassboook;

	@FindBy(xpath = "//input[@id='FileUploadCheck']")
	public WebElement fileuploadcheque;

	@FindBy(xpath = "//input[@id='FileUploadPan']")
	public WebElement fileuploadpan;

	@FindBy(xpath = "//input[@id='FileUploadTan']")
	public WebElement fileuploadtan;

	@FindBy(xpath = "//input[@id='FileUploadGST']")
	public WebElement fileuploadgst;

	@FindBy(xpath = "//input[@id='FileUploadAadhar']")
	public WebElement fileuploadadhar;

	@FindBy(xpath = "//input[@id='body_btnHide']")
	public WebElement fileuploadok;

	@FindBy(xpath = "//span[@id='body_lblFileUploadPassbook']")
	public WebElement fileuploadclick;

	@FindBy(xpath = "//input[@id='body_btnSubmit']")
	public WebElement vendorsave;

	@FindBy(id = "body_btnModalOK")
	public WebElement vendorsaveyes;

	@FindBy(xpath = "//input[@id='body_btnRedirect']")
	public WebElement vendorsaveok;

	@FindBy(xpath = "//input[@id='body_btnPrint']")
	public WebElement printbutton;

	@FindBy(className = "cancel-button")
	public WebElement cancelbutton;

	@FindBy(xpath = "//input[@id='body_btnBack']")
	public WebElement backbutton;

	@FindBy(xpath = "//input[@id='btnLogout']")
	public WebElement logout;

	@FindBy(xpath = "//input[@id='btnYesLogout']")
	public WebElement yeslogout;

	@FindBy(xpath = "//a[normalize-space()='Management']")
	public WebElement Management;

	@FindBy(xpath = "//a[normalize-space()='Beneficiary Approval']")
	public WebElement vendorapproval;

	@FindBy(xpath = "	//input[@id='body_grdApprovalPending_chkApproval_0']")
	public WebElement selectcheckbox;

	@FindBy(id = "body_btnApprove")
	public WebElement approvebutton;

	@FindBy(xpath = "//input[@id='body_btnOK']")
	public WebElement approveyesbutton;

	@FindBy(xpath = "//input[@id='body_btnDeductionApprovalOk']")
	public WebElement approveokbutton;

	public BeneficiaryCreation() {
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

	public void clickOnvendorcreationMenu() {
		vendorcreation.click();
	}

	public void enterPartyDetails() throws EncryptedDocumentException, IOException, InterruptedException {
		vendorname.sendKeys(CommonUtils.getExcelData(36, 3));
		vendorname.sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}

	public void entermobilenumberdetails()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		mobilenumber.sendKeys(CommonUtils.getExcelData(37, 3));
		mobilenumber.sendKeys(Keys.TAB);
		Thread.sleep(1500);
	}

	public void enterEMailID() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		vendoremail.sendKeys(CommonUtils.getExcelData(38, 3));
		vendoremail.sendKeys(Keys.TAB);
		Thread.sleep(1500);
	}

	public void entervendoraddress()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		vendoraddress.sendKeys(CommonUtils.getExcelData(39, 3));
		vendoraddress.sendKeys(Keys.TAB);
		Thread.sleep(1500);
	}

	public void entervendorpincode()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		pincode.sendKeys(CommonUtils.getExcelData(40, 3));
		pincode.sendKeys(Keys.TAB);
		Thread.sleep(1500);
	}

	public void entervendorcity() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		city.sendKeys(CommonUtils.getExcelData(41, 3));
		city.sendKeys(Keys.TAB);
		Thread.sleep(1500);
	}

	public void entervendorpan() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		// vendorpan.sendKeys(CommonUtils.getExcelData(42, 3));
		pannumberMap = CommonUtils.generatePAN(5);
		vendorpan.sendKeys(pannumberMap.get("PANNUMBER"));
		Thread.sleep(1000);
		vendorpan.sendKeys(Keys.TAB);

		Thread.sleep(1500);
	}

	public void entervendortan() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		vendortan.sendKeys(CommonUtils.getExcelData(43, 3));
		vendortan.sendKeys(Keys.TAB);
		Thread.sleep(1500);
	}

	public void entervendorgst() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		vendorgst.sendKeys(CommonUtils.getExcelData(44, 3));
		vendorgst.sendKeys(Keys.TAB);
		Thread.sleep(1500);
	}

	public void entervendoradhar() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		vendoradhar.sendKeys(CommonUtils.generateAadharNumber(12));
		vendoradhar.sendKeys(Keys.TAB);
		Thread.sleep(1500);
	}

	public void vendorIFSC() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		vendorIFSC.sendKeys(CommonUtils.getExcelData(46, 3));
		vendorIFSC.sendKeys(Keys.TAB);
		Thread.sleep(1500);
	}

	public void entervendoracc() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		accNumber = CommonUtils.generateAccountNumber(18);
		vendoracc.sendKeys(accNumber);
		vendoracc.sendKeys(Keys.TAB);
		Thread.sleep(1500);
	}

	public void entervendoraccconfirm()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		vendoraccconfirm.sendKeys(accNumber);
		vendoraccconfirm.sendKeys(Keys.TAB);
		Thread.sleep(1500);
	}

	public void uploadpassboookcopyfile()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		fileuploadpassboook.sendKeys(CommonUtils.getExcelData(49, 3));
		fileuploadpassboook.sendKeys(Keys.TAB);
		Thread.sleep(1500);
	}

	public void clickokafterfileupload()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		fileuploadok.click();
		Thread.sleep(1500);
	}

	public void clickonpassbookcopyafterfileupload()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		CommonUtils.openOrdercopy("//span[@id='body_lblFileUploadPassbook']");
		Thread.sleep(1500);
	}

	public void uploadchequecopyfile()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		fileuploadcheque.sendKeys(CommonUtils.getExcelData(50, 3));
		fileuploadcheque.sendKeys(Keys.TAB);
		Thread.sleep(1500);
	}

	public void clickonchequecopyafterfileupload()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		CommonUtils.openOrdercopy("//span[@id='body_lblFileUploadCheck']");
		Thread.sleep(1500);
	}

	public void uploadpancopyfile() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		fileuploadpan.sendKeys(CommonUtils.getExcelData(51, 3));
		fileuploadpan.sendKeys(Keys.TAB);
		Thread.sleep(1500);
	}

	public void clickonpancopyafterfileupload()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		CommonUtils.openOrdercopy("//span[@id='body_lblFileUploadPan']");
		Thread.sleep(1500);
	}

	public void uploadtancopyfile() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		fileuploadtan.sendKeys(CommonUtils.getExcelData(52, 3));
		fileuploadtan.sendKeys(Keys.TAB);
		Thread.sleep(1500);
	}

	public void clickontancopyafterfileupload()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		CommonUtils.openOrdercopy("//span[@id='body_lblFileUploadTan']");
		Thread.sleep(1500);
	}

	public void uploadgstcopyfile() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		fileuploadgst.sendKeys(CommonUtils.getExcelData(53, 3));
		fileuploadgst.sendKeys(Keys.TAB);
		Thread.sleep(1500);
	}

	public void clickongstcopyafterfileupload()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		CommonUtils.openOrdercopy("//span[@id='body_lblFileUploadGST']");
		Thread.sleep(1500);
	}

	public void uploadadharcopyfile()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		fileuploadadhar.sendKeys(CommonUtils.getExcelData(54, 3));
		fileuploadadhar.sendKeys(Keys.TAB);
		Thread.sleep(1500);
	}

	public void clickonadharcopyafterfileupload()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		CommonUtils.openOrdercopy("//span[@id='body_lblFileUploadAadhar']");
		Thread.sleep(1500);
	}

	public void clickosaveforvendor()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		vendorsave.click();
		Thread.sleep(1500);
	}

	public void clickosaveyesforvendor()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		vendorsaveyes.click();
		Thread.sleep(1500);
	}

	public void clickosaveokforvendor()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		vendorsaveok.click();
		Thread.sleep(1500);
	}

	public void clickonprintbutton()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		CancelButtonClickInPrintWindow aa = new CancelButtonClickInPrintWindow("CancelButtonClickInPrintWindow", 5000);
		printbutton.click();
		Thread.sleep(1500);
	}

	public void clickonbackbutton() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		backbutton.click();
		Thread.sleep(1500);
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

	public void clickOnmanagementmenu() throws InterruptedException {
		Management.click();
		Thread.sleep(1000);
	}

	public void clickOnBeneficiaryapprovaltmenu() throws InterruptedException {
		vendorapproval.click();
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

	public void checkTextFieldAcceptLessThan10Charercter()
			throws EncryptedDocumentException, InterruptedException, IOException {
		boolean digits = false;

		mobilenumber.sendKeys("989898988977878");
		String typedValue = mobilenumber.getAttribute("value");
		Thread.sleep(1000);

		int size = typedValue.length();
		Thread.sleep(1000);
		if (size == 10) {
			digits = true;

			System.out.println("More than 10 digits not allowed for mobile number textbox");

		} else {
			digits = false;
			System.out.println("mobile number textbox accepting the more than 10 digits");
		}
		mobilenumber.clear();
		Thread.sleep(1000);
		Assert.assertTrue(digits);
	}

	public void checkTextFieldvalidations() throws EncryptedDocumentException, InterruptedException, IOException {
//		boolean characters = false;
		String expected = "45464654564467&^%^^&";
		vendorname.sendKeys(expected);
		String typedValue = vendorname.getAttribute("value").trim();
		Thread.sleep(1000);
		System.out.println("typed value=====" + typedValue);
//		String txt = typedValue.toString();
		if (expected.equalsIgnoreCase(typedValue)) {

			System.out.println("Textfield Accept Alpabhets ");

		} else {

			System.out.println("Textfield Not Accept Alpabhets");
		}
		Assert.assertEquals(typedValue, expected);
		vendorname.clear();
		Thread.sleep(1000);
	}

	public void checkemailTextFieldvalidations() throws EncryptedDocumentException, InterruptedException, IOException {
//		boolean characters = false;
		String expected = "demo99@gmail.com";
		vendoremail.sendKeys(expected);
		String AccpetedValue = vendoremail.getAttribute("value").trim();
		Thread.sleep(1000);
		System.out.println("typed value ====" + AccpetedValue);
//		String txt = typedValue.toString();
		if (expected.equalsIgnoreCase(AccpetedValue)) {

			System.out.println("Textfiled Accept valid email ");

		} else {

			System.out.println("Textfiled not accept email");
		}
		Assert.assertEquals(AccpetedValue, expected);
		vendoremail.clear();
		Thread.sleep(1000);
	}
//	public void TocheckthatEmailIDshouldnotacceptAlphanumeric() throws EncryptedDocumentException, InterruptedException, IOException {
////		boolean characters = false;
//		String expected = "EMAIL123456";
//		vendoremail.sendKeys(expected);
//		String AcceptedValue = vendoremail.getAttribute("value").trim();
//		Thread.sleep(1000);
//		System.out.println("typed value ====" + AcceptedValue);
////		String txt = typedValue.toString();
//		if (expected.equalsIgnoreCase(AcceptedValue)) {
//
//			System.out.println("Textfiled Accept Alphanumeric ");
//
//		} else {
//
//			System.out.println("Textfiled not accept Alphanumeric ");
//		}
//		Assert.assertEquals(AcceptedValue, expected);
//		vendoremail.clear();
//		Thread.sleep(1000);
//	}
//	

}