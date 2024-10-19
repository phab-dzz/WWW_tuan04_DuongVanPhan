package fit.iuh.edu.phandev.springjpadata;

import org.springframework.boot.SpringApplication;

public class TestSpringJpaDataApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringJpaDataApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
