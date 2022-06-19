package BuilderPattern.Product;

import BuilderPattern.Directors.IObjOutline;

public class TheObj implements IObjOutline 
{

	private String objOne;
	
	private String objTwo;
	
	
	private String objThree;
	
	public void PickObjOne(String objOne)
	{
		this.objOne = objOne;
	}
	
	
	public void PickObjTwo(String objTwo)
	{
		this.objTwo = objTwo;
	}
	
	
	public void PickObjThree(String objThree)
	{
		this.objThree = objThree;
	}
	

public String toString() 
{
		return this.objOne + ", " + this.objTwo + ", " + 	this.objThree;
	}
	

}
