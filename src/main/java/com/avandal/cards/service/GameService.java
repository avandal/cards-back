package com.avandal.cards.service;

import java.util.List;

import com.avandal.cards.model.Rule;
import com.avandal.cards.model.card.CardEnum;

public interface GameService {
    Rule getRules();

    List<CardEnum> getDeck();
}