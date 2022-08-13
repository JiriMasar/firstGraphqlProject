package com.example.firstgraphqlproject.mutation;

import com.example.firstgraphqlproject.model.Currency;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateBankAccountInput {

    private Currency currency;
}