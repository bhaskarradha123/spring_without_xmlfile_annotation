package spring_withoutxmlfile_annotation_zoo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Lion implements Animal {

	public void eat() {
		System.out.println("eat meat");

	}

}
