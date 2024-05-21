/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package behavior.observerPattern;

/**
 *
 * @author Yoes
 */
public class ObserverPattern {

    public static void main(String[] args) {
		MessageSubscriber ms1 = new MessageSubscriber();
		ms1.setName("MS1");
		MessageSubscriber ms2 = new MessageSubscriber();
		ms2.setName("MS2");
		MessageSubscriber ms3 = new MessageSubscriber();
		ms3.setName("MS3");
                
		EmailSubscriber es1 = new EmailSubscriber();
		es1.setName("ES1");
		EmailSubscriber es2 = new EmailSubscriber();
		es2.setName("ES2");
		Publisher p = new Publisher();
		p.setStatus("New colletion");
		p.subscribe(ms1);
		p.subscribe(ms2);
		p.subscribe(ms3);
		p.subscribe(es1);
		p.subscribe(es2);
		p.notifySubscribers();
    }
}
