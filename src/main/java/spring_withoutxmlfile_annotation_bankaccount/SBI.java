package spring_withoutxmlfile_annotation_bankaccount;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SBI implements BankAccount {

	public void balance() {
		System.out.println("SBI balance is 10000.....");

	}

}
