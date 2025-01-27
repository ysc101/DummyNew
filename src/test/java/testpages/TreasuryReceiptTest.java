package testpages;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import pom.TreasuryReceipt;

public class TreasuryReceiptTest extends BaseClass{
	
	
	TreasuryReceipt TR;

	@BeforeClass
	public void openBrowser() throws IOException {
		initializeBrowser();
		TR = new TreasuryReceipt(driver);
	}

	@Test(priority = 0)
	public void loginWithCashier() throws EncryptedDocumentException, IOException {

		TR.enterUsername();
		TR.enterPassword();
		TR.clickOnLogin();

	}

	@Test(priority = 1)
	public void FinancialWorkIsClickable() throws EncryptedDocumentException, IOException, InterruptedException {

		TR.clickOnFinancialWork();

	}
	@Test(priority = 2)
	public void namuna13Entryisclicakbale() throws EncryptedDocumentException, IOException, InterruptedException {

		TR.clickOnNamuna13ENtryform();

	}
	@Test(priority = 3)
	public void FYYearisselectable() throws EncryptedDocumentException, IOException, InterruptedException {

		TR.SelectFYyear();

	}
	@Test(priority = 4)
	public void entrytypeselectable() throws EncryptedDocumentException, IOException, InterruptedException {

		TR.Selectentrytype();

	}
	@Test(priority = 5)
	public void groupcashbookisselectable() throws EncryptedDocumentException, IOException, InterruptedException {

		TR.selectgrcashbook();

	}
	@Test(priority = 6)
	public void cashbookisselectable() throws EncryptedDocumentException, IOException, InterruptedException {

		TR.selectcashbook();

	}
	@Test(priority = 7)
	public void chllandatecanenter() throws EncryptedDocumentException, IOException, InterruptedException {

		TR.enterchallandate();

	}
	@Test(priority = 8)
	public void chllannumbercanenter() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		TR.enterchallannumber();

	}
	
	@Test(priority = 9)
	public void RTGSDDnumbercanenter() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		TR.enterRTGSDDnumber();

	}
	@Test(priority = 10)
	public void DepartmentcanSelect() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		TR.selectDepartment();

	}
	@Test(priority = 11)
	public void HeadcodecanSelect() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		TR.Clickforheadcodeselection();

	}
	@Test(priority = 12)
	public void HeadcodecanSelectbyscrolling() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		TR.scrollatheadcodeselection();

	}
	@Test(priority = 13)
	public void HeadcodecanSelectbyselect() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		TR.Clickforheadcodeselectionforselect();

	}
	@Test(priority = 14)
	public void Reeiptamountcanenter() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		TR.enterreceiptamount();

	}
	@Test(priority = 15)
	public void canselectapprovedby() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		TR.selectapprovedby();

	}
	@Test(priority = 16)
	public void enterdetailsforReceipt() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		TR.enterdetails();

	}
	@Test(priority = 17)
	public void SaveButtonisClickable() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		TR.Clickforsavebutton();

	}
	@Test(priority = 18)
	public void YesButtonisClickable() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		TR.Clickforyesbutton();

	}
	@Test(priority = 19)
	public void OKButtonisClickable() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		TR.Clickforokbutton();

	}
	@Test(priority = 20)
	public void backButtonisClickable() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		TR.Clickforbackbutton();

	}
	@Test(priority = 21)
	public void logoutButtonisClickable() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		TR.Clickforlogoutbutton();

	}
	@Test(priority = 22)
	public void yesforlogoutButtonisClickable() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		TR.Clickforlogoutyesbutton();

	}
	@Test(priority = 23)
	public void loginWithDycafo() throws EncryptedDocumentException, IOException {

		TR.enterUsernameforDycafo();
		TR.enterPasswordforDycafo();
		TR.clickOnLoginforDycafo();

	}
	@Test(priority = 24)
	public void mastermenutabisClickable() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		TR.Mastertabclick();

	}
	@Test(priority = 25)
	public void treasuryapprovalsubmenuisClickable() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		TR.Clickfortreasuryapproval();

	}
	@Test(priority = 26)
	public void Checkboxisclickable() throws EncryptedDocumentException, IOException, InterruptedException {

		TR.Clickoncheckbox();
	}
		@Test(priority = 27)
		public void Approvebuttonisclickable() throws EncryptedDocumentException, IOException, InterruptedException {

			TR.Clickonapprovebutton();
		}
		@Test(priority = 28)
		public void yesbuttonisclickable() throws EncryptedDocumentException, IOException, InterruptedException {

			TR.Clickonyesbuttonforapproval();
	
         }
		@Test(priority = 29)
		public void okbuttonisclickable() throws EncryptedDocumentException, IOException, InterruptedException {

			TR.Clickonokbuttonforapproval();
	
         }
		@Test(priority = 30)
		public void backButtonisClickable1() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

			TR.Clickforbackbutton();

		}
		@Test(priority = 31)
		public void logoutButtonisClickable1() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

			TR.Clickforlogoutbutton();

		}
		@Test(priority = 32)
		public void yesforlogoutButtonisClickable1() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

			TR.Clickforlogoutyesbutton();
		}
		@AfterClass
		public void CloseBrowser() throws InterruptedException {
			Thread.sleep(2000);
			driver.quit();
		}
}
