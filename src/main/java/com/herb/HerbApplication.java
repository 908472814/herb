package com.herb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.herb.repositories")
@EntityScan(basePackages = "com.herb.domain")
@EnableTransactionManagement
@ServletComponentScan(basePackages = "com.herb.servlet,com.herb.filter,com.herb.listener")
public class HerbApplication  extends SpringBootServletInitializer{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HerbApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HerbApplication.class, args);
	}

//	@Bean
//	public DataSource dataSource() {
//		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
//		return builder.setType(EmbeddedDatabaseType.H2).build();
//	}
//
//	@Bean
//	public EntityManagerFactory entityManagerFactory() {
//		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//		vendorAdapter.setGenerateDdl(true);
//		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
//		factory.setJpaVendorAdapter(vendorAdapter);
//		factory.setPackagesToScan("com.herb.domain");
//		factory.setDataSource(dataSource());
//		factory.afterPropertiesSet();
//		return factory.getObject();
//	}
//
//	@Bean
//	public PlatformTransactionManager transactionManager() {
//		JpaTransactionManager txManager = new JpaTransactionManager();
//		txManager.setEntityManagerFactory(entityManagerFactory());
//		return txManager;
//	}
	
}
