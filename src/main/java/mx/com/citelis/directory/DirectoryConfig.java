package mx.com.citelis.directory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DirectoryConfig {


    @Bean
    public ApplicationRunner init(PersonRepository repository){
        return args -> {
            repository.save(new Person("dany@email.com","dany"));
        };
    }
}
