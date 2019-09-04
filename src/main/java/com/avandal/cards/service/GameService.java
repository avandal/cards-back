package com.avandal.cards.service;

import java.util.List;

import com.avandal.cards.model.Rule;
import com.avandal.cards.model.card.Card;

public interface GameService {
    /**
     * Return the rules of the current game.<br />
     * Front is able to parse markdown tags like this:
     * <ul>
     *  <li>Use '*' to set italic a sentence</li>
     *  <li>Use '**' to set bold a sentence</li>
     *  <li>Use '__' to set underline a sentence</li>
     *  <li>Use '~~' to set strike a sentence</li>
     * </ul>
     * @return
     */
    Rule getRules();

    /**
     * Return the full deck (not shuffled) of the current game.
     * @return
     */
    List<Card> getDeck();
}