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

import baseclasses.BaseClass;
import baseclasses.CommonUtils;

public class AdministrativeApproval extends BaseClass {

	String AAUniqueID = "";
	String generateNum = generateAccountNumber(mapAANumber);
	String prmanumber = "";

	@FindBy(xpath = "//input[@id='txtUser']")
	public WebElement username;

	@FindBy(xpath = "//input[@id='txtPass']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='btnLogin']")
	public WebElement login;

	@FindBy(xpath = "//a[normalize-space()='Administrative Work']")
	public WebElement AdministrativeWork;

	@FindBy(xpath = "//a[normalize-space()='Administrative Approval Details']")
	public WebElement AADetails;

	@FindBy(xpath = "//a[normalize-space()='Administrative Approval Creation']")
	public WebElement AACreation;

	@FindBy(xpath = "//select[@id='body_ddlGroupCashbook']")
	public WebElement rokhvahigat;

	@FindBy(xpath = "//select[@id='body_ddlCashBook']")
	public WebElement rokhvahi;

	@FindBy(xpath = "//input[@id='body_txtHeadtype']")
	public WebElement enterheadcode;

	@FindBy(xpath = "//a[@id='body_grdHeadType_btnHeadCode_0']")
	public WebElement selectheacode;

	@FindBy(xpath = "//select[@id='body_ddlfinancialYear']")
	public WebElement selectaayear;

	@FindBy(xpath = "//select[@id='body_ddlBlock']")
	public WebElement selecttaluka;

	@FindBy(xpath = "//textarea[@id='body_txtCity']")
	public WebElement entervillage;

	@FindBy(xpath = "//input[@id='body_txtNameOfConstituency']")
	public WebElement enterconstiuency;

	@FindBy(xpath = "//input[@id='body_txtAdminApproNo']")
	public WebElement pramanumber;

	@FindBy(xpath = "//input[@id='body_txtPrashaskiyeDate']")
	public WebElement pramadate;

	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[4]/a")
	public WebElement pramadateselect;

	@FindBy(xpath = "//input[@id='body_txtPramaTotal']")
	public WebElement pramaamount;

	@FindBy(xpath = "//input[@id='FileUpload']")
	public WebElement fileupload;

	@FindBy(xpath = "//input[@id='body_btnHide']")
	public WebElement fileuploadbutton;

	@FindBy(xpath = "//input[@id='body_btnSave']")
	public WebElement aasavebutton;

	@FindBy(xpath = "//input[@id='body_btnYes']")
	public WebElement aayesbutton;

	@FindBy(xpath = "//span[@id='body_lblAdminapprovalUnicID']")
	public WebElement aaid;

	@FindBy(xpath = "//input[@id='body_btnRedirect']")
	public WebElement aaokbutton;

	@FindBy(xpath = "//input[@id='body_btnBack']")
	public WebElement aabackbutton;

	@FindBy(xpath = "//a[normalize-space()='Administrative Approval Outbox']")
	public WebElement aaoutbox;

	@FindBy(xpath = "//input[@type='search']")
	public WebElement aasearch;

	@FindBy(xpath = "//select[@id='body_ddlStatus']")
	public WebElement selectstatus;

	@FindBy(xpath = "//div[@class='btnDatatable']")
	public WebElement viewaaslip;

	@FindBy(id = "body_Button1")
	public WebElement aaoutboxbackbutton;

	@FindBy(xpath = "//input[@id='btnLogout']")
	public WebElement logout;

	@FindBy(xpath = "//input[@id='btnYesLogout']")
	public WebElement yeslogout;

	@FindBy(xpath = "//a[normalize-space()='Administrative Approval (Inwards)']")
	public WebElement aainbox;

	@FindBy(xpath = "//input[@id='body_btnApprove']")
	public WebElement Approve;

	@FindBy(id = "//input[@id='body_Button1']")
	public WebElement backbuttonaainbox;

