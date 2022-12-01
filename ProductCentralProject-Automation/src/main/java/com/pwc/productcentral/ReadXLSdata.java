package com.pwc.productcentral;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadXLSdata {
	
	   private FileInputStream fis;
	   private Workbook wb;
	   private Sheet sh;
	   private Cell cell;
	   String excelFilePath;
	   private Map<String, Integer> columns = new HashMap<>();

	    public void setExcelFile(String ExcelPath, String SheetName) throws Exception {
	        try {
	            File f = new File(ExcelPath);

	            if (!f.exists()) {
	                f.createNewFile();
	                System.out.println("File doesn't exist");
	            }

	            fis = new FileInputStream(ExcelPath);
	            wb = WorkbookFactory.create(fis);
	            sh = wb.getSheet(SheetName);
	            if (sh == null) {
	                sh = wb.createSheet(SheetName);
	            }

	            this.excelFilePath = ExcelPath;

	          
	            sh.getRow(0).forEach(cell ->{
	                columns.put(cell.getStringCellValue(), cell.getColumnIndex());
	            });

	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }
	    public String getCellData(int rownum, int colnum) throws Exception{
	        try{
	            cell = sh.getRow(rownum).getCell(colnum);
	            String CellData = null;
	            switch (cell.getCellType()){
	                case STRING:
	                    CellData = cell.getStringCellValue();
	                    break;
	                case NUMERIC:
	                    if (DateUtil.isCellDateFormatted(cell))
	                    {
	                        CellData = String.valueOf(cell.getDateCellValue());
	                    }
	                    else
	                    {
	                        CellData = String.valueOf((long)cell.getNumericCellValue());
	                    }
	                    break;
	                case BOOLEAN:
	                    CellData = Boolean.toString(cell.getBooleanCellValue());
	                    break;
	                case BLANK:
	                    CellData = "";
	                    break;
				default:
					break;
	            }
	            return CellData;
	        }catch (Exception e){
	            return"";
	        }
	    }

	    public String getCellData(String columnName, int rownum) throws Exception {
	        return getCellData(rownum, columns.get(columnName));
	    }

}
