	package testpages;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import baseclasses.BaseClass;
import pom.WorkDetails;

public class WorkDetailsTest extends BaseClass {

	WorkDetails WD;

	@BeforeClass
	public void openBrowser() throws IOException {
		initializeBrowser();
		WD = new WorkDetails(driver);
	}

	@Test(priority = 0)
	public void loginWithMaker() throws EncryptedDocumentException, IOException {

		WD.enterUsername();
		WD.enterPassword();
		WD.clickOnLogin();

	}

	@Test(priority = 1)
	public void AdministrativeWorkIsClickable() throws EncryptedDocumentException, IOException, InterruptedException {

		WD.clickOnAdministrativeWork();

	}

	@Test(priority = 2)
	public void WorkDetailsIsHovering() throws EncryptedDocumentException, IOException, InterruptedException {

		WD.MovetoWorkDetails();

	}
	@Test(priority = 3)
	public void WorkDetailCreationIsClickable() throws EncryptedDocumentException, IOException, InterruptedException {

		WD.clickOnWorkDetails();
	
	}
	@Test(priority = 4)
	public void rokhvahigatIsSelectable() throws EncryptedDocumentException, IOException, InterruptedException {

		WD.selectrokhvahigat();
	}
	
	@Test(priority = 5)
	public void rokhvahiIsSelectable() throws EncryptedDocumentException, IOException, InterruptedException {

		WD.selectrokhvahi();
	}
	
	@Test(priority = 6)
	public void Enterheadcode() throws EncryptedDocumentException, IOException, InterruptedException {

		WD.enterheadcode();
	}

	@Test(priority = 7)
	public void HeadcodeisSelectable() throws EncryptedDocumentException, IOException, InterruptedException {

		WD.selectheadcode();
	}
	@Test(priority = 8)
	public void AdminApprovalNumbercanSelect() throws EncryptedDocumentException, IOException, InterruptedException {

		WD.clickonAdminApprovalNumber();
	}
	@Test(priority = 9)
	public void PANNumbercanenter() throws EncryptedDocumentException, IOException, InterruptedException {

		WD.enterdocumentdetails();
	}
	
