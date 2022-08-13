package com.example.firstgraphqlproject.model;

public enum Currency {
    USD("USD"),
    EUR("EUR"),
    CZK("CZK"),
    CHF("CHF"),
    GBP("GBP"),
    JPY("JPY");

    private final String label;

    private Currency(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
