import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pluralsight.service.SpeakerService;

public class Application {

	public static void main(String[] args) {
		//SpeakerService service = new SpeakerServiceImpl();
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		SpeakerService service = applicationContext.getBean("speakerService", SpeakerService.class);
		
		System.out.println(service.findAll().get(0).getFirstName());
	}

}
