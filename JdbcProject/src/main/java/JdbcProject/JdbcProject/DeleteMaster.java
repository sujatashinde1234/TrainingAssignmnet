package JdbcProject.JdbcProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteMaster {


	public static void main(String[] args) {
		try
		{
			Scanner sc=new Scanner(System.in);
			Connection con=ConnectionMaster.getConnection();
			PreparedStatement pst=con.prepareStatement("delete from employee where eid=?");
			System.out.println("Please Enter employee  id");
			pst.setInt(1, Integer.parseInt(sc.nextLine()));
			
			pst.executeUpdate();
			con.close();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
