package JdbcProject.JdbcProject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetMaster {

	public static void main(String[] args) {
		try
		{
			Connection conn=ConnectionMaster.getConnection();
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("Select * from Employee");
			while(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getString(5));
		}catch(Exception ex)
		{
			
		}
	}

}
