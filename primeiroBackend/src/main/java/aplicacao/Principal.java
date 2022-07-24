package aplicacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Principal {

    public static void main(String[] args) {
        System.out.println("Olá mundo");
        SpringApplication.run(Principal.class, args);
    }
}
