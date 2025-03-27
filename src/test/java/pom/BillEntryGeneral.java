package pom;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

import baseclasses.BaseClass;
import baseclasses.CommonUtils;

public class BillEntryGeneral<Action> extends BaseClass {

	String BillDemandNumber = "";
	String InvoiceNumber = "";

	@FindBy(xpath = "//input[@id='txtUser']")
	public WebElement username;

	@FindBy(xpath = "//input[@id='txtPass']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='btnLogin']")
	public WebElement login;

	@FindBy(xpath = "//a[normalize-space()='Financial Work']")
	public WebElement financialWork;

	@FindBy(xpath = "//a[normalize-space()='Bill Creation']")
	public WebElement billcreation;

	@FindBy(xpath = "//a[normalize-space()='General Bill']")
	public WebElement generalbill;

	@FindBy(xpath = "//select[@id='body_ddlBillType']")
	public WebElement selectbilltype;

	@FindBy(xpath = "//select[@id='body_ddlGroupCashbook']")
	public WebElement selectgroupcash;

	@FindBy(xpath = "//select[@id='body_ddlCashBook']")
	public WebElement selectcash;

	@FindBy(xpath = "//input[@id='body_txtHeadtype']")
	public WebElement enterheadcode;

	@FindBy(xpath = "//a[@id='body_grdHeadType_btnHeadCode_0']")
	public WebElement selectheacode;

	@FindBy(xpath = "//input[@id='Button4']")
	public WebElement selectbeneficiary;

	@FindBy(id = "ddlSearchBeneFiciary")
	public WebElement searchby;

	@FindBy(id = "body_txtSearchLabharthiByName")
	public WebElement enterdocumentdetail;

	@FindBy(id = "Button6")
	public WebElement search;

	@FindBy(className = "btnDatatable")
	public WebElement selectbeneficiaryonclick;

	@FindBy(xpath = "//input[@id='body_Button8']")
	public WebElement selectpramaandwork;

	@FindBy(id = "body_ddlPramaNumber")
	public WebElement selectprama;

	@FindBy(id = "BTBsEARCH")
	public WebElement selectsearchbutton;

	@FindBy(id = "body_txtExpAmtYr3")
	public WebElement enterbillamount;

	@FindBy(id = "body_lblTotalPendingAmount")
	public WebElement pendingamount;

	@FindBy(id = "body_txtBalance")
	public WebElement totalbalance;

	@FindBy(xpath = "//input[@id='body_dlstEmolumentsDetails_txtEmolumentValue_8']")
	public WebElement enterpaytypeamount;

	@FindBy(xpath = "//input[@id='body_txtShera']")
	public WebElement enterremark;

	@FindBy(xpath = "//input[@id='FileUploadBillCopy']")
	public WebElement uploadbillcopy;

	@FindBy(id = "body_Button1")
	public WebElement uploadokbutton;

	@FindBy(id = "body_grdDeduction_txtDeductionAmount_1")
	public WebElement deductionamt1;

	@FindBy(id = "body_grdDeduction_txtDeductionAmount_2")
	public WebElement deductionamt2;

	@FindBy(id = "body_grdDeduction_txtDeductionAmount_3")
	public WebElement deductionamt3;

	@FindBy(id = "body_grdDeduction_txtDeductionAmount_4")
	public WebElement deductionamt4;

	@FindBy(xpath = "//input[@id='body_btnSave']")
	public WebElement billsave;

	@FindBy(xpath = "//input[@id='body_btnOK']")
	public WebElement billsaveyes;

	@FindBy(xpath = "//div[@id='body_upMain']//input[@id='body_btnYES']")
	public WebElement billsaveok;

	@FindBy(xpath = "//*[@id=\"body_lblMessageFinal\"]/span[2]")
	public WebElement billid;

	@FindBy(xpath = "//select[@id='body_ddlStatus']")
	public WebElement billtype;

	@FindBy(xpath = "//input[@type='search']")
	public WebElement billsearch;

	@FindBy(className = "btnDatatable")
	public WebElement viewbillslip;

	@FindBy(xpath = "//input[@id='btnYes']")
	public WebElement hardcopyyes;

	@FindBy(xpath = "//div[@class='caption']")
	public WebElement clickonmasslip;

	@FindBy(xpath = "//input[@id='body_btnApprove']")
	public WebElement approvebill;

	@FindBy(xpath = "//input[@id='body_btnYes']")
	public WebElement yestoapprovebill;

	@FindBy(xpath = "//input[@id='body_btnBack']")
	public WebElement inboxbackbutton;

	@FindBy(xpath = "//input[@id='btnLogout']")
	public WebElement logout;

