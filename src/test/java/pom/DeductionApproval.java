package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclasses.BaseClass;
import baseclasses.CommonUtils;

public class DeductionApproval extends BaseClass {

	@FindBy(xpath = "//input[@id='txtUser']")
	public WebElement username;

	@FindBy(xpath = "//input[@id='txtPass']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='btnLogin']")
	public WebElement login;

	@FindBy(xpath = "//a[normalize-space()='Master']")
	public WebElement Mastermenu;

	@FindBy(xpath = "//a[normalize-space()='Deduction Mapping Approval']")
	public WebElement deductionapprovalmenu;

	public DeductionApproval() {
		PageFactory.initElements(driver, this);
	}

	public void enterUserName() throws EncryptedDocumentException, IOException {
		username.sendKeys(CommonUtils.getExcelData(3, 2));
	}

	public void enterPassword() throws EncryptedDocumentException, IOException {
		password.sendKeys(CommonUtils.getExcelData(3, 3));
	}

	public void clickOnLogin() {
		login.click();
	}

	public void clickOnMasterMenu() {
		Mastermenu.click();
	}

	public void clickOndeductionapprovalmenu() {
		deductionapprovalmenu.click();
	}

}
