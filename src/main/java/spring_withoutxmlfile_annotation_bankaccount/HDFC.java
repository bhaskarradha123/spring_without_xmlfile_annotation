package spring_withoutxmlfile_annotation_bankaccount;

import org.springframework.stereotype.Component;

@Component
public class HDFC implements BankAccount {

	public void balance() {
		System.out.println("HDFC balance is 15000......");

	}

}
