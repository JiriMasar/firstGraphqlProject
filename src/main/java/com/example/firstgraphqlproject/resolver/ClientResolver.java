package com.example.firstgraphqlproject.resolver;

import com.example.firstgraphqlproject.model.BankAccountEntity;
import com.example.firstgraphqlproject.model.ClientEntity;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class ClientResolver implements GraphQLResolver<BankAccountEntity> {

    public ClientEntity client(BankAccountEntity bankAccount) {
        log.info("Getting a client related to a bank account %s", bankAccount.getId());

        return new ClientEntity(
                UUID.randomUUID(),
                "Tomas",
                "Svojanovsky"
        );
    }
}