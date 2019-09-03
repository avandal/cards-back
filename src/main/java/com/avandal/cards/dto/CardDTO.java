package com.avandal.cards.dto;

import java.util.Objects;

public class CardDTO {
    private String value;
    private String color;

    public CardDTO(String value, String color) {
        this.value = value;
        this.color = color;
    }

    public String getValue() {
        return value;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CardDTO)) {
            return false;
        }
        CardDTO card = (CardDTO) o;
        return Objects.equals(value, card.value) && Objects.equals(color, card.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, color);
    }

    @Override
    public String toString() {
        return value + color;
    }

}