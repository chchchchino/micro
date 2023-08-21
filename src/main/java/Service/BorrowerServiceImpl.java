package Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import DAO.BorrowerDAO;
import Model.Borrower;

@Service
@Transactional
public class BorrowerServiceImpl implements BorrowerService {

    @Autowired
    private BorrowerDAO borrowerdao;

    @Override
    public boolean saveBorrower(Borrower borrower) {
        return borrowerdao.saveBorrower(borrower);
    }

    @Override
    public List<Borrower> getBorrowers() {
        return borrowerdao.getBorrowers();
    }

    @Override
    public boolean deleteBorrower(Borrower borrower) {
        return borrowerdao.deleteBorrower(borrower);
    }

    @Override
    public List<Borrower> getBorrowerById(Borrower borrower) {
        return borrowerdao.getBorrowerById(borrower);
    }

    @Override
    public boolean updateBorrower(Borrower borrower) {
        return borrowerdao.updateBorrower(borrower);
    }

}
