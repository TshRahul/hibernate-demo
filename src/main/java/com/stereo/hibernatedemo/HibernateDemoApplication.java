package com.stereo.hibernatedemo;

import com.mysql.cj.jdbc.Driver;
import com.stereo.hibernatedemo.model.Song;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@SpringBootApplication
public class HibernateDemoApplication {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Song.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();


		Song song1 = new Song();
		song1.setSongId(1);
		song1.setSongName("test song 1");
		song1.setSinger("Singer 1");

		session.beginTransaction();

		session.persist(song1);

		session.getTransaction().commit();

		System.out.println("Data Inserted");
	}

}
