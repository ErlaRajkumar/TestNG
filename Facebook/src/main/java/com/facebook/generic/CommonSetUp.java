package com.facebook.generic;

public interface CommonSetUp 
{
	String CHROME_KEY="webdriver.chrome.driver";
	String CHROME_VALUE="./drivers/chromedriver.exe";
	String GECKO_KEY="webdriver.gecko.driver";
	String GECKO_VALUE="./drivers/geckodriver.exe";
	String FB_URL="https://www.facebook.com/";
	long ITO=10;
	long ETO=10;
	String TEST_INPUT_DATA="./ExcelData/AutomationData.xlsx";
	String REPORT_PATH="./ExcelErrorData/ErrorData.xlsx";
	String PHOTO_PATH="./ErrorSnapShot/";
}
