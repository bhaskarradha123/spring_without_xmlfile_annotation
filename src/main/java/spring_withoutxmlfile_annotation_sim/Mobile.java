package spring_withoutxmlfile_annotation_sim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	@Autowired
	private Sim sim;
	public void phone() {
		sim.sim();
	}

}
