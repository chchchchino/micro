package Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.Borrower;
import Service.BorrowerService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(value="/api")
public class Controller {

    @Autowired
    private BorrowerService borrowerservice;

    @PostMapping("save-borrower")
    public boolean saveBorrower(@RequestBody Borrower borrower) {
        return borrowerservice.saveBorrower(borrower);

    }

    @GetMapping("borrower-list")
    public List<Borrower> allborrowers() {
        return borrowerservice.getBorrowers();

    }

    @DeleteMapping("delete-borrower/{borrowerId}")
    public boolean deleteBorrower(@PathVariable("borrowerId") int borrowerId, Borrower borrower) {
        borrower.setBorrowerId(borrowerId);
        return borrowerservice.deleteBorrower(borrower);
    }

    @GetMapping("borrower/{borrowerId}")
    public List<Borrower> allBorrowersById(@PathVariable("borrowerId") int borrowerId,Borrower borrower) {
        borrower.setBorrowerId(borrowerId);
        return borrowerservice.getBorrowerById(borrower);

    }

    @PostMapping("update-borrower/{borrowerId}")
    public boolean updateBorrower(@RequestBody Borrower borrower,@PathVariable("borrowerId") int borrowerId) {
        borrower.setBorrowerId(borrowerId);
        return borrowerservice.updateBorrower(borrower);
    }
}  