package com.example.firstgraphqlproject.resolver;

import com.example.firstgraphqlproject.model.BankAccountEntity;
import com.example.firstgraphqlproject.model.ClientEntity;
import com.example.firstgraphqlproject.model.Currency;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {

    public BankAccountEntity bankAccount(UUID id) {
        log.info("Getting a bank account %s", id);

        var bankAccount = new BankAccountEntity();
        bankAccount.setId(id);
        bankAccount.setCurrency(Currency.CZK);

        return bankAccount;
    }
}