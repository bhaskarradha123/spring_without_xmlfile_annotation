package spring_withoutxmlfile_annotation_bankaccount;

import org.springframework.stereotype.Component;

@Component
public class ICICI implements BankAccount {

	public void balance() {
		System.out.println("ICICI balance is 1000....");

	}

}
