package JdbcProject.JdbcProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateMaster {


		public static void main(String[] args) {
			try
			{
				Scanner sc=new Scanner(System.in);
				
				Connection con=ConnectionMaster.getConnection();
				PreparedStatement pst=con.prepareStatement("update employee set ename=?,salary=?,deptid=?,designation=? where eid=?");
				System.out.println("Please Enter new  id");
				pst.setInt(5, Integer.parseInt(sc.nextLine()));
				System.out.println("please enter new  Employee name");
				pst.setString(1,sc.nextLine());
				System.out.println("please Enter new  Employee Salary");
				pst.setInt(2, Integer.parseInt(sc.nextLine()));
				System.out.println("please enter new  Employee deptid");
				pst.setInt(3, Integer.parseInt(sc.nextLine()));
				System.out.println("please enter new employee designation");
				pst.setString(4,sc.nextLine());
				
				pst.executeUpdate();
				
				con.close();
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			{
				
			}

	}

}