	@FindBy(xpath = "//input[@id='btnYesLogout']")
	public WebElement yeslogout;

	@FindBy(xpath = "//a[normalize-space()='Bill Acceptance']")
	public WebElement billacceptance;

	@FindBy(xpath = "//a[normalize-space()='Bill Inwards']")
	public WebElement billinbox;

	@FindBy(xpath = "//a[normalize-space()='Invoice Generation']")
	public WebElement generateinvoice;

	@FindBy(xpath = "//input[@id='Button3']")
	public WebElement okbuttonbilltype;

	@FindBy(xpath = "//select[@id='body_ddlGroupCashbook']")
	public WebElement grcashbook;

	@FindBy(xpath = "//select[@id='body_ddlCashbook']")
	public WebElement cashbook;

	@FindBy(xpath = "//select[@id='body_ddlDesignation']")
	public WebElement designation;

	@FindBy(xpath = "//input[@name='InternalCheckbox']")
	public WebElement selectbillinvoice;

	@FindBy(id = "btnApprove")
	public WebElement invoicegenerate;

	@FindBy(id = "btnYesClickFinal")
	public WebElement yesinvoice;

	@FindBy(xpath = "//input[@id='body_btnRedirect']")
	public WebElement okinvoice;

	@FindBy(xpath = "//input[@id='body_Button2']")
	public WebElement backinvoice;

	@FindBy(xpath = "//a[normalize-space()='Master']")
	public WebElement mastermenu;

	@FindBy(xpath = "//a[normalize-space()='Final Payment Approval']")
	public WebElement finalpayment;

	@FindBy(id = "body_lblMsgFromServer")
	public WebElement invoiceid;

	@FindBy(xpath = "//input[@type='search']")
	public WebElement invoicesearch;

	@FindBy(xpath = "//input[@id='body_btnReleasePayment']")
	public WebElement releasepayment;

	@FindBy(xpath = "//input[@id='body_btnPaymentOk']")
	public WebElement yesforfinalpayment;

	@FindBy(xpath = "//input[@id='body_btnRedirect']")
	public WebElement okforfinalpayment;

