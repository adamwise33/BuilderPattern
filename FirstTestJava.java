			package BuilderPattern;

	import BuilderPattern.Builders.*;
//import StartTestJava.Builders.IndividualObjOne;
import BuilderPattern.Directors.Assembler;
import BuilderPattern.Product.TheObj;

public class BuilderPattern {

	public FirstTest() 
	{
			//TODO Auto-generated constructor stub
		
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i = 0; i < 2; i++)
{
		System.out.println("hi there");
}
// Creating the built object.
IndividualObjOne myObj = new IndividualObjOne();
Assembler assembler = new Assembler(myObj);
assembler.AssembleObj();
	
TheObj theObj = assembler.GetTheObj();

System.out.println(theObj.toString());


IndividualObjTwo iot = new IndividualObjTwo();
Assembler assemblerTwo = new Assembler(iot);
assemblerTwo.AssembleObj();

TheObj theObjTwo = assemblerTwo.GetTheObj();

System.out.println(theObjTwo.toString());

	}

}
