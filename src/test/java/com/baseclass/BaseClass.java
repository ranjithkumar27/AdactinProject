
package com.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	Navigation navigate;

	Alert al;

	JavascriptExecutor js;

	Select s;

	// WEB DRIVER

	// 1st to launch the driver

	public WebDriver webdriverlaunch(String browsername) {

		if (browsername.equalsIgnoreCase("Chrome")) {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("FireFox")) {

			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

		} else if (browsername.equalsIgnoreCase("Ie")) {

			WebDriverManager.iedriver().setup();

			driver = new InternetExplorerDriver();

		} else {

			System.out.println("Invalid browser");
		}

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		return driver;

	}
	// 2nd to get the URL

	public String getUrl(String url) {

		driver.get(url);

		return url;

	}

	// 3rd to get the current URL
	public String getCurrenturl() {

		String currentUrl = driver.getCurrentUrl();

		return currentUrl;

	}

	// 4th to get the current Title
	public String gettitle() {

		String title = driver.getTitle();

		return title;

	}

	// 5th to close the child window or current window
	public void close() {

		driver.close();
	}

	// 6th to close the entire browser
	public void quit() {

		driver.quit();
	}

	// 7th using switchto

	public TargetLocator switchto() {

		TargetLocator switchTo = driver.switchTo();

		return switchTo;
	}

	// 8th to get the parent window ID

	public String windowhandle() {

		String windowHandle = driver.getWindowHandle();

		return windowHandle;
	}

	// 9th to get the allwindow ID including parent window ID

	public Set<String> windowhandles() {

		Set<String> windowHandles = driver.getWindowHandles();

		return windowHandles;

	}

	// ***************************************************************

	// WEB ELEMENT

	// 10th to fill the values in webpage

	public void sendkeys(WebElement element, String data) {

		element.sendKeys(data);

	}

	// 11th to click the button

	public void click(WebElement element) {
		element.click();
	}

	// 12th to get the text

	public String gettext(WebElement element) {

		String text = element.getText();

		return text;

	}

	// 13th

	public String getAttribute(WebElement element, String data) {

		String string = element.getAttribute(data);

		return string;
	}

	// 14th
	public void isDisplayed() {

	}

	// 15th
	public void isEnabled() {

	}

	// 16th
	public void isSelected() {

	}

	// *****************************************

	// NAVIGATIONS

	// 17th navigation

	public Navigation navigate() {

		Navigation navigate = driver.navigate();

		return navigate;
	}

	// 18th get URL using navigations

	public void navigateUrl(String data) {

		navigate.to(data);

	}

	// 19th refresh the current Url
	public void refresh() {

		navigate.refresh();

	}

	// 20th go forward in the Url
	public void forward() {

		navigate.forward();
	}

	// 21st to go backward in the url
	public void back() {

		navigate.back();
	}

	// ACTIONS

	// 22nd used to do mouse over actions

	public void moveToElement(WebElement element) {

		Actions acc = new Actions(driver);

		acc.moveToElement(element).perform();

	}

	// 23nd used to drag and drop

	public void dragAndDrop(WebElement target, WebElement element) {

		Actions acc = new Actions(driver);

		acc.dragAndDrop(element, target).perform();

	}

	// 24th used to do double click

	public void doubleclick(WebElement element) {

		Actions acc = new Actions(driver);

		acc.doubleClick(element).perform();

	}

	// 25th used to do right click

	public void contextclick(WebElement element) {
		Actions acc = new Actions(driver);

		acc.contextClick(element).perform();
	}

	// *************************************************************************************

	// ALERT

	// 26th to accept the alert

	public void alertaccept() {
		driver.switchTo().alert();
		al.accept();
	}

	// 27th to dismiss the alert
	public void alertDismiss() {
		driver.switchTo().alert();
		al.dismiss();
	}

	// 28th to get the text in the alert
	public String alertGetText() {
		driver.switchTo().alert();
		String text = al.getText();
		return text;

	}

	// 29th to send the data's in alert

	public void alertSendkeys(String data) {
		driver.switchTo().alert();
		al.sendKeys(data);

	}

	// SELECT

	// 30th to select the dd using index
	public void selectByIndex(WebElement element, int index) {

		s = new Select(element);

		s.selectByIndex(index);
	}

	// 31st to select the dd using value

	public void selectByValue(WebElement element, String data) {

		s = new Select(element);

		s.selectByValue(data);
	}

	// 32nd to select the dd using visibletext

	public void selectByVisibleText(WebElement element, String data) {

		s = new Select(element);

		s.selectByVisibleText(data);
	}

	// DE-SELECT

	// 31st to De-select the dd using index

	public void deselectByIndex(WebElement element, int index) {

		s = new Select(element);

		s.selectByIndex(index);
	}

	// 32nd to De-select the dd using value

	public void deselectByValue(WebElement element, String data) {

		s = new Select(element);

		s.selectByValue(data);
	}

	// 33rd to De-select the dd using visible text
	public void deselectByVisibleText(WebElement element, String data) {

		s = new Select(element);

		s.selectByVisibleText(data);
	}

	// 34th to select all the options
	public List<WebElement> getoptions(String data) {

		List<WebElement> options = s.getOptions();

		return options;

	}

	// 36th to deselect all the options

	public void deSelectAll() {
		s.deselectAll();

	}

	// 37th to check whether it is multi selected dd or single selected dd

	// ture-if it is multi selected

	// false- if it is single selected

	public boolean ismultiple() {

		boolean multiple = s.isMultiple();

		return multiple;

	}

	public String getFirstSelectedOption(WebElement element) {

		element = s.getFirstSelectedOption();

		String text = element.getText();

		return text;
	}

	public void getAllSelected() {

		List<WebElement> options = s.getAllSelectedOptions();

		for (int i = 0; i < options.size(); i++) {

			WebElement element = options.get(i);

			String text = element.getText();

			System.out.println(text);

		}
	}

	// TO GET DATA FROM EXCEL

	public String getDataFromExcel(String data, int rowIndex, int cellindex) throws IOException {

		String value = null;

		File f = new File("D:\\RanjithWorkspace\\MavenClassProject\\testingexcel\\iphonesexample2.xlsx");

		FileInputStream stream = new FileInputStream(f);

		Workbook work = new XSSFWorkbook(stream);

		Sheet sheet = work.getSheet(data);

		Row row = sheet.getRow(rowIndex);

		Cell cell = row.getCell(cellindex);

		int cellType = cell.getCellType();

		if (cellType == 1) {

			value = cell.getStringCellValue();

		}
		if (cellType == 0) {

			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();

				SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");

				value = format.format(dateCellValue);

			} else {
				double numericCellValue = cell.getNumericCellValue();
				long l = (long) numericCellValue;
				value = String.valueOf(l);
			}
		}
		return value;
	}

	// UPDATE DATA IN EXCEL

	public void UpdateDataInExcel(String data, int rowindex, int cellindex) throws IOException {

		File f = new File("D:\\\\RanjithWorkspace\\\\MavenClassProject\\\\testingexcel\\\\iphonesexample2.xlsx");

		FileInputStream inputStream = new FileInputStream(f);

		Workbook work = new XSSFWorkbook(inputStream);

		Sheet sheet = work.getSheet(data);

		Row row = sheet.getRow(rowindex);

		Cell cell = row.getCell(cellindex);

		cell.setCellValue(data);

		FileOutputStream outputStream = new FileOutputStream(f);

		work.write(outputStream);

	}

	public void newDataUpdateInExcel(String location, String sheetname, int rowindex, int cellindex, String cellvalue)
			throws IOException {

		File f = new File(location);

		Workbook work = new XSSFWorkbook();

		Sheet sheet = work.createSheet(sheetname);

		Row row = sheet.createRow(rowindex);

		Cell cell = row.createCell(cellindex);

		cell.setCellValue(cellvalue);

		FileOutputStream outputStream = new FileOutputStream(f);

		work.write(outputStream);
	}

	public void UpdateDataInExcelWithSheet(String location, int rowindex, int cellindex, String data)
			throws IOException {

		File f = new File(location);

		// FileInputStream inputStream =new FileInputStream(f);

		Workbook work = new XSSFWorkbook();

		Sheet sheet = work.getSheet(data);

		Row row = sheet.getRow(rowindex);

		Cell cell = row.getCell(cellindex);

		cell.setCellValue(data);

		FileOutputStream outputStream = new FileOutputStream(f);

		work.write(outputStream);

	}

}
