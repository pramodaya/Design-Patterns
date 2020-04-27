package com.chainOfResponsibility;

public class Person3 implements Chain{

	private Chain nextChain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;		
	}

	@Override
	public void checkAnswer(CheckAnswer answer) {
		if(answer.getAnswer() == 3) {
			System.out.println("Person 3 knows the answer");
		}else {
			nextChain.checkAnswer(answer);
		}		
	}	
}



