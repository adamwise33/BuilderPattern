package StartTestJava.Builders;

import StartTestJava.Product.TheObj;

public class IndividualObjOne implements IObjMaker    
{
	private TheObj theObj;
	public IndividualObjOne() {
		// TODO Auto-generated constructor stub
		this.theObj = new TheObj();
	}

	

	public TheObj GetTheObj()
	{
		return this.theObj; 
	}
	
	public void MakeObjOne()
	{
		theObj.PickObjOne("the first obj");
	}

public void MakeObjTwo()
{
	theObj.PickObjTwo("the second obj");
}

public void MakeObjThree()
{
	theObj.PickObjThree("the third obj");
}




}
