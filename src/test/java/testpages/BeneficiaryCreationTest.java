package testpages;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import pom.BeneficiaryCreation;

public class BeneficiaryCreationTest extends BaseClass {

	BeneficiaryCreation objBeneficiaryCreationpage;

	@BeforeClass
	public void openBrowser() throws IOException {
		initializeBrowser();
		objBeneficiaryCreationpage = new BeneficiaryCreation();

	}

	@Test(priority = 0)
	public void loginWithMaker() throws EncryptedDocumentException, IOException {

		objBeneficiaryCreationpage.enterUserName();
		objBeneficiaryCreationpage.enterPassword();
		objBeneficiaryCreationpage.clickOnLogin();

	}

	@Test(priority = 1)
	public void MasterMenuisClickable() throws EncryptedDocumentException, IOException {
		objBeneficiaryCreationpage.clickOnMasterMenu();
	}

	@Test(priority = 2)
	public void vendorcreationMenuisclickable() throws EncryptedDocumentException, IOException, InterruptedException {

		objBeneficiaryCreationpage.clickOnvendorcreationMenu();
	}

	@Test(priority = 3)
	public void checkTextFieldvalidations() throws EncryptedDocumentException, IOException, InterruptedException {
		Thread.sleep(3000);
		objBeneficiaryCreationpage.checkTextFieldvalidations();
	}

	@Test(priority = 4)
	public void PartyDetailscanenter() throws EncryptedDocumentException, IOException, InterruptedException {
		Thread.sleep(3000);
		objBeneficiaryCreationpage.enterPartyDetails();
	}

