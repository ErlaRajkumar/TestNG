package com.facebook.generic;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


/**
 * This class provides all the utility methods of the automation framework
 * 
 * @author Erla Rajkumar
 *
 */
public class Facebook_DataReading {
	// due to easy of use all the methods will be static

	/**
	 * This method is used to get the Data from the Excel Sheet
	 * 
	 * @param path
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return String
	 */
	public static String getXLData(String path, String sheet, int row, int cell) {
		String value = null;
		try {
			FileInputStream fis = new FileInputStream(path);
			Workbook wk = WorkbookFactory.create(fis);
			value = wk.getSheet(sheet).getRow(row).getCell(cell).toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static void setXLData(String path, String sheet, int row, int cell, String value) {
		try {
			Workbook wk = WorkbookFactory.create(new FileInputStream(path));
			Sheet sh = wk.getSheet(sheet);
			Row r = null;
			if (sh != null) {
				r = sh.getRow(row);
			}

			if (r == null) {
				r = sh.createRow(row);
			}
			Cell c = r.getCell(cell);
			if (c == null) {
				c = r.createCell(cell);
			}
			c.setCellValue(value);
			FileOutputStream fos = new FileOutputStream(path);
			wk.write(fos);
			fos.close();
			wk.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void setXLData(String path, String sheet, int row, int cell, int value) {
		try {
			Workbook wk = WorkbookFactory.create(new FileInputStream(path));
			Sheet sh = wk.getSheet(sheet);
			Row r = null;
			if (sh != null) {
				r = sh.getRow(row);
			}

			if (r == null) {
				r = sh.createRow(row);
			}
			Cell c = r.getCell(cell);
			if (c == null) {
				c = r.createCell(cell);
			}
			c.setCellValue(value);
			FileOutputStream fos = new FileOutputStream(path);
			wk.write(fos);
			fos.close();
			wk.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void FB_TakeScreenShot(WebDriver driver, String path) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File(path);
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	

	public static int getLastRowNumberInExcel(String path, String sheet) {
//	It will provide the last number till where the data is stored in the excel sheet
		int value = 0;
		try {
			Workbook wk = WorkbookFactory.create(new FileInputStream(path));
			Sheet sh = wk.getSheet(sheet);
			value = sh.getLastRowNum();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;

	}

	

}
