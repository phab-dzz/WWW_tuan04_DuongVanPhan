package fit.iuh.edu.phandev.springjpadata.services;

import fit.iuh.edu.phandev.springjpadata.models.Account;
import fit.iuh.edu.phandev.springjpadata.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServices {
    @Autowired
    private AccountRepository accountRepository;

    public List<Account> getbyAmount(double amount, Pageable pageable){
        return accountRepository.findByAmountGreaterThan(amount,pageable);

    }
    public  Account saveAccount(Account account){
        return accountRepository.save(account);
    }

}
