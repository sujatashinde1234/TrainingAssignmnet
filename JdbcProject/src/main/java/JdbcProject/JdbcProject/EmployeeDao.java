package JdbcProject.JdbcProject;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao 
{
	
	public static void insertEmployee(Employee e) throws SQLException
	{
		Connection conn = ConnectionMaster.getConnection();
        PreparedStatement pst= conn.prepareStatement("insert into Employee(eid,ename, salary,deptid,designation) values(?,?,?,?,?)");
        pst.setInt(1, e.getEid());
        pst.setString(2, e.getEname());
        pst.setInt(3, e.getSalary());
        pst.setInt(4, e.getDeptid());
        pst.setString(5, e.getDesignation());        
        
        pst.executeUpdate();
        conn.close();
		
	}
	
	public static void UpdateEmployee(Employee e) throws SQLException
	{
		Connection conn=ConnectionMaster.getConnection();
		PreparedStatement pst=conn.prepareStatement("update Employee set ename=?,salary=?,deptid=?,designation=? where eid=?");
		pst.setInt(5, e.getEid());
        pst.setString(1, e.getEname());
        pst.setInt(2, e.getSalary());
        pst.setInt(3, e.getDeptid());
        pst.setString(4, e.getDesignation());        
        
        pst.executeUpdate();
        conn.close();
	}
	
	public static List<Employee> getAllEmployees() throws SQLException
	{
		List<Employee> employees=new ArrayList<Employee>();
		Connection con=ConnectionMaster.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from Employee");
		while(rs.next())
		{
			employees.add(new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5)));
		}
		return employees;
		
	}
	
	public static Employee getEmployeeById(int id) throws SQLException
	{
		List<Employee> employees=new ArrayList<Employee>();
		Connection con=ConnectionMaster.getConnection();
		PreparedStatement st=con.prepareStatement("select * from Employee where eid=?");
		st.setInt(1,id);
		ResultSet rs=st.executeQuery();
		if(rs.next())
		{
			return new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5));
		}
		else
		{
			System.out.println("Employee with the id not found!");
			return null;
		}
		}
	
	public static List<Employee> getEmployeeByName(String name) throws SQLException
	{
		List<Employee> employees=new ArrayList<Employee>();
		Connection con=ConnectionMaster.getConnection();
		PreparedStatement st=con.prepareStatement("select * from Employee where ename=?");
		st.setString(1,name);
		ResultSet rs=st.executeQuery();
		while(rs.next())
		{
		    employees.add(new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5)));
		}
		return employees;
		}
	
	public static List<Employee> getEmployeeByDepartment(String dname) throws SQLException
	{
		List<Employee> employees=new ArrayList<Employee>();
		Connection con=ConnectionMaster.getConnection();
		PreparedStatement st=con.prepareStatement( "select from employee where deptid=(select deptid from department where dname=?");
		st.setString(1, dname);
		ResultSet rs=st.executeQuery();
		ResultSetMetaData rsmt=rs.getMetaData();
		for(int i=1;i<=rsmt.getColumnCount();i++)
			System.out.println(rsmt.getColumnName(i)+" has the type"+rsmt.getColumnTypeName(i));
		while(rs.next())
		{
		    employees.add(new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5)));
		}
		return employees;
		}
	
	
	public static void deleteEmployee(int id) throws SQLException
	{
		Connection con=ConnectionMaster.getConnection();
		CallableStatement cat=con.prepareCall("{call delete_employee(?)}");
		cat.setInt(1, id);
		cat.execute();
		con.close();
	}
	
	}


