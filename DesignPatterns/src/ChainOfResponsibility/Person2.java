package ChainOfResponsibility;

public class Person2 implements Chain{

	private Chain nextChain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;		
	}

	@Override
	public void checkAnswer(CheckAnswer answer) {
		if(answer.getAnswer() == 2) {
			System.out.println("Person 2 knows the answer");
		}else {
			nextChain.checkAnswer(answer);
		}
	}
}




