package excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DemoA {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		Workbook w=WorkbookFactory.create(new File("./data/booknew.xlsx"));
		String s=w.getSheet("sheet1").getRow(0).getCell(0).toString();
		System.out.println(s);

	}

}
