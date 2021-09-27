package com.mindtree.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class DataDriven{

public String[] getData(String excelfilePath,String sheetName,int row,int column) throws IOException {


FileInputStream fis=new FileInputStream(excelfilePath);
XSSFWorkbook workbook=new XSSFWorkbook(fis);
XSSFSheet sheet=workbook.getSheet(sheetName);
String[] data = new String[10];

for(int i=row;i<=row;i++)
{
	for(int j=0;j<=column;j++)
	{
		 data[j] = sheet.getRow(i).getCell(j).getStringCellValue();
		 
	}
}
workbook.close();
return data;


} 

}