	@Test(priority = 5)
	public void checkTextFieldAcceptLessThan10Charercter()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.checkTextFieldAcceptLessThan10Charercter();

	}

	@Test(priority = 6)
	public void Textfieldacceptmobilenumber()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {

		objBeneficiaryCreationpage.entermobilenumberdetails();
	}

	@Test(priority = 7)
	public void checkemailTextFieldvalidations()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.checkemailTextFieldvalidations();
	}

	@Test(priority = 8)
	public void TextfieldacceptemailID()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.enterEMailID();
	}

	@Test(priority = 9)
	public void Addresscanbeenter() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.entervendoraddress();
	}

	@Test(priority = 10)
	public void pincodecanbeenter() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.entervendorpincode();
	}

	@Test(priority = 11)
	public void citycanbeenter() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.entervendorcity();
	}

	@Test(priority = 12)
	public void Textfieldacceptpannumber()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.entervendorpan();
	}

	@Test(priority = 13)
	public void Textfieldaccepttannumber()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.entervendortan();
	}

	@Test(priority = 14)
	public void Textfieldacceptgstnumber()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.entervendorgst();
	}

	@Test(priority = 15)
	public void Textfieldacceptadharnumber()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.entervendoradhar();
	}

	@Test(priority = 16)
	public void TextfieldacceptIFSCcode()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.vendorIFSC();
	}

	@Test(priority = 17)
	public void Textfieldacceptaccountnumber()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.entervendoracc();
	}

	@Test(priority = 18)
	public void Textfieldacceptaccountnumbertoconfirm()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.entervendoraccconfirm();
	}

	@Test(priority = 19)
	public void CanuploadPassbokcopyfile()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.uploadpassboookcopyfile();
	}

	@Test(priority = 20)
	public void Okbuttonisclickable()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.clickokafterfileupload();
	}

	@Test(priority = 21)
	public void viewpassbookcopy() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.clickonpassbookcopyafterfileupload();
	}

	@Test(priority = 22)
	public void Canuploadchequecopyfile()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.uploadchequecopyfile();
	}

	@Test(priority = 23)
	public void Okbuttonisclickableforcheque()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.clickokafterfileupload();
	}

	@Test(priority = 24)
	public void viewchequecopy() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.clickonchequecopyafterfileupload();
	}

	@Test(priority = 25)
	public void Canuploadpancopyfile()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.uploadpancopyfile();
	}

	@Test(priority = 26)
	public void Okbuttonisclickableforpan()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.clickokafterfileupload();
	}

	@Test(priority = 27)
	public void viewpancopy() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.clickonpancopyafterfileupload();
	}

	@Test(priority = 28)
	public void Canuploadtancopyfile()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.uploadtancopyfile();
	}

	@Test(priority = 29)
	public void Okbuttonisclickablefortan()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.clickokafterfileupload();
	}

	@Test(priority = 30)
	public void viewtancopy() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.clickontancopyafterfileupload();
	}

	@Test(priority = 31)
	public void Canuploadgstcopyfile()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.uploadgstcopyfile();
	}

	@Test(priority = 32)
	public void Okbuttonisclickableforgst()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.clickokafterfileupload();
	}

	@Test(priority = 33)
	public void viewgstcopy() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.clickongstcopyafterfileupload();
	}

	@Test(priority = 34)
	public void Canuploadadharcopyfile()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.uploadadharcopyfile();
	}

	@Test(priority = 35)
	public void Okbuttonisclickableforadhar()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.clickokafterfileupload();
	}

	@Test(priority = 36)
	public void viewadharcopy() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.clickonadharcopyafterfileupload();
	}

	@Test(priority = 37)
	public void clickonvendorsave() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.clickosaveforvendor();
	}

	@Test(priority = 38)
	public void clickonvendorsaveyes()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.clickosaveyesforvendor();
	}

	@Test(priority = 39)
	public void clickonvendorsaveok()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.clickosaveokforvendor();
	}

	@Test(priority = 40)
	public void clickonprintbutton()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.clickonprintbutton();
	}

	@Test(priority = 41)
	public void clickonbackbutton() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.clickonbackbutton();
	}

	@Test(priority = 42)
	public void LogoutbuttonisclickableforHOD() throws EncryptedDocumentException, IOException, InterruptedException {

		objBeneficiaryCreationpage.ClicktoLogout();
	}

	@Test(priority = 43)
	public void yesbuttonisclickableforlogoutasHOD()
			throws EncryptedDocumentException, IOException, InterruptedException {

		objBeneficiaryCreationpage.ClicktoYesforLogout();
	}

	@Test(priority = 44)
	public void loginWithHOD() throws EncryptedDocumentException, IOException {

		objBeneficiaryCreationpage.enterUsernameforHOD();
		objBeneficiaryCreationpage.enterPasswordforHOD();
		objBeneficiaryCreationpage.clickOnLoginforHOD();
	}

	@Test(priority = 45)
	public void ManagementmenuIsClickable() throws EncryptedDocumentException, IOException, InterruptedException {

		objBeneficiaryCreationpage.clickOnmanagementmenu();
	}

	@Test(priority = 46)
	public void BeneficiaryapprovaltmenuIsClickable()
			throws EncryptedDocumentException, IOException, InterruptedException {

		objBeneficiaryCreationpage.clickOnBeneficiaryapprovaltmenu();
	}

	@Test(priority = 47)
	public void Checkboxisclickable() throws EncryptedDocumentException, IOException, InterruptedException {

		objBeneficiaryCreationpage.Clickoncheckbox();
	}

	@Test(priority = 48)
	public void Approvebuttonisclickable() throws EncryptedDocumentException, IOException, InterruptedException {

		objBeneficiaryCreationpage.Clickonapprovebutton();
	}

	@Test(priority = 49)
	public void yesbuttonisclickable() throws EncryptedDocumentException, IOException, InterruptedException {

		objBeneficiaryCreationpage.Clickonyesbuttonforapproval();
	}

	@Test(priority = 50)
	public void okbuttonisclickable() throws EncryptedDocumentException, IOException, InterruptedException {

		objBeneficiaryCreationpage.Clickonokbuttonforapproval();
	}

	@Test(priority = 51)
	public void backButtonisClickable2()
			throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		objBeneficiaryCreationpage.clickonbackbutton();
	}

	@Test(priority = 52)
	public void logoutButtonisClickable1()
			throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		objBeneficiaryCreationpage.ClicktoLogout();
	}

	@Test(priority = 53)
	public void yesforlogoutButtonisClickable1()
			throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		objBeneficiaryCreationpage.ClicktoYesforLogout();
	}

	@AfterClass
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
