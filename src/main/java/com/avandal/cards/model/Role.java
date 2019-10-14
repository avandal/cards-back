package com.avandal.cards.model;

public enum Role {
    admin("admin"), guest("guest");

    private String title;

    private Role(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