	@Test(priority = 10)
	public void Worknametextboxshouldbeeditable() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		WD.EnterWorkName();
	}
	@Test(priority = 11)
	public void Worknumbercanenter() throws EncryptedDocumentException, IOException, InterruptedException {

		WD.EnterWorkNumber();
	}
	@Test(priority = 12)
	public void Workdateshouldbeeditable() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		WD.workdate();
	}
	@Test(priority = 13)
	public void Workdateshouldbeselectable() throws EncryptedDocumentException, IOException, InterruptedException {

		WD.workdateselect();
	}
	@Test(priority = 14)
	public void Workenddateshouldbeeditable() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		WD.workenddate();
	}
	@Test(priority = 15)
	public void Workenddateshouldbeselectable() throws EncryptedDocumentException, IOException, InterruptedException {

		WD.workenddateselect();
	}
	@Test(priority = 16)
	public void canEnterworktenderamount() throws EncryptedDocumentException, IOException, InterruptedException {

		WD.worktenderamount();
	}
	@Test(priority = 17)
	public void canEnterpramaamount() throws EncryptedDocumentException, IOException, InterruptedException {

		WD.workpaidamount();
	}
	@Test(priority = 18)
	public void fileuploadispossible() throws EncryptedDocumentException, IOException, InterruptedException {

		WD.fileupload();
	}
	@Test(priority = 19)
	public void fileuploadbuttonisclicakble() throws EncryptedDocumentException, IOException, InterruptedException {

		WD.fileuploadbutton();
	}
	@Test(priority = 20)
	public void Beneficiaryshouldbeclickable() throws EncryptedDocumentException, IOException, InterruptedException {

		WD.Clickonbeneficiary();
	}
	@Test(priority = 21)
	public void worksavebuttonisclickable() throws EncryptedDocumentException, IOException, InterruptedException {

		WD.Worksavebutton();
	}
	@Test(priority = 22)
	public void workyesbuttonisclickable() throws EncryptedDocumentException, IOException, InterruptedException {

		WD.Workyesbutton();
	}
	@Test(priority = 23)
	public void workokbuttonisclickable() throws EncryptedDocumentException, IOException, InterruptedException {

		WD.workokbutton();
	}
	@Test(priority = 24)
	public void Backbuttonisclickable() throws EncryptedDocumentException, IOException, InterruptedException {

			WD.Clickonbackbutton();
		}
	@Test(priority = 25)
	public void AdministrativeWorkIsClickable1() throws EncryptedDocumentException, IOException, InterruptedException {

		WD.clickOnAdministrativeWork();

	}

	@Test(priority = 26)
	public void WorkDetailsIsHovering1() throws EncryptedDocumentException, IOException, InterruptedException {

		WD.MovetoWorkDetails();
	}
	@Test(priority = 27)
	public void MakerWorkOutboxIsClickable() throws EncryptedDocumentException, IOException, InterruptedException {

		WD.ClickonMakerWorkOutbox();
	
	}
	@Test(priority = 28)
	public void workstatusdropdownIsClickable() throws EncryptedDocumentException, IOException, InterruptedException {

		WD.Clickonworkstatus();
	
	}
	@Test(priority = 29)
	public void Workissearchable() throws EncryptedDocumentException, IOException, InterruptedException {

		WD.SearchWorkUID();
	
	}
	@Test(priority = 30)
	public void workslipisdisplay  () throws EncryptedDocumentException, IOException, InterruptedException {

		WD.clickonworkslip();
	}
	@Test(priority = 31)
	public void Backbuttonisclickable1  () throws EncryptedDocumentException, IOException, InterruptedException {

		WD.Clickonbackbutton();
	}
	@Test(priority = 32)
	public void Backbuttonisclickable2  () throws EncryptedDocumentException, IOException, InterruptedException {

		WD.ClickonbackbuttonforOutbox();
	}
	@Test(priority = 33)
	public void Logoutbuttonisclickable  () throws EncryptedDocumentException, IOException, InterruptedException {

		WD.ClicktoLogout();
	}
	@Test(priority = 34)
	public void yesbuttonisclickableforlogout  () throws EncryptedDocumentException, IOException, InterruptedException {

		WD.ClicktoYesforLogout();
	}
	@Test(priority = 35)
	public void loginWithHOD() throws EncryptedDocumentException, IOException {

		WD.enterUsernameforHOD();
		WD.enterPasswordforHOD();
		WD.clickOnLoginforHOD();

	}
	@Test(priority = 36)
	public void AdministrativeWorkIsClickable2() throws EncryptedDocumentException, IOException, InterruptedException {

		WD.clickOnAdministrativeWork();
	}
	@Test(priority = 37)
	public void WorkDetailsIsHovering2() throws EncryptedDocumentException, IOException, InterruptedException {

		WD.MovetoWorkDetails();
	}
	@Test(priority = 38)
	public void WorkInboxIsclickable() throws EncryptedDocumentException, IOException, InterruptedException {

		WD.clickOnworkInbox();
	}
	@Test(priority = 39)
	public void SearchWorkforHODApproval () throws EncryptedDocumentException, IOException, InterruptedException {

		WD.SearchWorkUID();
	}
	@Test(priority = 40)
	public void ViewWorkSlipforApproval () throws EncryptedDocumentException, IOException, InterruptedException {

		WD.clickonworkslip();
	}
	@Test(priority = 41)
	public void ApproveButtonisclickable () throws EncryptedDocumentException, IOException, InterruptedException {

		WD.clickforAAApproval();
	}
	@Test(priority = 42)
	public void yesbuttonisclickableforworkapproval() throws EncryptedDocumentException, IOException, InterruptedException {

		WD.Workyesbutton();
	}
	@Test(priority = 43)
	public void BackbuttonisclickableforworkinboxHOD  () throws EncryptedDocumentException, IOException, InterruptedException {

		WD.clickforBackafterworkApproval();
	}
	@Test(priority = 44)
	public void LogoutbuttonisclickableforHOD () throws EncryptedDocumentException, IOException, InterruptedException {

		WD.ClicktoLogout();
	}
	@Test(priority = 45)
	public void yesbuttonisclickableforlogoutasHOD  () throws EncryptedDocumentException, IOException, InterruptedException {

		WD.ClicktoYesforLogout();
	}
	@AfterClass
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	

}
