class Hr extends Employee 
{
	private static int HrCount=0;
    
	Hr(String name, double salary)
	{
        super(name, salary);
		HrCount++;
	}

	public int getHrCount()
	{
		return HrCount;
	}
}
