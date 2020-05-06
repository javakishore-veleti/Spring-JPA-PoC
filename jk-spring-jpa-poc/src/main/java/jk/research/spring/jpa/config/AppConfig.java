package jk.research.spring.jpa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
/*
 * Read application-context.xml for additional bean definitions
 */
public class AppConfig {

	@Bean(name = "transactionManager")
	public JpaTransactionManager geJpaTransactionManager() {

		JpaTransactionManager transactionManager = new JpaTransactionManager();

		transactionManager.setEntityManagerFactory(geEntityManagerFactoryBean().getObject());

		return transactionManager;

	}

	@Bean(name = "entityManagerFactory")
	public LocalEntityManagerFactoryBean geEntityManagerFactoryBean() {

		LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();

		// Look at persistence-xml file
		factoryBean.setPersistenceUnitName("LOCAL_PERSISTENCE");

		return factoryBean;

	}

}