	public BillEntryGeneral(WebDriver driver) {
		PageFactory.initElements(driver, this);
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

	public void clickOnFinancialWork() throws InterruptedException {
		financialWork.click();
		Thread.sleep(1000);
	}

	public void movetoBillCreation() throws InterruptedException {
		Actions hover = new Actions(driver);
		hover.moveToElement(billcreation).perform();
		Thread.sleep(1000);
	}

	public void clickOnGeneralBillCreation() throws InterruptedException {
		generalbill.click();
		Thread.sleep(1200);
	}

	public void selectbilltypefromdropdown() throws InterruptedException {
		Select s = new Select(selectbilltype);
		s.selectByVisibleText("WORKS");
		Thread.sleep(1000);
	}

	public void selectgroupcashbookfromdropdown() throws InterruptedException {
		Select s = new Select(selectgroupcash);
		s.selectByVisibleText("अभिकरण");
		Thread.sleep(1000);
	}

	public void selectcashbookfromdropdown() throws InterruptedException {
		Select s = new Select(selectcash);
		s.selectByVisibleText("अभिकरण");
		Thread.sleep(1000);
	}

	public void enterheadcodeforselection() throws InterruptedException, EncryptedDocumentException, IOException {
		enterheadcode.sendKeys(CommonUtils.getExcelData(14, 3));
		enterheadcode.sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}

	public void selectheadcodeforbillentry() throws InterruptedException {
		selectheacode.click();
		Thread.sleep(1000);
	}

	public void clickforbeneficary() throws InterruptedException {
		selectbeneficiary.click();
		Thread.sleep(1000);
	}

	public void selectsearchbydocument() throws InterruptedException {
		Select s = new Select(searchby);
		s.selectByVisibleText("Search By PANNo");
		Thread.sleep(1000);
	}

	public void enterdocumentsdetails() throws InterruptedException, EncryptedDocumentException, IOException {
		enterdocumentdetail.sendKeys(CommonUtils.getExcelData(21, 3));
		enterdocumentdetail.sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}

	public void clickonsearchforbeneficary() throws InterruptedException {
		search.click();
		Thread.sleep(1000);
	}

	public void clickonbuttonforselectionofbeneficary() throws InterruptedException, AWTException {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		// set the text
		jsExecutor.executeScript("arguments[0].click();", selectbeneficiaryonclick);
		Thread.sleep(1000);
	}

	public void clickforpramaandwork() throws InterruptedException {
		selectpramaandwork.click();
		Thread.sleep(1000);
	}

	public void selectnewprama() throws InterruptedException {
		Select s = new Select(selectprama);
		List<WebElement> options = s.getOptions();
		int size = options.size() - 1;
		s.selectByIndex(size);
		Thread.sleep(1000);
	}

	public void clickonsearchbutton() throws InterruptedException {
		selectsearchbutton.click();
		Thread.sleep(1000);
	}

	public void enterbillamount() throws InterruptedException, EncryptedDocumentException, IOException, AWTException {
		enterbillamount.clear();
		enterbillamount.sendKeys(CommonUtils.getExcelData(27, 3));
		enterbillamount.sendKeys(Keys.TAB);
//		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
//		//set the text
//		jsExecutor.executeScript("enterbillamount.value='540");
		Thread.sleep(1000);
	}

	public void enterpaymenttypeamount() throws InterruptedException, EncryptedDocumentException, IOException {
		enterpaytypeamount.sendKeys(CommonUtils.getExcelData(27, 3));
		Thread.sleep(1000);
	}

	public void enterremark() throws InterruptedException, EncryptedDocumentException, IOException {
		enterremark.sendKeys(CommonUtils.getExcelData(28, 3));
		Thread.sleep(1000);
	}

	public void uploadbillcopy() throws InterruptedException, EncryptedDocumentException, IOException {
		uploadbillcopy.sendKeys(CommonUtils.getExcelData(29, 3));
		Thread.sleep(1000);
	}

	public void clickonokbuttonforuploadcopy() throws InterruptedException, EncryptedDocumentException, IOException {
		uploadokbutton.click();
		Thread.sleep(1000);
	}

	public void enterdeductionamt1() throws InterruptedException, EncryptedDocumentException, IOException {
		deductionamt1.sendKeys(CommonUtils.getExcelData(30, 3));
		Thread.sleep(1000);
	}

	public void enterdeductionamt2() throws InterruptedException, EncryptedDocumentException, IOException {
		deductionamt2.sendKeys(CommonUtils.getExcelData(31, 3));
		Thread.sleep(1000);
	}

	public void enterdeductionamt3() throws InterruptedException, EncryptedDocumentException, IOException {
		deductionamt3.sendKeys(CommonUtils.getExcelData(32, 3));
		Thread.sleep(1000);
	}

	public void enterdeductionamt4() throws InterruptedException, EncryptedDocumentException, IOException {
		deductionamt4.sendKeys(CommonUtils.getExcelData(33, 3));
		Thread.sleep(1000);
	}

	public void clickonsavebuttonforsavebill() throws InterruptedException, EncryptedDocumentException, IOException {
		billsave.click();
		Thread.sleep(1000);
	}

	public void clickonyesbuttonforbillsave() throws InterruptedException, EncryptedDocumentException, IOException {
		billsaveyes.click();
		Thread.sleep(1000);
	}

	public void clickonokbuttonforbillsave() throws InterruptedException, EncryptedDocumentException, IOException {
		BillDemandNumber = billid.getText();
		System.out.println("Unique UID ===" + BillDemandNumber);
		billsaveok.click();
		Thread.sleep(1000);
	}

	public void selectbilltypefromdropdownforbillapproval() throws InterruptedException {
		Select s = new Select(billtype);
		s.selectByVisibleText("Work");
		Thread.sleep(1000);
	}

	public void searchbillforapproval() throws InterruptedException, EncryptedDocumentException, IOException {
		billsearch.sendKeys(BillDemandNumber);
		Thread.sleep(1000);
	}

	public void clickonviewslipbuttontoviewbillmasslip()
			throws InterruptedException, EncryptedDocumentException, IOException {
		viewbillslip.click();
		Thread.sleep(1000);
	}

	public void clickonhardcopyreceiveyestoviewbillmasslip()
			throws InterruptedException, EncryptedDocumentException, IOException {
		hardcopyyes.click();
		CommonUtils.windowScrollDown(driver);

	}

//	public void clickonmasslip() throws InterruptedException, EncryptedDocumentException, IOException {
//		clickonmasslip.click();
//	    Actions act = new Actions(driver);
//        act.sendKeys(Keys.PAGE_DOWN).build().perform(); //Page Down
//        System.out.println("Scroll down perfomed");
//        Thread.sleep(5000);
//
//          JavascriptExecutor js = (JavascriptExecutor) driver;
//          js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//
//     
////        act.sendKeys(Keys.PAGE_UP).build().perform();   //Page Up
////        System.out.println("Scroll up perfomed");
////        Thread.sleep(1000);
//// 
	/// }
	public void clickonapprovetoapprovebill() throws InterruptedException, EncryptedDocumentException, IOException {
		approvebill.click();
	}

	public void clickonyestoapprovebill() throws InterruptedException, EncryptedDocumentException, IOException {
		yestoapprovebill.click();
	}

	public void Clickforbackbutton() throws InterruptedException {
		inboxbackbutton.click();
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

	public void enterUsernameforHOD() throws EncryptedDocumentException, IOException {
		username.sendKeys(CommonUtils.getExcelData(3, 2));
	}

	public void enterPasswordforHOD() throws EncryptedDocumentException, IOException {
		password.sendKeys(CommonUtils.getExcelData(3, 3));
	}

	public void clickOnLoginforHOD() {
		login.click();
	}

	public void movetoBillAcceptance() throws InterruptedException {
		Actions hover = new Actions(driver);
		hover.moveToElement(billacceptance).perform();
		Thread.sleep(1000);
	}

	public void clickOnBillInbox() throws InterruptedException {
		billinbox.click();
		Thread.sleep(1000);
	}

	public void enterUsernamefordycafo() throws EncryptedDocumentException, IOException {
		username.sendKeys(CommonUtils.getExcelData(4, 2));
	}

	public void enterPasswordfordycafo() throws EncryptedDocumentException, IOException {
		password.sendKeys(CommonUtils.getExcelData(4, 3));
	}

	public void clickOnLoginfordycafo() {
		login.click();
	}

	public void enterUsernameforcashier() throws EncryptedDocumentException, IOException {
		username.sendKeys(CommonUtils.getExcelData(6, 2));
	}

	public void enterPasswordforcashier() throws EncryptedDocumentException, IOException {
		password.sendKeys(CommonUtils.getExcelData(6, 3));
	}

	public void clickOnLoginforcashier() {
		login.click();
	}

	public void ClickforInvoicegeneration() {
		generateinvoice.click();
	}

	public void clickforokbutton() {
		okbuttonbilltype.click();
	}

	public void selectrokhvahigat() throws InterruptedException {
		grcashbook.click();
		Select select = new Select(grcashbook);
		select.selectByVisibleText("अभिकरण");
		Thread.sleep(1500);
	}

	public void selectrokhvahi() throws InterruptedException {
		cashbook.click();
		Select select = new Select(cashbook);
		select.selectByVisibleText("अभिकरण");
		Thread.sleep(1000);
	}

	public void selectdesignation() throws InterruptedException {
		designation.click();
		Select select = new Select(designation);
		select.selectByVisibleText("DYCAFO");
		Thread.sleep(1000);
	}

	public void searchbillforinvoicegeneration() throws InterruptedException, EncryptedDocumentException, IOException {
		billsearch.sendKeys(BillDemandNumber);
		Thread.sleep(1000);
	}

	public void clickforselectbills() {
		selectbillinvoice.click();
	}

	public void selectgenerateinvoicebutton() throws InterruptedException {
		invoicegenerate.click();
		Thread.sleep(1000);
	}

	public void clickOnyesforinvoicegenerate() throws InterruptedException {
		yesinvoice.click();
		Thread.sleep(1000);
	}

	public void clickokforinvoicegeneration() throws InterruptedException {
		String InvoiceNumber = invoiceid.getText();
		InvoiceNumber = InvoiceNumber.substring(12, 30);
		System.out.println("UniqueInvID === " + InvoiceNumber);
		Thread.sleep(1000);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		// set the text
		jsExecutor.executeScript("arguments[0].click();", okinvoice);
		Thread.sleep(1000);
	}

	public void clickonbackbutton() throws InterruptedException {
		backinvoice.click();
		Thread.sleep(1000);
	}

	public void clickonmastermenubutton() throws InterruptedException {
		mastermenu.click();
		Thread.sleep(1000);
	}

	public void clickonfinalpaymentapprovalmenubutton() throws InterruptedException {
		finalpayment.click();
		Thread.sleep(1000);
	}

	public void searchinvoiceforapproval() throws InterruptedException, EncryptedDocumentException, IOException {
		invoicesearch.sendKeys(InvoiceNumber);
		Thread.sleep(1500);
	}

	public void clickonfinalpaymentapprovalbutton() throws InterruptedException {
		releasepayment.click();
		Thread.sleep(1000);
	}

	public void clickonfinalpaymentapprovalyesbutton() throws InterruptedException {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		// set the text
		jsExecutor.executeScript("arguments[0].click();", yesforfinalpayment);
		Thread.sleep(1000);
	}

	public void clickonfinalpaymentapprovalokbutton() throws InterruptedException {
		okforfinalpayment.click();
		Thread.sleep(1000);
	}

}
