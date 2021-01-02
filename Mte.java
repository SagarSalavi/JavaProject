class Mte extends Tester 
{
	private String Designation="ManuelTestingEngineer" ;
	private static int MteCount=0;

	Mte()
	{
		super("Ajay", 15000);
		
		MteCount++;
	}

	public String getDesignation()
	{
		return Designation;
	}

	public int getMteCount()
	{
		return MteCount;
	}

	public void WriteTestCase()
	{
		System.out.println("MTE writes Test Cases ");
	}

	@Override
	public void Work()
	{
		System.out.println("ManuelTestingEngineer work in Company!");
	}
    
  
}
