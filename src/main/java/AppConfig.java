import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;

@Configuration
public class AppConfig {

	@Bean(name="speakerService")
	public SpeakerService getSpeakerService() {
		SpeakerServiceImpl serviceImpl = new SpeakerServiceImpl(getSpeakerRepository());
		
		//SpeakerServiceImpl serviceImpl = new SpeakerServiceImpl();
		//serviceImpl.setRepository(getSpeakerRepository());
		return serviceImpl;
	}
	
	@Bean(name="speakerrepository")
	public SpeakerRepository getSpeakerRepository() {
		return new HibernateSpeakerRepositoryImpl();
	}
	
}
