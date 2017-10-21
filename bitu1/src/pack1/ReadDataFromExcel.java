package pack1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;

import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {
	//FileInputStream fis=new FileInputStream("C:\\Users\\linkan\\Desktop\\lksahu..xlsx");
		Fillo fillo=new Fillo();

		com.codoid.products.fillo.Connection connection=fillo.getConnection("C:\\Users\\linkan\\Desktop\\lksahu.xlsx");

		String strQuery="Select * from Sheet1 where Salary>100";

		Recordset recordset=connection.executeQuery(strQuery);
		while(recordset.next()){

		System.out.println(recordset.getField("EmpName"));
		}
		 

		recordset.close();

		connection.close();

	}
 
}
