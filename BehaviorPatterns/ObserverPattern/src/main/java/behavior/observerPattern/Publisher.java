/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavior.observerPattern;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author User
 */
public class Publisher {
        @SuppressWarnings("FieldMayBeFinal")
	private List<ISubscriber> subscribers;
	private String status;
	
	public Publisher() {
		subscribers = new LinkedList<>();
	}
	
	public void setStatus(String status) { 
		this.status = status;
	}
	
	public void subscribe (ISubscriber s) {
		subscribers.add(s);
	}

	
	public void unsubscribe(ISubscriber s) {
		subscribers.remove(s);
	}
	
	public void notifySubscribers() {
		for(ISubscriber sub: subscribers) {
			sub.sendNotification(status);
		}
	}

    
}
