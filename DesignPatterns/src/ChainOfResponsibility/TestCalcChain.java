package ChainOfResponsibility;

public class TestCalcChain {

	public static void main(String[] args) {
		
		//make the objects
		Chain chain1 = new Person1();
		Chain chain2 = new Person2();
		Chain chain3 = new Person3();
		
		//make the chain
		chain1.setNextChain(chain2);
		chain2.setNextChain(chain3);
		
		//make the request object
		CheckAnswer request = new CheckAnswer(3);
		
		//pass the object to the chain
		chain1.checkAnswer(request);
	}
}



