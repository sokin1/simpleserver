package com.jkk.study.server.controller;

import com.jkk.study.server.SecurityContext;
import com.jkk.study.server.model.account.AccountRequest;
import com.jkk.study.server.model.account.AccountResponse;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1/account")
public class AccountController {
    @GetMapping
    public @ResponseBody Flux<AccountResponse> getAccounts() {
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public @ResponseBody Mono<AccountResponse> getAccount(@PathVariable String accId, SecurityContext context) {
    }

    @PostMapping
    public @ResponseBody Mono<AccountResponse> addAccount(@RequestBody AccountRequest request, SecurityContext context) {
    }

    @PutMapping
    public @ResponseBody Mono<AccountResponse> updateAccount(@RequestBody AccountRequest request, SecurityContext context) {
    }

    @DeleteMapping(value = "/{id}")
    public @ResponseBody Mono<AccountResponse> deleteAccount(@PathVariable String accId, SecurityContext context) {
    }
}