	public AdministrativeApproval(WebDriver driver) {
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

	public void MovetoAADetails() throws InterruptedException {
		Actions hover = new Actions(driver);
		hover.moveToElement(AADetails).perform();
		Thread.sleep(1000);
	}

	public void clickOnAACreation() throws InterruptedException {
		AACreation.click();
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

	public void selectaayear() throws InterruptedException, EncryptedDocumentException, IOException {
		selectaayear.click();
		Select select = new Select(selectaayear);
		select.selectByVisibleText("2023-24");
		Thread.sleep(1000);
	}

	public void selecttaluka() throws InterruptedException, EncryptedDocumentException, IOException {
		selecttaluka.click();
		Select select = new Select(selecttaluka);
		select.selectByVisibleText("खटाव");
		Thread.sleep(1000);

	}

	public void entervillage() throws InterruptedException, EncryptedDocumentException, IOException {
		entervillage.sendKeys(CommonUtils.getExcelData(15, 3));
		Thread.sleep(1000);

	}

	public void enterconstiuency() throws InterruptedException, EncryptedDocumentException, IOException {
		enterconstiuency.sendKeys(CommonUtils.getExcelData(16, 3));
		Thread.sleep(1000);

	}

	public void enterpramanumber() throws InterruptedException, EncryptedDocumentException, IOException {
//		pramanumber.sendKeys(CommonUtils.getExcelData(17, 3));
		// String aaNumber =mapAANumber.get("PrmaNumber");
		pramanumber.sendKeys(CommonUtils.generatePramaNumber(mapAANumber));
	}

	public void pramadate() throws InterruptedException, EncryptedDocumentException, IOException {
		pramadate.click();
		Thread.sleep(1000);

	}

	public void pramadateselect() throws InterruptedException, EncryptedDocumentException, IOException {
		pramadateselect.click();
		Thread.sleep(1000);

	}

	public void pramaamount() throws InterruptedException, EncryptedDocumentException, IOException {
		pramaamount.sendKeys(CommonUtils.getExcelData(19, 3));
		Thread.sleep(1000);

	}

	public void fileupload() throws InterruptedException, EncryptedDocumentException, IOException {
		fileupload.sendKeys(CommonUtils.getExcelData(20, 3));
		Thread.sleep(1000);

	}

	public void fileuploadbutton() throws InterruptedException, EncryptedDocumentException, IOException {
		fileuploadbutton.click();
		Thread.sleep(1000);

	}

	public void aasavebutton() throws InterruptedException, EncryptedDocumentException, IOException {
		aasavebutton.click();
		Thread.sleep(1000);

	}

	public void aayesbutton() throws InterruptedException, EncryptedDocumentException, IOException {
		aayesbutton.click();
		Thread.sleep(1000);

	}

	public void aaokbutton() throws InterruptedException, EncryptedDocumentException, IOException {
		AAUniqueID = aaid.getText();
		System.out.println("Unique ID ===" + AAUniqueID);
		aaokbutton.click();
		Thread.sleep(1000);
	}

	public void Clickonbackbutton() throws InterruptedException, EncryptedDocumentException, IOException {
		aabackbutton.click();
		Thread.sleep(1000);
	}

	public void clickOnAAoutbox() throws InterruptedException {
		aaoutbox.click();
		Thread.sleep(1000);
	}

	public void SearhPramaNumber() throws InterruptedException {
		aasearch.sendKeys(AAUniqueID);
		Thread.sleep(1000);
	}

	public void StatusSelect() throws InterruptedException, EncryptedDocumentException, IOException {
		selectstatus.click();
		Select select = new Select(selectstatus);
		select.selectByVisibleText("Pending");
		Thread.sleep(1000);
	}

	public void clickonaaslip() throws InterruptedException {
		viewaaslip.click();
		Thread.sleep(1000);
	}

	public void ClickonAAOutboxBackButton() throws InterruptedException {
		aaoutboxbackbutton.click();
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

	public void clickOnAAInbox() throws InterruptedException {
		aainbox.click();
		Thread.sleep(1000);
	}

	public void clickforAAApproval() throws InterruptedException {
		Approve.click();
		Thread.sleep(1000);
	}

	public void clickforBackafterAAApproval() throws InterruptedException {
		backbuttonaainbox.click();
		Thread.sleep(1000);
	}

	public void enterUsernameforDYCAFO() throws EncryptedDocumentException, IOException {
		username.sendKeys(CommonUtils.getExcelData(4, 2));
	}

	public void enterPasswordforDYCAFO() throws EncryptedDocumentException, IOException {
		password.sendKeys(CommonUtils.getExcelData(4, 3));
	}

	public void clickOnLoginforDYCAFO() {
		login.click();

	}

	public void clickOnAAInboxDYCAFO() throws InterruptedException {
		aainbox.click();
		Thread.sleep(1000);
	}

	public void clickforAAApprovalDYCAFO() throws InterruptedException {
		Approve.click();
		Thread.sleep(1000);
	}

	public void clickforBackafterAAApprovalDYCAFO() throws InterruptedException {
		backbuttonaainbox.click();
		Thread.sleep(1000);
	}

	public void enterUsernameforCAFO() throws EncryptedDocumentException, IOException {
		username.sendKeys(CommonUtils.getExcelData(5, 2));
	}

	public void enterPasswordforCAFO() throws EncryptedDocumentException, IOException {
		password.sendKeys(CommonUtils.getExcelData(5, 3));
	}

	public void clickOnLoginforCAFO() {
		login.click();

	}

	public void clickOnAAInboxCAFO() throws InterruptedException {
		aainbox.click();
		Thread.sleep(1000);
	}

	public void clickforAAApprovalCAFO() throws InterruptedException {
		Approve.click();
		Thread.sleep(1000);
	}

	public void clickforBackafterAAApprovalCAFO() throws InterruptedException {
		backbuttonaainbox.click();
		Thread.sleep(1000);
	}

}
