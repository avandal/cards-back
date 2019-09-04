package com.avandal.cards.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.avandal.cards.dto.CardDTO;
import com.avandal.cards.model.card.Card;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CardMapper {
    private static final Logger logger = LoggerFactory.getLogger(CardMapper.class);

    //////////////////
    // Model to DTO //
    //////////////////

    public static Optional<CardDTO> cardToCardDTO(Card card) {
        if (card == null) {
            return Optional.empty();
        }

        return Optional.of(new CardDTO()
            .value(card.getValue())
            .color(card.getColor()));
    }

    public static List<CardDTO> cardsToCardDTOs(List<Card> cards) {
        List<CardDTO> cardDTOs = new ArrayList<>();

        if (cards != null) {
            for (Card card : cards) {
                Optional<CardDTO> optCardDTO = cardToCardDTO(card);
                
                if (optCardDTO.isPresent()) {
                    cardDTOs.add(optCardDTO.get());
                } else {
                    logger.warn("A card couldn't be converted to a CardDTO");
                }
            }
        }

        return cardDTOs;
    }
}