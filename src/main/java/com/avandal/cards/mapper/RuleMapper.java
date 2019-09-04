package com.avandal.cards.mapper;

import java.util.Optional;

import com.avandal.cards.dto.RuleDTO;
import com.avandal.cards.model.Rule;

public class RuleMapper {
    public static Optional<RuleDTO> ruleToRuleDTO(Rule rule) {
        if (rule == null) {
            return Optional.empty();
        }

        RuleDTO ruleDTO = new RuleDTO()
            .playerAmout(rule.getPlayerAmout())
            .cardList(rule.getCardList())
            .presentation(rule.getPresentation())
            .proceedings(rule.getProceedings());
        
        return Optional.of(ruleDTO);
    }

    public static Optional<Rule> ruleDTOToRule(RuleDTO ruleDTO) {
        if (ruleDTO == null) {
            return Optional.empty();
        }

        Rule rule = new Rule()
            .playerAmout(ruleDTO.getPlayerAmout())
            .cardList(ruleDTO.getCardList())
            .presentation(ruleDTO.getPresentation())
            .proceedings(ruleDTO.getProceedings());
        
        return Optional.of(rule);
    }
}