package com.example.springboottutorialdto;

import com.example.springboottutorialdto.model.Location;
import com.example.springboottutorialdto.model.User;
import com.example.springboottutorialdto.repository.LocationRepository;
import com.example.springboottutorialdto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootTutorialDtoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTutorialDtoApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void run(String... args) throws Exception {

		Location location = new Location();

		location.setPlace("Madrid");
		location.setDescription("Beautifully place to live");
		location.setLatitude(40.1);
		location.setLongitude(30.6);

		locationRepository.save(location);

		User user = new User();
		user.setFirstName("Jaime");
		user.setLastName("Higueras");
		user.setEmail("jaime@email.com");
		user.setPassword("password");
		user.setLocation(location);

		userRepository.save(user);

	}
}
