package spring_withoutxmlfile_annotation_zoo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnimalMain {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AnimalConfig.class);
		Zoo zoo=context.getBean("zoo",Zoo.class);
		zoo.food();

	}

}
