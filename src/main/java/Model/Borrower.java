package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="borrower")
public class Borrower {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int borrowerId;
    private String borrowerName;
    private String borrowerEmail;

    public int getBorrowerId() {
        return borrowerId;
    }
    public void setBorrowerId(int student_id) {
        this.borrowerId = borrowerId;
    }
    public String getBorrowerName() {
        return borrowerName;
    }
    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }
    public String getBorrowerEmail() {
        return borrowerEmail;
    }
    public void setBorrowerEmail(String borrowerEmail) {
        this.borrowerEmail = borrowerEmail;
    }
}
