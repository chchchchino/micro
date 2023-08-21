package DAO;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import Model.Borrower;

@Repository
public class BorrowerDAOImp  implements BorrowerDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean saveBorrower(Borrower borrower) {
        boolean status=false;
        try {
            sessionFactory.getCurrentSession().save(borrower);
            status=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public List<Borrower> getBorrowers() {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<Borrower> query=currentSession.createQuery("from Borrower", Borrower.class);
        List<Borrower> list=query.getResultList();
        return list;
    }

    @Override
    public boolean deleteBorrower(Borrower borrower) {
        boolean status=false;
        try {
            sessionFactory.getCurrentSession().delete(borrower);
            status=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public List<Borrower> getBorrowerById(Borrower borrower) {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<Borrower> query=currentSession.createQuery("from Borrower where borrowerId=:borrowerId", Borrower.class);
        query.setParameter("borrowerId", borrower.getBorrowerId());
        List<Borrower> list=query.getResultList();
        return list;
    }

    @Override
    public boolean updateBorrower(Borrower borrower) {
        boolean status=false;
        try {
            sessionFactory.getCurrentSession().update(borrower);
            status=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
}  
