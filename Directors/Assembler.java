package BuilderPattern.Directors;

import BuilderPattern.Builders.IObjMaker;
import BuilderPattern.Product.TheObj;

public class Assembler 
{

	private IObjMaker objMaker;
	
	public Assembler(IObjMaker objMaker) 
	{
		// TODO Auto-generated constructor stub
		this.objMaker = objMaker;
	}
	
	public TheObj GetTheObj()
	{
		TheObj theObj = new TheObj();
		theObj = objMaker.GetTheObj();
		return theObj;
	}
	
	public void AssembleObj()
	{
		objMaker.GetTheObj();
		objMaker.MakeObjOne();
		objMaker.MakeObjTwo();
		objMaker.MakeObjThree();
	}

}
