package JdbcProject.JdbcProject;

public class EmployeeMaster {

	public static void main(String[] args)
	{
		
		Employee emp1=new Employee();
		try
		{
		   EmployeeDao.deleteEmployee(12);
		}catch(Exception ex)
		{
			
		}
		
		  Employee e = new Employee(12, "ashish", 20, 13000, "developer"); 
		  try {
			  
		  EmployeeDao.insertEmployee(e); 
		  } 
		  catch (Exception ex) 
		  {
		  System.out.println(ex.getMessage()); 
		  }
		 
		 
		
		
		  Employee e1=new Employee(12,"rashmi",23,230000,"developer"); 
		  try 
		  {
		  EmployeeDao.UpdateEmployee(e1); 
		  }catch(Exception ex) 
		  {
		  System.out.println(ex.getMessage()); 
		  }
		 
		
		  System.out.println("List of All Employees is::");
		  Employee emp=new Employee(); 
		  try 
		  { 
			  System.out.print(EmployeeDao.getAllEmployees());
		  
		  } catch ( Exception e2) 
		  { 
			  System.out.println(e2.getMessage()); 
		  }
		  
		  
		  
		 
		System.out.println("Get Employee By Id");
		Employee E2=new Employee();
		try
		{
			System.out.println(EmployeeDao.getEmployeeById(12));
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		
		System.out.println("Get Employee ByName");
		Employee e3=new Employee();
		
		try
		{
			System.out.println(EmployeeDao.getEmployeeByName("Rashmi"));
		}catch(Exception exe)
		{
			System.out.println(exe.getMessage());
		}
		
        Employee employee=new Employee();
		try
		{
		  //EmployeeDao.getEmployeeByDepartment("sales").stream().forEach(System.out::println(employee));
		}catch(Exception exe)
		{
			System.out.println(exe.getMessage());
		}

	}

}
