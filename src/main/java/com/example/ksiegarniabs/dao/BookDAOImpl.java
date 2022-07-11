package com.example.ksiegarniabs.dao;

import com.example.ksiegarniabs.entity.Ksiazka;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import java.util.List;

@Repository
public class BookDAOImpl implements BookDAO {
    //automatyczne wykorzystanie beana sessionFactory
    @Autowired
    private SessionFactory sessionFactory;
    @Override
//pobranie i zwrocenie wszystkich ksiazek z bazy za pomoca zapytania HQL:
    public List<Ksiazka> getBooks() {
//sesja hibertabe
        Session currentSession = sessionFactory.getCurrentSession();
//zapytanie
        Query<Ksiazka> query = currentSession.createQuery(" from Ksiazka", Ksiazka.class);
        List<Ksiazka> books = query.getResultList();
        return books ;
    }
    @Override
//zapis ksiazki do bazy:
    public void saveBook(Ksiazka ksiazka) {
        Session session = sessionFactory.getCurrentSession();
        session.save(ksiazka);
    }

}