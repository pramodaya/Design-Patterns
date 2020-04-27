package ChainOfResponsibility;

public class Person1 implements Chain{

	private Chain nextChain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void checkAnswer(CheckAnswer answer) {
		if(answer.getAnswer() == 1) {
			System.out.println("Person 1 knows the answer");
		}else {
			nextChain.checkAnswer(answer);
		}	
	}
}


