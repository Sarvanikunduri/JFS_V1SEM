package com.skillnext2;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentApp {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Student student = new Student(1, "Sarvani", 21);
        session.persist(student);

        tx.commit();
        session.close();

        System.out.println("Student record inserted successfully!");
    }
}

