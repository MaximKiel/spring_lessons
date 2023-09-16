package org.springcourse.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().addAnnotatedClass(Person.class).addAnnotatedClass(Item.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

//            Save item logic
//            Person person1 = session.get(Person.class, 2);
//            Item newItem1 = new Item("Item from hibernate 1", person1);
//            person1.getItems().add(newItem1);
//            session.save(newItem1);
//
//            Save person with item logic
//            Person person2 = new Person("Test person", 30);
//            Item newItem2 = new Item("Item from hibernate 2", person2);
//            person2.setItems(new ArrayList<>(Collections.singletonList(newItem2)));
//            session.save(person2);
//            session.save(newItem2);
//
//            Delete items logic
//            Person person3 = session.get(Person.class, 3);
//            List<Item> items = person3.getItems();
//            for (Item item : items) {
//                session.remove(item);
//            }
//            person3.getItems().clear();
//
//            Delete person logic
//            Person person4 = session.get(Person.class, 2);
//            session.remove(person4);
//            person4.getItems().forEach(i -> i.setOwner(null));

//            Update item owner logic
//            Person person5 = session.get(Person.class, 4);
//            Item item5 = session.get(Item.class, 1);
//            item5.getOwner().getItems().remove(item5);
//            item5.setOwner(person5);
//            person5.getItems().add(item5);

            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }
    }
}
