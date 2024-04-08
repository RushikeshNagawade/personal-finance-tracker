package com.personal.configuration;

import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@org.springframework.context.annotation.Configuration
@EnableTransactionManagement
public class Configuration {

    @Bean
    SessionFactory sessionFactory(HibernateEntityManagerFactory hibernateEntityManagerFactory)
    {

        return  hibernateEntityManagerFactory.getSessionFactory();
    }

}
