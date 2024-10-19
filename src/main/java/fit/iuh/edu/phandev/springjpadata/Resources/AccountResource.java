package fit.iuh.edu.phandev.springjpadata.Resources;

import fit.iuh.edu.phandev.springjpadata.models.Account;
import fit.iuh.edu.phandev.springjpadata.services.AccountServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@RestController
@RequestMapping("/api/account/")
public class AccountResource {
    @Autowired
    private AccountServices accountServices;

    @GetMapping("{amount}")
    @ResponseStatus(HttpStatus.OK)
    public List<Account> getAccount(@PathVariable double amount){
        PageRequest pageRequest = PageRequest.of(0, 10);
        return accountServices.getbyAmount(amount,pageRequest);
    }
    @PostMapping("add")
    @ResponseStatus(HttpStatus.CREATED)
    public Account saveAccounts(@RequestBody Account account){
        return accountServices.saveAccount(account);
    }

}
