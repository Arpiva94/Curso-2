package com.mx.mex.Config;
import java.util.Properties;
import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mx.mex.Entities.CatEstados;
import com.mx.mex.Entities.CatRoles;
import com.mx.mex.Entities.UsuariosAdmin;
import com.mx.mex.Entities.empleados;



@Configuration
@ComponentScan("com.mx.mex")
@EnableTransactionManagement
public class ApplicationContextConfig {
	private Properties getHibernateProperties() {
    	Properties properties = new Properties();
    	properties.put("hibernate.show_sql", "true");
//    	properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
    	properties.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
    	return properties;
    }
  
  
    @Autowired
    @Bean(name = "sessionFactory")
    public SessionFactory getSessionFactory(DataSource dataSource) {
    	LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
    	sessionBuilder.addProperties(getHibernateProperties());
    	sessionBuilder.addAnnotatedClasses(UsuariosAdmin.class, CatEstados.class,CatRoles.class, empleados.class); // Declarar all clases Entitys para poder hacer las transacciones por Hibernate.
    	return sessionBuilder.buildSessionFactory();
    }
    @Autowired
	@Bean(name = "transactionManager")//commit para confirmar
	public HibernateTransactionManager getTransactionManager(
			SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(
				sessionFactory);

		return transactionManager;
	}
    
    
}//fin de la clase
