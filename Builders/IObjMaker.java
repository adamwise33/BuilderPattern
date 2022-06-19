package BuilderPattern.Builders;

import BuilderPattern.Product.TheObj;

public interface IObjMaker 
{
	TheObj GetTheObj();
	
	void MakeObjOne();
	
	void MakeObjTwo();
	
	void MakeObjThree();
}
