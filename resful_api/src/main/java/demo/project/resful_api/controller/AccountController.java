package demo.project.resful_api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.project.resful_api.model.Account;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    // API trả về danh sách tài khoản dưới dạng JSON
    @GetMapping
    public List<Account> getAccounts() {
        Account account1 = new Account(1L, "Huy Popper", "huy@gmail.com");
        Account account2 = new Account(2L, "Hoang Dung", "dung@gmail.com");
        Account account3 = new Account(3L, "Nam Blue","namBlue@gmail.com");
        return Arrays.asList(account1, account2, account3);
    }
}