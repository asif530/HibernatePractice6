package org.controller;


import org.dto.FourWheeler;
import org.dto.TwoWheeler;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/* Inheritance of an entity class
 * Saved the entities which extended the another entity
 * Like vehicle was an entity which was extended in TwoWheeler and FourWheeler
 * In vehicle entity also put another class which was not an entity
 * Saved only twoWheeler and fourWheeler.
 * Found only one table where they were identified separately with a column named DTYPE which was made by hibernate
 * changed the name of column name DTYPE to ClassName. Can define strategy and discriminator(DTYPE) column value
 * Better strategy than SingleTable is TablePerClass strategy. There we dont need the DTYPE and that is good in db perspective
 * Another strategy is JOINED. Here we get 3 tables. The base table and the derived tables. In base tables all the fields of that class
 *      stays.In derived tables class we get only that tables fields and a lining id to the base table. No need of DTYPE but if put above
 *      base class it makes a column in base table
 *
 * */

public class HibernateTest {
    public static void main(String[] args) {

        TwoWheeler twoWheeler = new TwoWheeler();
        FourWheeler fourWheeler = new FourWheeler();

        twoWheeler.setWheel("two");
        twoWheeler.setVehicleName("cycle");
        twoWheeler.getBrand().setBrand("BD");

        fourWheeler.setDoors("four");
        fourWheeler.setVehicleName("car");
        fourWheeler.getBrand().setBrand("Toyota");

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        //with .configure() hibernate.cfg.xml is getting loaded.
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(twoWheeler);
        session.save(fourWheeler);

        session.getTransaction().commit();

        session.close();
    }
}
