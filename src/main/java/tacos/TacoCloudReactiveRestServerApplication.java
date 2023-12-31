package tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer;
import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator;

import io.r2dbc.spi.ConnectionFactory;

@SpringBootApplication
public class TacoCloudReactiveRestServerApplication {

	@Bean
	ConnectionFactoryInitializer initializer(ConnectionFactory connectionFactory) {
		ConnectionFactoryInitializer initializer = new ConnectionFactoryInitializer();
		initializer.setConnectionFactory(connectionFactory);
		ResourceDatabasePopulator rdp = new ResourceDatabasePopulator(new ClassPathResource("schema.sql"));
		rdp.addScript(new ClassPathResource("data.sql"));
		initializer.setDatabasePopulator(rdp);
		return initializer;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TacoCloudReactiveRestServerApplication.class, args);
	}
	
}
