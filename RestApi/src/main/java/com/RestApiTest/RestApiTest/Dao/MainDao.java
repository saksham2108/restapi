package com.RestApiTest.RestApiTest.Dao;

import com.RestApiTest.RestApiTest.Entity.Employee;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public boolean saveEmployee(String email, String name){
        Employee e = new Employee();
        e.setEmail(email);
        e.setName(name);

        Session session = this.sessionFactory.openSession();
        session.beginTransaction();
        session.save(e);
        session.getTransaction().commit();
        return true;
    }

    public List<Employee> getEmployeeList(){
        Session session = this.sessionFactory.openSession();
        return  session.createCriteria(Employee.class).list();
    }

}
