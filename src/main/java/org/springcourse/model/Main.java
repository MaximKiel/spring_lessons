package org.springcourse.model;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().addAnnotatedClass(Person.class).addAnnotatedClass(Item.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        try (sessionFactory) {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            Person person = session.get(Person.class, 10);
            System.out.println("Получили человека");

            session.getTransaction().commit();

            System.out.println("Сессия 1 закончилась");

            session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            System.out.println("Открываем 2 сессию");

            person = (Person) session.merge(person);
            Hibernate.initialize(person.getItems());

            session.getTransaction().commit();

            System.out.println("Сессия 2 закончилась");

            System.out.println(person.getItems());
        }
    }
}
