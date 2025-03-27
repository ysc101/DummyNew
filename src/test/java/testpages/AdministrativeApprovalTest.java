package testpages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import baseclasses.BaseClass;
import pom.AdministrativeApproval;




public class AdministrativeApprovalTest extends BaseClass {
	

	
	AdministrativeApproval AA;

	@BeforeClass
	public void openBrowser() throws IOException {
		initializeBrowser();
		AA = new AdministrativeApproval(driver);
	}

	@Test(priority = 0)
	public void loginWithMaker() throws EncryptedDocumentException, IOException {

		AA.enterUsername();
		AA.enterPassword();
		AA.clickOnLogin();

	}

	@Test(priority = 1)
	public void AdministrativeWorkIsClickable() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.clickOnAdministrativeWork();

	}

	@Test(priority = 2)
	public void AdministrativeDeatilsIsHovering() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.MovetoAADetails();

	}

	@Test(priority = 3)
	public void AdministrativeApprovalCreationIsClickable() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.clickOnAACreation();
	}
	
	@Test(priority = 4)
	public void rokhvahigatIsSelectable() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.selectrokhvahigat();
	}
	
	@Test(priority = 5)
	public void rokhvahiIsSelectable() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.selectrokhvahi();
	}
	
	@Test(priority = 6)
	public void Enterheadcode() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.enterheadcode();
	}

	@Test(priority = 7)
	public void HeadcodeisSelectable() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.selectheadcode();
	}
	@Test(priority = 8)
	public void AAYearisSelectable() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.selectaayear();
	}
	
	@Test(priority = 9)
	public void TalukaIsSelectable() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.selecttaluka();
	}
	
	@Test(priority = 10)
	public void VillageIsSelectable() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.entervillage();
	}
	@Test(priority = 11)
	public void CanEnterConstiuency() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.enterconstiuency();
	}
	@Test(priority = 12)
	public void canEnterpramanumber() throws EncryptedDocumentException, IOException, InterruptedException {
           AA.enterpramanumber();
	}
	@Test(priority = 13)
	public void PrmaDatefieldIsSelectable() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.pramadate();
	}
	@Test(priority = 14)
	public void PrmaDateIsSelectable() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.pramadateselect();
	}
	@Test(priority = 15)
	public void canEnterpramaamount() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.pramaamount();
	}
	
	@Test(priority = 16)
	public void fileuploadispossible() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.fileupload();
	}
	@Test(priority = 17)
	public void fileuploadbuttonisclicakble() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.fileuploadbutton();
	}
	@Test(priority = 18)
	public void aasavebuttonisclickable() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.aasavebutton();
	}
	@Test(priority = 19)
	public void aayesbuttonisclickable() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.aayesbutton();
	}
	@Test(priority = 20)
	public void aaokbuttonisclickable() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.aaokbutton();
	}
		
		@Test(priority = 21)
	public void Backbuttonisclickable() throws EncryptedDocumentException, IOException, InterruptedException {

			AA.Clickonbackbutton();
		}
	@Test(priority = 22)
	public void AdministrativeWorkIsClickable1() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.clickOnAdministrativeWork();
	}
	@Test(priority = 23)
	public void MovetoAADetails() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.MovetoAADetails();
	}
	@Test(priority = 24)
	public void ClickonAAoutbox() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.clickOnAAoutbox();
	}
	@Test(priority = 25)
	public void StatusIsSelectable() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.StatusSelect();
	}
	@Test(priority = 26)
	public void SearchTextboxacceptcharacters  () throws EncryptedDocumentException, IOException, InterruptedException {

		AA.SearhPramaNumber();
	}
	@Test(priority = 27)
	public void aaslipdisplay  () throws EncryptedDocumentException, IOException, InterruptedException {

		AA.clickonaaslip();
	}
	@Test(priority = 28)
	public void Backbuttonisclickable1  () throws EncryptedDocumentException, IOException, InterruptedException {

		AA.Clickonbackbutton();
	}
	@Test(priority = 29)
	public void AAOutboxBackButtonisclickable  () throws EncryptedDocumentException, IOException, InterruptedException {

		AA.ClickonAAOutboxBackButton();
	}
	@Test(priority = 30)
	public void Logoutbuttonisclickable  () throws EncryptedDocumentException, IOException, InterruptedException {

		AA.ClicktoLogout();
	}
	@Test(priority = 31)
	public void yesbuttonisclickableforlogout  () throws EncryptedDocumentException, IOException, InterruptedException {

		AA.ClicktoYesforLogout();
	}
	@Test(priority = 32)
	public void loginWithHOD() throws EncryptedDocumentException, IOException {

		AA.enterUsernameforHOD();
		AA.enterPasswordforHOD();
		AA.clickOnLoginforHOD();

	}
	@Test(priority = 33)
	public void AdministrativeWorkIsClickable2() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.clickOnAdministrativeWork();
	}
	@Test(priority = 34)
	public void MovetoAdministrativeApprovalDetails() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.MovetoAADetails();
	}
	@Test(priority = 35)
	public void AAInboxIsclickable() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.clickOnAAInbox();
	}
	@Test(priority = 36)
	public void SearchPramaforHODApproval () throws EncryptedDocumentException, IOException, InterruptedException {

		AA.SearhPramaNumber();
	}
	@Test(priority = 37)
	public void ViewAASlipforApproval () throws EncryptedDocumentException, IOException, InterruptedException {

		AA.clickonaaslip();
	}
	@Test(priority = 38)
	public void ApproveButtonisclickable () throws EncryptedDocumentException, IOException, InterruptedException {

		AA.clickforAAApproval();
	}
	@Test(priority = 39)
	public void yesbuttonisclickableforaaapproval() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.aayesbutton();
	}
	@Test(priority = 40)
	public void BackbuttonisclickableforaainboxHOD  () throws EncryptedDocumentException, IOException, InterruptedException {

		AA.clickforBackafterAAApproval();
	}
	@Test(priority = 41)
	public void LogoutbuttonisclickableforHOD  () throws EncryptedDocumentException, IOException, InterruptedException {

		AA.ClicktoLogout();
	}
	@Test(priority = 42)
	public void yesbuttonisclickableforlogoutasHOD  () throws EncryptedDocumentException, IOException, InterruptedException {

		AA.ClicktoYesforLogout();
	}
	@Test(priority = 43)
	public void loginWithDYCAFO() throws EncryptedDocumentException, IOException {

		AA.enterUsernameforDYCAFO();
		AA.enterPasswordforDYCAFO();
		AA.clickOnLoginforDYCAFO();

	}
	@Test(priority = 44)
	public void AdministrativeWorkIsClickable3() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.clickOnAdministrativeWork();
	}
	@Test(priority = 45)
	public void MovetoAdministrativeApprovalDetailsDYCAFO() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.MovetoAADetails();
	}
	@Test(priority = 46)
	public void AAInboxIsclickableforDYCAFO() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.clickOnAAInbox();
	}
	@Test(priority = 47)
	public void SearchPramaforDYCAFOApproval () throws EncryptedDocumentException, IOException, InterruptedException {

		AA.SearhPramaNumber();
	}
	@Test(priority = 48)
	public void ViewAASlipforDYCAFOApproval () throws EncryptedDocumentException, IOException, InterruptedException {

		AA.clickonaaslip();
	}
	@Test(priority = 49)
	public void ApproveButtonisclickableDYCAFO () throws EncryptedDocumentException, IOException, InterruptedException {

		AA.clickforAAApproval();
	}
	@Test(priority = 50)
	public void yesbuttonisclickableforaaapprovalDYCAFO() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.aayesbutton();
	}
	@Test(priority = 51)
	public void BackbuttonisclickableforaainboxDYCAFO  () throws EncryptedDocumentException, IOException, InterruptedException {

		AA.clickforBackafterAAApproval();
	}
	@Test(priority = 52)
	public void LogoutbuttonisclickableforDYCAFO () throws EncryptedDocumentException, IOException, InterruptedException {

		AA.ClicktoLogout();
	}
	@Test(priority = 53)
	public void yesbuttonisclickableforlogoutasDYCAFO  () throws EncryptedDocumentException, IOException, InterruptedException {

		AA.ClicktoYesforLogout();
	}
	@Test(priority = 54)
	public void loginWithCAFO() throws EncryptedDocumentException, IOException {

		AA.enterUsernameforCAFO();
		AA.enterPasswordforCAFO();
		AA.clickOnLoginforCAFO();

	}
	@Test(priority = 55)
	public void AdministrativeWorkIsClickable4() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.clickOnAdministrativeWork();
	}
	@Test(priority = 56)
	public void MovetoAdministrativeApprovalDetailsCAFO() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.MovetoAADetails();
	}
	@Test(priority = 57)
	public void AAInboxIsclickableforCAFO() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.clickOnAAInbox();
	}
	@Test(priority = 58)
	public void SearchPramaforCAFOApproval () throws EncryptedDocumentException, IOException, InterruptedException {

		AA.SearhPramaNumber();
	}
	@Test(priority = 59)
	public void ViewAASlipforCAFOApproval () throws EncryptedDocumentException, IOException, InterruptedException {

		AA.clickonaaslip();
	}
	@Test(priority = 60)
	public void ApproveButtonisclickableCAFO () throws EncryptedDocumentException, IOException, InterruptedException {

		AA.clickforAAApproval();
	}
	@Test(priority = 61)
	public void yesbuttonisclickableforaaapprovalCAFO() throws EncryptedDocumentException, IOException, InterruptedException {

		AA.aayesbutton();
	}
	@Test(priority = 62)
	public void BackbuttonisclickableforaainboxCAFO  () throws EncryptedDocumentException, IOException, InterruptedException {

		AA.clickforBackafterAAApproval();
	}
	@Test(priority = 63)
	public void LogoutbuttonisclickableforCAFO () throws EncryptedDocumentException, IOException, InterruptedException {

		AA.ClicktoLogout();
	}
	@Test(priority = 64)
	public void yesbuttonisclickableforlogoutasCAFO  () throws EncryptedDocumentException, IOException, InterruptedException {

		AA.ClicktoYesforLogout();
	}
	@AfterClass
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
