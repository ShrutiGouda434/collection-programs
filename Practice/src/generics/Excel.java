package generics;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	String path=" D://Automation_workspace/Jumkey/data/input.xlsx";
	 public static String getCellValue(String path, String sheet, int r, int c)

  {

	 String v="";
                  try{

			             FileInputStream fis=new FileInputStream(path);

			             Workbook wb=WorkbookFactory.create(fis);

			             v=wb.getSheet(sheet).getRow(r).getCell(c).toString();

			                                   
			          }

			          catch(Exception e)

			         {

			             System.out.println("Exception");
			                      
			         }

			                 return v;

			        }

			             

			             
 public static int getRowCount(String path, String sheet)
		 {

		 int rc=0;

	 try{

		 FileInputStream fis=new FileInputStream(path);

		  Workbook wb=WorkbookFactory.create(fis);

		 rc=wb.getSheet(sheet).getLastRowNum();

			                                     

		  }

	catch(Exception e)

  {

   System.out.println("Exception");

   }

	 return rc;
  }

   public static int getCellCount(String path, String sheet, int r)

	 {

	 int cc=0;

	 try{

	  FileInputStream fis=new FileInputStream(path);

	  Workbook wb=WorkbookFactory.create(fis);

	 cc=wb.getSheet(sheet).getRow(r).getLastCellNum();

			                                     
 }

	   catch(Exception e)

   {

	System.out.println("Exception");

 }

 return cc;

}

			                         
 }




