package com.example.firstgraphqlproject.mutation;

import com.example.firstgraphqlproject.model.BankAccountEntity;
import com.example.firstgraphqlproject.model.Currency;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Slf4j
public class BankAccountMutation implements GraphQLMutationResolver {

    public BankAccountEntity createBankAccount(CreateBankAccountInput input) {
        log.info("Creating bank account for {}", input);

        var bankAccount = new BankAccountEntity();
        bankAccount.setId(UUID.randomUUID());
        bankAccount.setCurrency(Currency.CZK);

        return bankAccount;
    }
}
