package com.example.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.demo.domains.User;
import com.example.demo.repositories.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();

        User hugo = new User(null, "valdemor", "Hugo Pereira", "hugo@email.com", "123456", "Um cara fenomenal", Arrays.asList("img1.png","img2.png","img3.png"));

        User maria = new User(null, "valquiria", "Maria de Solza", "maira@email.com", "password", "Adoro viajar, ir ao salão de beleza!", Arrays.asList("img1.png","img2.png"));

        User cezar = new User(null, "olaf", "Cezar Medeiros", "cezar@email.com", "777888", "Sou estudante, e gosto de ler livros!", Arrays.asList("img1.png"));
		
		userRepository.saveAll(Arrays.asList(hugo, maria, cezar));
    }

}
