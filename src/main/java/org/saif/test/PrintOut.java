package org.saif.test;

/**
 * @author saif
 *
 */
public class PrintOut {
	/*

	 * getName jenkins_12

	 */
	public void getName(){
		System.out.println("my namd is shitt");
	}
	
	public String getName2(int num){
		if(num == 0){
			return "I am num zero";
		}else if(num == 1){
			return "I am num one";
		}else{
			return "I am num " + num; 
		}
	}
}
