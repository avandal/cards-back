package com.avandal.cards.webservice;

import java.util.List;
import java.util.Optional;

import com.avandal.cards.dto.RuleDTO;
import com.avandal.cards.exception.ExceptionEnum;
import com.avandal.cards.exception.ServiceException;
import com.avandal.cards.mapper.RuleMapper;
import com.avandal.cards.model.Rule;
import com.avandal.cards.model.card.CardEnum;
import com.avandal.cards.service.LoveLetterService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("Love Letter")
@RequestMapping(value = "/loveletter")
@CrossOrigin(origins = "*", methods = { RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.GET, RequestMethod.POST })
public class LoveLetterWS {
    private static final Logger logger = LoggerFactory.getLogger(LoveLetterWS.class);

    @Autowired
    private LoveLetterService loveLetterService;

    @RequestMapping(value = "/rules")
    public ResponseEntity<RuleDTO> getRules() {
        logger.debug("Called getRules");
        Rule rule = loveLetterService.getRules();
        Optional<RuleDTO> optRuleDTO = RuleMapper.ruleToRuleDTO(rule);

        if (optRuleDTO.isEmpty()) {
            throw new ServiceException(ExceptionEnum.INTERNAL_SERVER_ERROR, "The rule are undefined");
        }
        
        return ResponseEntity.status(HttpStatus.OK).body(optRuleDTO.get());
    }

    @RequestMapping("/deck")
    public ResponseEntity<List<CardEnum>> getDeck() {
        logger.debug("Called getDeck");

        return ResponseEntity.status(HttpStatus.OK).body(loveLetterService.getDeck());
    }
}