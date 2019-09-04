package com.avandal.cards.model.card;

public enum Card {

    /////////////////
    // Normal deck //
    /////////////////

    AS_TREFLE("1", Color.TREFLE), DEUX_TREFLE("2", Color.TREFLE), TROIS_TREFLE("3", Color.TREFLE),
    QUATRE_TREFLE("4", Color.TREFLE), CINQ_TREFLE("5", Color.TREFLE), SIX_TREFLE("6", Color.TREFLE),
    SEPT_TREFLE("7", Color.TREFLE), HUIT_TREFLE("8", Color.TREFLE), NEUF_TREFLE("9", Color.TREFLE),
    DIX_TREFLE("10", Color.TREFLE), VALET_TREFLE("V", Color.TREFLE), DAME_TREFLE("D", Color.TREFLE),
    ROI_TREFLE("R", Color.TREFLE),

    AS_COEUR("1", Color.COEUR), DEUX_COEUR("2", Color.COEUR), TROIS_COEUR("3", Color.COEUR),
    QUATRE_COEUR("4", Color.COEUR), CINQ_COEUR("5", Color.COEUR), SIX_COEUR("6", Color.COEUR),
    SEPT_COEUR("7", Color.COEUR), HUIT_COEUR("8", Color.COEUR), NEUF_COEUR("9", Color.COEUR),
    DIX_COEUR("10", Color.COEUR), VALET_COEUR("V", Color.COEUR), DAME_COEUR("D", Color.COEUR),
    ROI_COEUR("R", Color.COEUR),

    AS_PIQUE("1", Color.PIQUE), DEUX_PIQUE("2", Color.PIQUE), TROIS_PIQUE("3", Color.PIQUE),
    QUATRE_PIQUE("4", Color.PIQUE), CINQ_PIQUE("5", Color.PIQUE), SIX_PIQUE("6", Color.PIQUE),
    SEPT_PIQUE("7", Color.PIQUE), HUIT_PIQUE("8", Color.PIQUE), NEUF_PIQUE("9", Color.PIQUE),
    DIX_PIQUE("10", Color.PIQUE), VALET_PIQUE("V", Color.PIQUE), DAME_PIQUE("D", Color.PIQUE),
    ROI_PIQUE("R", Color.PIQUE),

    AS_CARREAU("1", Color.CARREAU), DEUX_CARREAU("2", Color.CARREAU), TROIS_CARREAU("3", Color.CARREAU),
    QUATRE_CARREAU("4", Color.CARREAU), CINQ_CARREAU("5", Color.CARREAU), SIX_CARREAU("6", Color.CARREAU),
    SEPT_CARREAU("7", Color.CARREAU), HUIT_CARREAU("8", Color.CARREAU), NEUF_CARREAU("9", Color.CARREAU),
    DIX_CARREAU("10", Color.CARREAU), VALET_CARREAU("V", Color.CARREAU), DAME_CARREAU("D", Color.CARREAU),
    ROI_CARREAU("R", Color.CARREAU);

    private String value;
    private Color color;

    private Card(String value, Color color) {
        this.value = value;
        this.color = color;
    }

    public String getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }
}