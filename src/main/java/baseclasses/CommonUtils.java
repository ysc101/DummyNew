package baseclasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import dev.failsafe.internal.util.Assert;

import java.security.*;

public class CommonUtils extends BaseClass

{

	// @Author Name
	// This Method is use for fetch the external Excel sheet Data

	// need to pass 2 Parameter 1 is int row and 2 is int column

	public static String getExcelData(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("E:\\XLFile\\ZPFMS XL\\ZPFMS_LOGIN_CREDENTIAL.xlsx");
		String value = WorkbookFactory.create(file).getSheet("ZPFMS_CREDENTIALS").getRow(rowIndex).getCell(colIndex)
				.getStringCellValue();
		return value;
	}

//	
	/**
	 * 
	 * @description Method to implement
	 * @auther
	 * @version 1.0
	 * @throws IOException
	 * @throws IOException
	 * @throws Throwable
	 */

	// String xlPath = "C:\\Users\\omkar.omanwar\\Desktop\\SECI_RESULT.xlsx";
	// String xlSheet = "RESULT";
	public static void writeExcel(int rowNum, int cellNum, String inputString)
			throws EncryptedDocumentException, IOException {
		String xlPath = "E:\\XLFile\\sna-tribal\\Tribal Result.xlsx";
		String xlSheet = "Result";
		FileInputStream fis = new FileInputStream(xlPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(xlSheet);
		Row row = sh.createRow(rowNum);
		Cell cell = row.createCell(cellNum);
		cell.setCellValue(inputString);
		FileOutputStream fos = new FileOutputStream(xlPath);
		wb.write(fos);
		fos.close();
	}

	// @Author Name
	// This Method is to capture ScreenShot

	// need to pass 2 Parameter 1 is Driver and 2 Test case ID

	public static void captureScreenShoot(WebDriver driver, int ID) {

		File scrShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Random rand = new Random();
		int rand_int1 = rand.nextInt(1000);
		try {
			FileUtils.copyFile(scrShot, new File("E:\\cna-ireda-project\\failed_screnshot" + rand_int1 + ".png"));
		} catch (IOException e)

		{
			System.out.println(e.getMessage());
		}

	}

	public static void clickCheckBoxForVendorApproval(WebDriver driver) {
		List<WebElement> allCheckBoxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
		int checkBoxId = allCheckBoxes.size() - 1;
		String idFormation = "body_grdApprovalPending_chkApproval_" + checkBoxId + "";
		WebElement clickCheckbox = driver.findElement(By.id(idFormation));
		clickCheckbox.click();

	}

	public static void checkenabledCheckBox(WebDriver driver) {
		List<WebElement> checkBoxList = driver.findElements(By.cssSelector("//*[@id=\"body_grdApprovalPending\"]"));
		int i = 0;
		int checkBoxId = 0;
		String idFormation;
		WebElement clickCheckbox;
		for (WebElement checkBox : checkBoxList) {
			boolean selected = checkBox.isEnabled();
			if (selected) {
				checkBoxId = i;
				checkBox.click();
				System.out.println("check box id=====================" + i);
				// break;

			} // *[@id="body_grdApprovalPending"]/tbody/tr[1]/td[1] ("input[type='checkbox']")
			i++;
		}
		idFormation = "body_grdApprovalPending_chkApproval_" + checkBoxId + "";
		clickCheckbox = driver.findElement(By.id(idFormation));
		clickCheckbox.click();
		clickCheckbox.sendKeys(Keys.TAB);

	}

	public static String generateAccountNumber(int i) {

		// String generateNum =generateAccountNumber();
		Random r = new Random();
		long numbers = 100000000000L + (long) (r.nextDouble() * 99999999999L);
		String accountnumber = Long.toString(numbers);
		System.out.println(accountnumber);
		return accountnumber;
	}

	public static String generateSanctionNumber(WebDriver driver) {
		Random rand = new Random();
		int rand_int1 = rand.nextInt(10000);
		return String.valueOf(rand_int1);
	}

	public static void openOrdercopy(String xpath) throws InterruptedException {
		String primaryID = driver.getWindowHandle();
		driver.findElement(By.xpath(xpath)).click();
		Thread.sleep(3000);
		Set<String> multipleID = driver.getWindowHandles();

		for (String singleID : multipleID) {

			if (!(singleID.equals(primaryID))) {

				driver.switchTo().window(singleID);
				driver.close();
				driver.switchTo().window(primaryID);

			}

		}
	}

	public static void windowScrollDown(WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,400)", "");
		for (int i = 0; i < 3000; i += 3) {
			js.executeScript("window.scrollTo(0, " + i + ")");
		}
	}

	public static void windowScrollUp(WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,400)", "");
		for (int i = 5000; i > 0; i -= 3) {
			js.executeScript("window.scrollTo(1000, " + i + ")");
		}
	}

	public static String RandomCharactor(WebDriver driver, int length) {

		Random random = new Random();
		final int alphabetLength = 'z' - 'a' + '1' - '9';
		StringBuilder result = new StringBuilder(length);
		while (result.length() < length) {
			final char charCaseBit = (char) (random.nextInt(2) << 5);
			result.append((char) (charCaseBit | ('a' + random.nextInt(alphabetLength))));
		}
		result = result.append(".786-खटाव");
		return result.toString();

	}

	String generateNum = generatePramaNumber(mapAANumber);

	public static String generatePramaNumber(Map<String, String> mapAANumber) {
		Random r = new Random();
		long numbers = 1000L + (long) (r.nextDouble() * 9999L);
		String aaNumber = Long.toString(numbers);
		System.out.println(aaNumber);
		mapAANumber.put("PrmaNumber", aaNumber);
		return aaNumber;
	}

	public static Map<String, String> generatePAN(int len) {
		String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		SecureRandom rnd = new SecureRandom();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++) {

			sb.append(AB.charAt(rnd.nextInt(AB.length())));
		}
		sb = sb.append("6569N");
		pannumberMap.put("PANNUMBER", sb.toString());
		return pannumberMap;

	}

	public static String generateAadharNumber(int i) {

		Random r = new Random();
		long numbers = 100000000000L + (long) (r.nextDouble() * 99999999999L);
		String accountnumber = Long.toString(numbers);
		System.out.println(accountnumber);
		return accountnumber;
	}

}
