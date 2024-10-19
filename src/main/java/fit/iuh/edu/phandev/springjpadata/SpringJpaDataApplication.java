package fit.iuh.edu.phandev.springjpadata;

import fit.iuh.edu.phandev.springjpadata.models.Account;
import fit.iuh.edu.phandev.springjpadata.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;

import java.util.Random;

@SpringBootApplication
public class SpringJpaDataApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaDataApplication.class, args);
	}

	@Autowired
	private AccountRepository accountRepository;

	@Override
	public void run(String... args) throws Exception {
//		Random r= new Random();
//		for(long i=1;i<100;i++){
//			accountRepository.save(new Account(i,"username"+i,r.nextDouble(1000)));
//		}
//		accountRepository.findAll().forEach(System.out::println);
//		PageRequest pageRequest = PageRequest.of(0, 10);
////		accountRepository.findByAmountGreaterThan(500, pageRequest).forEach(System.out::println);
	}
}
