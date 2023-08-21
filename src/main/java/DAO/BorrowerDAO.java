package DAO;

import java.util.List;

import Model.Borrower;

public interface BorrowerDAO {
    public boolean saveBorrower(Borrower borrower);
    public List<Borrower> getBorrowers();
    public boolean deleteBorrower(Borrower borrower);
    public List<Borrower> getBorrowerById(Borrower borrower);
    public boolean updateBorrower(Borrower borrower);
}