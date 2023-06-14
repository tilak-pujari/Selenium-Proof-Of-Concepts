package com.part3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWrite {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\91740\\OneDrive\\Desktop\\Selenium\\ExcelSheet\\testdata.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		sh.createRow(3).createCell(0).setCellValue("Institute");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\91740\\\\OneDrive\\Desktop\\Selenium\\ExcelSheet\\testdata.xlsx");
		book.write(fos);
		fos.flush();
		System.out.println("Value written in Excel Sheet");
	}
}
