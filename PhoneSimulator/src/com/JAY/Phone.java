package com.JAY;

public class Phone {

	private boolean powerStatus; //to keep track of power status
	private String buffer;  //to keep track of the buttons user has pressed


	public Phone(){
		powerStatus=false;
		buffer="";
	}
	
	public void pressPower(){
		if(powerStatus==false){
			powerStatus=true;
		}else{
			powerStatus=false;
		}
		display("The power is "+(powerStatus?"on":"off"));
	}
	
	public void pressTalk(){
		display("Dialing "+buffer);
	}
	
	public void pressHangUp(){
		buffer="";
		display("Hung up");
	}
	
	public void pressNumber(int number){
		buffer=buffer+number;
		display();
	}
	
	public void display(){
		display(buffer);
	}
	
	public void display(String message){
		System.out.println(message);
	}

}
