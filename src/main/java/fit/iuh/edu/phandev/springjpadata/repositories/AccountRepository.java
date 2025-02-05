package fit.iuh.edu.phandev.springjpadata.repositories;

import fit.iuh.edu.phandev.springjpadata.models.Account;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    public List<Account> findByAmountGreaterThan(double amount, Pageable pageable);



}
