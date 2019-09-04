package com.avandal.cards.dto;

import java.util.List;
import java.util.Objects;

public class RuleDTO {
    private String playerAmout;
    private String cardList;
    private List<String> presentation;
    private List<String> proceedings;

    public RuleDTO() {
    }

    public RuleDTO(String playerAmout, String cardList, List<String> presentation, List<String> proceedings) {
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

    public RuleDTO playerAmout(String playerAmout) {
        this.playerAmout = playerAmout;
        return this;
    }

    public RuleDTO cardList(String cardList) {
        this.cardList = cardList;
        return this;
    }

    public RuleDTO presentation(List<String> presentation) {
        this.presentation = presentation;
        return this;
    }

    public RuleDTO proceedings(List<String> proceedings) {
        this.proceedings = proceedings;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof RuleDTO)) {
            return false;
        }
        RuleDTO ruleDTO = (RuleDTO) o;
        return Objects.equals(playerAmout, ruleDTO.playerAmout) && Objects.equals(cardList, ruleDTO.cardList)
                && Objects.equals(presentation, ruleDTO.presentation)
                && Objects.equals(proceedings, ruleDTO.proceedings);
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