class Company 
{
	public static void main(String[] args) 
	{
	    System.out.println("------------------------");
		SnrDev obj=new SnrDev();
		System.out.println("Employee Name: " + obj.getEname());
		System.out.println("Employee Salary: " + obj.getEsalary());
		System.out.println("Designation: " + obj.getDesignation());
		System.out.println("Employee ID: " + obj.getEid());
		obj.CreateHLD();
		obj.Work();
		System.out.println("Number of Senior Developers: " + obj.getSnrDevCount());
		System.out.println("Number of Developers: " + obj.getDevCount());
		System.out.println("Number of Employees: " + obj.getEcount());
		

		System.out.println("------------------------");
        JnrDev obj1=new JnrDev();
		System.out.println("Employee Name: " + obj1.getEname());
		System.out.println("Employee Salary: " + obj1.getEsalary());
		System.out.println("Designation: " + obj1.getDesignation());
		System.out.println("Employee ID: " + obj1.getEid());
		obj1.CreateLLD();
		obj1.Work();
		System.out.println("Number of Junior Developers: " + obj1.getJnrDevCount());
		System.out.println("Number of Developers: " + obj1.getDevCount());
		System.out.println("Number of Employees: " + obj1.getEcount());
		

        System.out.println("------------------------");
        Mte obj2=new Mte();
		System.out.println("Employee Name: " + obj2.getEname());
		System.out.println("Employee Salary: " + obj2.getEsalary());
		System.out.println("Designation: " + obj2.getDesignation());
		System.out.println("Employee ID: " + obj2.getEid());
		obj2.WriteTestCase();
		obj2.Work();
		System.out.println("Number of Manuel Test Engineers: " + obj2.getMteCount());
		System.out.println("Number of Testers: " + obj2.getTestCount());
		System.out.println("Number of Employees: " + obj2.getEcount());
		
          
        System.out.println("------------------------");
        Ate obj3=new Ate();
		System.out.println("Employee Name: " + obj3.getEname());
		System.out.println("Employee Salary: " + obj3.getEsalary());
		System.out.println("Designation: " + obj3.getDesignation());
		System.out.println("Employee ID: " + obj3.getEid());
	    obj3.WriteScript();
		obj3.Work();
		System.out.println("Number of Automation Test Engineers: " + obj3.getAteCount());
		System.out.println("Number of Testers: " + obj3.getTestCount());
		System.out.println("Number of Employees: " + obj3.getEcount());
		
	    
        System.out.println("------------------------");
        Recruiter obj4=new Recruiter();
		System.out.println("Employee Name: " + obj4.getEname());
		System.out.println("Employee Salary: " + obj4.getEsalary());
		System.out.println("Designation: " + obj4.getDesignation());
		System.out.println("Employee ID: " + obj4.getEid());
		obj4.Hire();
		obj4.Work();
		System.out.println("Number of Recruiters: " + obj4.getRecCount());
		System.out.println("Number of Hr: " + obj4.getHrCount());
		System.out.println("Number of Employees: " + obj4.getEcount());
		


	}
}
