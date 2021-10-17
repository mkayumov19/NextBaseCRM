package com.nextbasecrm.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelRead {
    @Test
    public void read_from_excel_file() throws IOException {

        String path = "SampleData.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Employees");
        System.out.println("sheet.getRow(1).getCell(0) = " + sheet.getRow(1).getCell(0));
        System.out.println("sheet.getRow(3).getCell(2) = " + sheet.getRow(3).getCell(2));
        int usedRows = sheet.getPhysicalNumberOfRows();
        int lastUsedRow = sheet.getLastRowNum();

//        //Ex: 1- CREATE A LOGIC TO PRINT OUT NEENA'S NAME DYNAMICALLY
//        for (int rowNum = 0; rowNum < usedRows; rowNum++) {
//            if (sheet.getRow(rowNum).getCell(0).toString().equals("Neena")){
//                System.out.println("Current cell = " + sheet.getRow(rowNum).getCell(0));
//            }
//        }
//        //Ex: 2 - CREATE A LOGIC TO PRINT OUT STEVEN KING'S JOB_ID
//        // CHECK FOR STEVEN'S NAME, IF ITS STEVEN --> PRINT OUT JOB_ID
//        for (int rowNum = 0; rowNum < usedRows; rowNum++) {
//            if (sheet.getRow(rowNum).getCell(0).toString().equals("Steven")){
//                System.out.println("Steven's JOB_ID: " + sheet.getRow(rowNum).getCell(2));
//            }
//        }

    }
}

