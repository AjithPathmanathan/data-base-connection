package com.example.task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

@SpringBootApplication
public class Task1Application {

	public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
		SpringApplication.run(Task1Application.class, args);

	}



}
