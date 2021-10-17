package com.nextbasecrm.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;

    @Test
    public void excel_writing_test() throws IOException {

        String path = "ExcelFileName.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        workbook = new XSSFWorkbook(fileInputStream);
        sheet = workbook.getSheet("sheetName");
        row = sheet.getRow(1);
        cell = row.getCell(1);
        XSSFCell valueAtCell = sheet.getRow(2).getCell(0);
        System.out.println("Before: " + valueAtCell);

        valueAtCell.setCellValue("value");
        System.out.println("After: " + valueAtCell);

//        Ex: CHANGE STEVEN'S NAME TO TOM
//        for (int rowNum = 0; rowNum < sheet.getLastRowNum(); rowNum++) {
//            if (sheet.getRow(rowNum).getCell(0).toString().equals("Steven")){
//                sheet.getRow(rowNum).getCell(0).setCellValue("Tom");
//            }
//        }

        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);
        fileInputStream.close();
        fileOutputStream.close();
        workbook.close();
    }

}

