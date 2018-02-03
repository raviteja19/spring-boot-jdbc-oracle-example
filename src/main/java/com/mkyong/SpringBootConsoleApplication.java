package com.mkyong;

import com.mkyong.dao.CustomerRepository;
import com.mkyong.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import java.util.List;

import static java.lang.System.exit;

@SpringBootApplication
public class SpringBootConsoleApplication  {

    @Autowired
    DataSource dataSource;

   

    public static void main(String[] args)  {
        SpringApplication.run(SpringBootConsoleApplication.class, args);
    }

   
}