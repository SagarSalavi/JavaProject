class Developer extends Employee 
{
	private static int DevCount=0;
    
	Developer(String name, double salary)
	{
        super(name, salary);
		DevCount++;
	}

	public int getDevCount()
	{
		return DevCount;
	}


}
