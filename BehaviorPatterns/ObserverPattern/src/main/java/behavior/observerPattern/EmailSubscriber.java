/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavior.observerPattern;

/**
 *
 * @author User
 */
public class EmailSubscriber implements ISubscriber{

	public String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void sendNotification(Object context) {
		System.out.println("Email update sent in "+name+". content, "+context);
	}

}