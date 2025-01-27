package testpages;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import pom.BillEntryGeneral;

public class BillEntryGeneralTest extends BaseClass {
	
	
	BillEntryGeneral<?> BE;

	@BeforeClass
	public void openBrowser() throws IOException {
		initializeBrowser();
		BE = new BillEntryGeneral<Object>(driver);
	}
	@Test(priority = 0)
	public void loginWithMaker() throws EncryptedDocumentException, IOException {
		BE.enterUsername();
		BE.enterPassword();
		BE.clickOnLogin();
	}
	@Test(priority = 1)
	public void FinancialWorkIsClickable() throws EncryptedDocumentException, IOException, InterruptedException {

		BE.clickOnFinancialWork();
	}
	@Test(priority = 2)
	public void CanMovetobillcrearion() throws EncryptedDocumentException, IOException, InterruptedException {

		BE.movetoBillCreation();
	}
	@Test(priority = 3)
	public void generaalbillIsClickable() throws EncryptedDocumentException, IOException, InterruptedException {

		BE.clickOnGeneralBillCreation();
	}
	@Test(priority = 4)
	public void Billtypeisselectable() throws EncryptedDocumentException, IOException, InterruptedException {

		BE.selectbilltypefromdropdown();
	}
	@Test(priority = 5)
	public void Groupcashbookisselectable() throws EncryptedDocumentException, IOException, InterruptedException {

		BE.selectgroupcashbookfromdropdown();
	}
	@Test(priority = 6)
	public void cashbookisselectable() throws EncryptedDocumentException, IOException, InterruptedException {

		BE.selectcashbookfromdropdown();
	}
	@Test(priority = 7)
	public void CanenterHeadcode() throws EncryptedDocumentException, IOException, InterruptedException {

		BE.enterheadcodeforselection();
	}
	@Test(priority = 8)
	public void Headcodeisselectable() throws EncryptedDocumentException, IOException, InterruptedException {

		BE.selectheadcodeforbillentry();
	}
	@Test(priority = 9)
	public void beneficiaryselectionbutonisclickable() throws EncryptedDocumentException, IOException, InterruptedException {

		BE.clickforbeneficary();
	}
	@Test(priority = 10)
	public void searchbydropdownisclickable() throws EncryptedDocumentException, IOException, InterruptedException {

		BE.selectsearchbydocument();
	}
	@Test(priority = 11)
	public void canenterdocumentsdetail() throws EncryptedDocumentException, IOException, InterruptedException {

		BE.enterdocumentsdetails();
	}
	@Test(priority = 12)
	public void searchbuttonisclickale() throws EncryptedDocumentException, IOException, InterruptedException {

		BE.clickonsearchforbeneficary();
	}
	@Test(priority = 13)
	public void clickonbuttonforselectionofbeneficary() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.clickonbuttonforselectionofbeneficary();
	}
	@Test(priority = 14)
	public void clickonbuttonforselectionofprmaandwork() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.clickforpramaandwork();
	}
	@Test(priority = 15)
	public void newpramaisselectable() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.selectnewprama();
	}
	@Test(priority = 16)
	public void clickonbuttonforsearchofwork() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.clickonsearchbutton();
	}
	@Test(priority = 17)
	public void clickonbuttonforselectionofbeneficary1() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.clickonbuttonforselectionofbeneficary();
	}
	@Test(priority = 18)
	public void CanenterBillamount() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.enterbillamount();
	}
	@Test(priority = 19)
	public void Canenterpaymenttypeamount() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.enterpaymenttypeamount();
	}
	@Test(priority = 20)
	public void Canenterremark() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.enterremark();
	}
	@Test(priority = 21)
	public void Canuploadcopy() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.uploadbillcopy();
	}
	@Test(priority = 22)
	public void uploadfileOKButtonclickable() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.clickonokbuttonforuploadcopy();
	}
	@Test(priority = 23)
	public void canenterdeductionamt1() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.enterdeductionamt1();
	}
	@Test(priority = 24)
	public void canenterdeductionamt2() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.enterdeductionamt2();
	}
	@Test(priority = 25)
	public void canenterdeductionamt3() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.enterdeductionamt3();
	}
	@Test(priority = 26)
	public void canenterdeductionamt4() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.enterdeductionamt4();
	}
	@Test(priority = 27)
	public void BillsaveButtonclickable() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.clickonsavebuttonforsavebill();
	}
	@Test(priority = 28)
	public void saveyesbuttonisclickable() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.clickonyesbuttonforbillsave();
	}
	@Test(priority = 29)
	public void saveokbuttonisclickable() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.clickonokbuttonforbillsave();
	}
	@Test(priority =30)
	public void billtypeisSelectable() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.selectbilltypefromdropdownforbillapproval();
	}
	@Test(priority =31)
	public void cansearchbillforapproval() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.searchbillforapproval();
	}
	@Test(priority =32)
	public void viewslipbuttonisclickable() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.clickonviewslipbuttontoviewbillmasslip();
	}
	@Test(priority =33)
	public void hardcopyyesbuttonisclickable() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.clickonhardcopyreceiveyestoviewbillmasslip();
	}
	@Test(enabled=false)
	public void massslipisclickable() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		//BE.clickonmasslip();
	}
	@Test(priority =35)
	public void approvebuttonisclickable() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.clickonapprovetoapprovebill();
	}
	@Test(priority =36)
	public void approveyesbuttonisclickable() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.clickonyestoapprovebill();
	}
	@Test(priority = 37)
	public void backButtonisClickable() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.Clickforbackbutton();

	}
	@Test(priority = 38)
	public void logoutButtonisClickable() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.Clickforlogoutbutton();

	}
	@Test(priority = 39)
	public void yesforlogoutButtonisClickable() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.Clickforlogoutyesbutton();

	}
	@Test(priority = 40)
	public void loginWithHOD() throws EncryptedDocumentException, IOException {

		BE.enterUsernameforHOD();
		BE.enterPasswordforHOD();
		BE.clickOnLoginforHOD();

	}
	@Test(priority = 41)
	public void FinancialWorkIsClickableforHOD() throws EncryptedDocumentException, IOException, InterruptedException {

		BE.clickOnFinancialWork();
	}
	@Test(priority = 42)
	public void CanMovetobillacceptnace() throws EncryptedDocumentException, IOException, InterruptedException {

		BE.movetoBillAcceptance();
	}
	@Test(priority = 43)
	public void billinboxIsClickable() throws EncryptedDocumentException, IOException, InterruptedException {

		BE.clickOnBillInbox();
	}
	@Test(priority =44)
	public void billtypeisSelectableHOD() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.selectbilltypefromdropdownforbillapproval();
	}
	@Test(priority =45)
	public void cansearchbillforapprovalHOD() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.searchbillforapproval();
	}
	@Test(priority =46)
	public void viewslipbuttonisclickableHOD() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.clickonviewslipbuttontoviewbillmasslip();
	}
	@Test(priority =47)
	public void hardcopyyesbuttonisclickableHOD() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.clickonhardcopyreceiveyestoviewbillmasslip();
	}
	@Test(enabled=false)
	public void massslipisclickableHOD() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		//BE.clickonmasslip();
	}
	@Test(priority =49)
	public void approvebuttonisclickableHOD() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.clickonapprovetoapprovebill();
	}
	@Test(priority =50)
	public void approveyesbuttonisclickableHOD() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.clickonyestoapprovebill();
	}
	@Test(priority = 51)
	public void backButtonisClickableHOD() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.Clickforbackbutton();

	}
	@Test(priority = 52)
	public void logoutButtonisClickableHOD() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.Clickforlogoutbutton();

	}
	@Test(priority = 53)
	public void yesforlogoutButtonisClickableHOD() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.Clickforlogoutyesbutton();

	}
	@Test(priority = 54)
	public void loginWithdycafo() throws EncryptedDocumentException, IOException {

		BE.enterUsernamefordycafo();
		BE.enterPasswordfordycafo();
		BE.clickOnLoginfordycafo();

	}
	@Test(priority = 55)
	public void FinancialWorkIsClickablefordycafo() throws EncryptedDocumentException, IOException, InterruptedException {

		BE.clickOnFinancialWork();
	}
	@Test(priority = 56)
	public void CanMovetobillacceptnacefordycafo() throws EncryptedDocumentException, IOException, InterruptedException {

		BE.movetoBillAcceptance();
	}
	@Test(priority = 57)
	public void billinboxIsClickablefordycafo() throws EncryptedDocumentException, IOException, InterruptedException {

		BE.clickOnBillInbox();
	}
	@Test(priority =58)
	public void billtypeisSelectablefordycafo() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.selectbilltypefromdropdownforbillapproval();
	}
	@Test(priority =59)
	public void cansearchbillforapprovalfordycafo() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.searchbillforapproval();
	}
	@Test(priority =60)
	public void viewslipbuttonisclickablefordycafo() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.clickonviewslipbuttontoviewbillmasslip();
	}
	@Test(priority =61)
	public void hardcopyyesbuttonisclickablefordycafo() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.clickonhardcopyreceiveyestoviewbillmasslip();
	}
	@Test(enabled=false)
	public void massslipisclickablefordycafo() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		//BE.clickonmasslip();
	}
	@Test(priority =63)
	public void approvebuttonisclickablefordycafo() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.clickonapprovetoapprovebill();
	}
	@Test(priority =64)
	public void approveyesbuttonisclickablefordycafo() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.clickonyestoapprovebill();
	}
	@Test(priority = 65)
	public void backButtonisClickablefordycafo() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.Clickforbackbutton();

	}
	@Test(priority = 66)
	public void logoutButtonisClickablefordycafo() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.Clickforlogoutbutton();

	}
	@Test(priority = 67)
	public void yesforlogoutButtonisClickablefordycafo() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.Clickforlogoutyesbutton();

	}
	@Test(priority = 68)
	public void loginWithcashier() throws EncryptedDocumentException, IOException {

		BE.enterUsernameforcashier();
		BE.enterPasswordforcashier();
		BE.clickOnLoginforcashier();

	}
	@Test(priority = 69)
	public void FinancialWorkIsClickableforcashier() throws EncryptedDocumentException, IOException, InterruptedException {

		BE.clickOnFinancialWork();
	}
	@Test(priority = 70)
	public void CanMovetobillacceptnaceforcashier() throws EncryptedDocumentException, IOException, InterruptedException {

		BE.movetoBillAcceptance();
	}
	@Test(priority = 71)
	public void billinboxIsClickableforcashier() throws EncryptedDocumentException, IOException, InterruptedException {

		BE.clickOnBillInbox();
	}
	@Test(priority =72)
	public void billtypeisSelectableforcashier() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.selectbilltypefromdropdownforbillapproval();
	}
	@Test(priority =73)
	public void cansearchbillforapprovalforcashier() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.searchbillforapproval();
	}
	@Test(priority =74)
	public void viewslipbuttonisclickableforcashier() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.clickonviewslipbuttontoviewbillmasslip();
	}
	@Test(priority =75)
	public void hardcopyyesbuttonisclickableforcashier() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.clickonhardcopyreceiveyestoviewbillmasslip();
	}
	@Test(enabled=false)
	public void massslipisclickableforcashier() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		//BE.clickonmasslip();
	}
	@Test(priority =77)
	public void approvebuttonisclickableforcashier() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.clickonapprovetoapprovebill();
	}
	@Test(priority =78)
	public void approveyesbuttonisclickableforcashier() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.clickonyestoapprovebill();
	}
	@Test(priority = 79)
	public void backButtonisClickableforcashier() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.Clickforbackbutton();
	}
	@Test(priority = 80)
	public void FinancialWorkIsClickableforInvoice() throws EncryptedDocumentException, IOException, InterruptedException {

		BE.clickOnFinancialWork();
	}
	@Test(priority = 81)
	public void InvoicegenerationmenuIsClickable() throws EncryptedDocumentException, IOException, InterruptedException {

		BE.ClickforInvoicegeneration();
	}
	@Test(priority = 82)
	public void OKIsClickable() throws EncryptedDocumentException, IOException, InterruptedException {

		BE.clickforokbutton();
	}
	@Test(priority =83)
	public void GroupCashbookdropdownIsselectable() throws EncryptedDocumentException, IOException, InterruptedException {

		BE.selectrokhvahigat();
	}
	@Test(priority =84)
	public void CashbookdropdownIsselectable() throws EncryptedDocumentException, IOException, InterruptedException {

		BE.selectrokhvahi();
	}
	@Test(priority = 85)
	public void designationdropdownIsselectable() throws EncryptedDocumentException, IOException, InterruptedException {

		BE.selectdesignation();
	}
	@Test(priority =86)
	public void cansearchInvoicebillforapprovalfordycafo() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {
		BE.searchbillforinvoicegeneration();
	}
	@Test(priority =87)
	public void canselectbillsforinforinvoicegenration() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {
		BE.clickforselectbills();
	}
	@Test(priority =88)
	public void clickongenerateinvoiceforinvoicegenration() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {
		BE.selectgenerateinvoicebutton();
	}
	@Test(priority =89)
	public void clickonyesforinvoicegenration() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {
		BE.clickOnyesforinvoicegenerate();
	}
	@Test(priority =90)
	public void okbuttonisclickableforinvoicegenration() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {
		BE.clickokforinvoicegeneration();
	}
	@Test(priority =91)
	public void backbuttonisclickableforinvoicegenration() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {
		BE.clickonbackbutton();
	}
	@Test(priority = 92)
	public void logoutButtonisClickableforcashier() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.Clickforlogoutbutton();

	}
	@Test(priority = 93)
	public void yesforlogoutButtonisClickableforcashier() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.Clickforlogoutyesbutton();

	}
	@Test(priority = 94)
	public void loginWithdycafoforfinalpayment() throws EncryptedDocumentException, IOException {

		BE.enterUsernamefordycafo();
		BE.enterPasswordfordycafo();
		BE.clickOnLoginfordycafo();

	}
	@Test(priority =95)
	public void mastermenubuttonisclickableforfinalpayment() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {
		BE.clickonmastermenubutton();
	}
	@Test(priority =96)
	public void FinalPaymentapprovalmenubuttonisclickableforfinalpayment() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {
		BE.clickonfinalpaymentapprovalmenubutton();
	}
	@Test(priority =97)
	public void cansearchInvoiceforfinalpaymentapproval() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.searchinvoiceforapproval();
	}
	@Test(priority =98)
	public void viewslipbuttonisclickableforinvoice() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.clickonviewslipbuttontoviewbillmasslip();
	}
	@Test(priority =99)
	public void FinalPaymentapprovalbuttonisclickableforfinalpayment() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.clickonfinalpaymentapprovalbutton();
	}
	@Test(priority =100)
	public void FinalPaymentapprovalyesbuttonisclickableforfinalpayment() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.clickonfinalpaymentapprovalyesbutton();
	}
	@Test(priority =101)
	public void FinalPaymentapprovalokbuttonisclickableforfinalpayment() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.clickonfinalpaymentapprovalokbutton();
	}
	@Test(priority = 102)
	public void backButtonisClickablefordycafo1() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.Clickforbackbutton();
	}
	@Test(priority = 103)
	public void backButtonisClickablefordycafo2() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.Clickforbackbutton();
	}
	@Test(priority = 104)
	public void logoutButtonisClickablefordycafo1() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.Clickforlogoutbutton();
	}
	@Test(priority = 105)
	public void yesforlogoutButtonisClickablefordycafo1() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		BE.Clickforlogoutyesbutton();
	}
	@AfterClass
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	
	

}

