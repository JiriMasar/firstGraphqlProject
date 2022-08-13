package com.example.firstgraphqlproject.model;

import lombok.NoArgsConstructor;
import lombok.Data;

import java.util.UUID;

@NoArgsConstructor
@Data
public class BankAccountEntity {
    private UUID id;

    private ClientEntity client;

    private Currency currency;
}