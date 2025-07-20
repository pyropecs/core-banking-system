import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    private int id;
    @OneToMany
    private Account sourceAccount;
    @OneToMany
    private Account destinationAccount;
    private double account;
    private Timestamp createdAt;

    public double getAccount() {
        return account;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public Account getDestinationAccount() {
        return destinationAccount;
    }

    public Account getSourceAccount() {
        return sourceAccount;
    }

    public void setAccount(double account) {
        this.account = account;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public void setDestinationAccount(Account destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    public void setSourceAccount(Account sourceAccount) {
        this.sourceAccount = sourceAccount;
    }
}
