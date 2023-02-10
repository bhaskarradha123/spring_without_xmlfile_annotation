package spring_withoutxmlfile_annotation_bankaccount;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton") //==for object creation singleton gives same address and 
                    //prototype gives different address
                    //by default it is singleton
public class Person {
	@Autowired
	@Qualifier("HDFC") //used to specify the object
	private BankAccount account;

	public void check() {
		account.balance();
	}
	
	
	@PostConstruct  //it load after the object creation ---it print if we call object or not
	public void checkbalanec() {
		System.out.println("you need to check balance");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("tnx for checking");
	}
}
