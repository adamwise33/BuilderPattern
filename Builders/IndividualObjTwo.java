	package BuilderPattern.Builders;

import BuilderPattern.Product.TheObj;

public class IndividualObjTwo implements IObjMaker {

	private TheObj theObj;	
	public IndividualObjTwo() {
		// TODO Auto-generated constructor stub
		this.theObj = new TheObj();
	}

	public TheObj GetTheObj() {
		// TODO Auto-generated method stub
		return this.theObj;
	}

	public void MakeObjOne() {
		// TODO Auto-generated method stub
		theObj.PickObjOne("the first obj in the second obj");
	}

	public void MakeObjTwo() {
		// TODO Auto-generated method stub
		theObj.PickObjTwo("the second obj in the second obj");
	}

	public void MakeObjThree() {
		// TODO Auto-generated method stub
		theObj.PickObjThree("the third obj in the second obj");
	}
	
}
