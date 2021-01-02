class SnrDev extends Developer 
{
	private String Designation="SeniorDeveloper" ;
	private static int SnrDevCount=0;

	SnrDev()
	{
		super("Ramesh", 25000);
		
		SnrDevCount++;
	}

	public String getDesignation()
	{
		return Designation;
	}

	public int getSnrDevCount()
	{
		return SnrDevCount;
	}

	public void CreateHLD()
	{
		System.out.println("Snrdev designs Code ");
	}

	@Override
	public void Work()
	{
		System.out.println("Senior Developer work in Company!");
	}
    
  

     
}
