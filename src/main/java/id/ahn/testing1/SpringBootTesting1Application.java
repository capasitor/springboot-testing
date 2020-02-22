package id.ahn.testing1;

import id.ahn.testing1.domain.Anggota;
import id.ahn.testing1.repository.AnggotaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootTesting1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTesting1Application.class, args);
	}

	//@Bean
	public CommandLineRunner demo(AnggotaRepository repository){
		return (args) -> {
				repository.save(new Anggota("Aris","0812345566","aris@gmail.com"));
			};
	}
}
