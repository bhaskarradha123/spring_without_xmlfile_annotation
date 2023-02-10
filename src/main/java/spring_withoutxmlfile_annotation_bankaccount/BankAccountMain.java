package spring_withoutxmlfile_annotation_bankaccount;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class BankAccountMain {

	public static void main(String[] args) {
    ApplicationContext context=new AnnotationConfigApplicationContext(BankAccountConfig.class);
    Person person=context.getBean("person",Person.class);
    person.check();
    
//    Person person1=context.getBean("person",Person.class);
//    
//    System.out.println(person);
//    System.out.println(person1);
      ((AbstractApplicationContext) context).close();
	}

}
