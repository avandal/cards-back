package com.avandal.cards.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Rule {
    private String playerAmout;
    private String cardList;
    private List<String> presentation;
    private List<String> proceedings;

    public Rule() {
    }

    public Rule(String playerAmout, String cardList, List<String> presentation, List<String> proceedings) {
        this.playerAmout = playerAmout;
        this.cardList = cardList;
        this.presentation = presentation;
        this.proceedings = proceedings;
    }

    public String getPlayerAmout() {
        return this.playerAmout;
    }

    public void setPlayerAmout(String playerAmout) {
        this.playerAmout = playerAmout;
    }

    public String getCardList() {
        return this.cardList;
    }

    public void setCardList(String cardList) {
        this.cardList = cardList;
    }

    public List<String> getPresentation() {
        return this.presentation;
    }

    public void setPresentation(List<String> presentation) {
        this.presentation = presentation;
    }

    public List<String> getProceedings() {
        return this.proceedings;
    }

    public void setProceedings(List<String> proceedings) {
        this.proceedings = proceedings;
    }

    public Rule playerAmout(String playerAmout) {
        this.playerAmout = playerAmout;
        return this;
    }

    public Rule cardList(String cardList) {
        this.cardList = cardList;
        return this;
    }

    public Rule presentation(List<String> presentation) {
        this.presentation = presentation;
        return this;
    }

    public Rule addPresentation(String sentence) {
        if (presentation == null) {
            presentation = new ArrayList<>();
        }

        presentation.add(sentence);
        return this;
    }

    public Rule proceedings(List<String> proceedings) {
        this.proceedings = proceedings;
        return this;
    }

    public Rule addProceeding(String proceeding) {
        if (proceedings == null) {
            proceedings = new ArrayList<>();
        }

        proceedings.add(proceeding);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Rule)) {
            return false;
        }
        Rule rule = (Rule) o;
        return Objects.equals(playerAmout, rule.playerAmout) && Objects.equals(cardList, rule.cardList)
                && Objects.equals(presentation, rule.presentation) && Objects.equals(proceedings, rule.proceedings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerAmout, cardList, presentation, proceedings);
    }

    @Override
    public String toString() {
        return "{" + " playerAmout='" + getPlayerAmout() + "'" + ", cardList='" + getCardList() + "'"
                + ", presentation='" + getPresentation() + "'" + ", proceedings='" + getProceedings() + "'" + "}";
    }
}