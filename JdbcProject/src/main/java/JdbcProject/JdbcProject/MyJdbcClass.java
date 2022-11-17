package JdbcProject.JdbcProject;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MyJdbcClass {

	static String URL="jdbc:mysql://localhost:3306/jdbcmaster";
	static String USERNAME="root";
	static String PASSWORD="root";
	public static void main(String[] args) {
		try
		{
			Scanner sc=new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
			PreparedStatement pst=con.prepareStatement("insert into employee(eid,ename,salary,deptid,designation)values(?,?,?,?,?)");
			System.out.println("Please Enter id");
			pst.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("please enter Employee name");
			pst.setString(2,sc.nextLine());
			System.out.println("please Enter Employee Salary");
			pst.setInt(3, Integer.parseInt(sc.nextLine()));
			System.out.println("please enter Employee deptid");
			pst.setInt(4, Integer.parseInt(sc.nextLine()));
			System.out.println("please enter employee designation");
			pst.setString(5,sc.nextLine());
			
			pst.executeUpdate();
			con.close();
		}catch(Exception e)
		{
			
		}

	}

}
