package spring_withoutxmlfile_annotation_sim;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SimMain {

	public static void main(String[] args) {
	  ApplicationContext context=new AnnotationConfigApplicationContext(SimConfig.class);
	  Mobile mobile=context.getBean("mobile",Mobile.class);
	  mobile.phone();

	}

}
