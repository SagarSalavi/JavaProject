class Employee
{
  private  String Ename;
  private	int Eid;
  private double Esalary;
  private static int Ecount=0;
  private static int EmployeeId=1000;


	Employee()
	{
		System.out.println("Welcome to our Company ");
		Ecount++;
		this.Eid=EmployeeId++;
		
	}
    
    Employee(String name,  double salary)
	{
		System.out.println("Welcome to our Company ");
		this.Ename=name;
		this.Eid=EmployeeId++;
		this.Esalary=salary;
		Ecount++;
		 
		
	}

	

	public void Work()
	{
		System.out.println("All Employees work in Company!");
	}

	public int getEcount()
	{
		return Ecount;
	}
     
	public int getEid()
	{
		return Eid;
	}

	public String getEname()
	{
		return Ename;
	}

	public void setEname(String name)
	{
		this.Ename=name;
	}

	public double getEsalary()
	{
		return Esalary;
	}

	public void setEsalary(double salary)
	{
		this.Esalary=salary;
	}


}
