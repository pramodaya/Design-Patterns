package com.chainOfResponsibility;

public interface Chain {
	
	public void setNextChain(Chain nextChain);	
	
	public void checkAnswer(CheckAnswer request);
}



