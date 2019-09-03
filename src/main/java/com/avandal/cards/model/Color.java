package com.avandal.cards.model;

public enum Color {
    TREFLE("♣"), COEUR("♥"), PIQUE("♠"), CARREAU("♦");

    private String value;

    private Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}