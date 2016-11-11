package configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.WriteConcern;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.orm.hibernate4.HibernateExceptionTranslator;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.beans.PropertyVetoException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;


@Configuration
@EnableJpaRepositories(basePackages = "com.loyalcraft.core.dal")
@EnableTransactionManagement
public class AppConfig {

    @Bean
    public ComboPooledDataSource dataSource() {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        try {
            dataSource.setDriverClass("com.mysql.jdbc.Driver");
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/LoyalCraft_database");
        dataSource.setUser("root");
        dataSource.setPassword("root");
        /**
         *  Pool properties
         *  http://www.mchange.com/projects/c3p0/#basic_pool_configuration
         */
        dataSource.setInitialPoolSize(5);
        dataSource.setMaxPoolSize(100);
        dataSource.setMinPoolSize(5);
        dataSource.setAcquireIncrement(1);
        dataSource.setMaxStatements(50);
        dataSource.setMaxConnectionAge(7200);
        dataSource.setMaxIdleTime(900);
        dataSource.setMaxIdleTimeExcessConnections(300);
        return dataSource;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource());
        em.setPackagesToScan(new String[]{"com.loyalcraft.core.dom"});

        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);

        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", "update");
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
        properties.setProperty("hibernate.generate_statistics", "false");
        em.setJpaProperties(properties);

        return em;
    }

    @Bean(name = "transactionManager")
    public PlatformTransactionManager transactionManager() {

        JpaTransactionManager tm = new JpaTransactionManager();
        tm.setEntityManagerFactory(entityManagerFactory().getObject());
        return tm;
    }

    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
        return new PersistenceExceptionTranslationPostProcessor();
    }

    @Bean
    public HibernateExceptionTranslator hibernateExceptionTranslator() {
        return new HibernateExceptionTranslator();
    }


    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        final String DATABASE_NAME = "lc_db";
        List credentials = Arrays.asList(MongoCredential.createCredential("root", DATABASE_NAME, "root".toCharArray()));
        MongoClient mongoClient = new MongoClient(new ServerAddress("localhost:27017"), credentials);
        MongoTemplate template = new MongoTemplate(mongoClient, DATABASE_NAME);
        template.setWriteConcern(WriteConcern.ACKNOWLEDGED);
        // template.setReadPreference(ReadPreference.primaryPreferred())

        return template;
    }
}