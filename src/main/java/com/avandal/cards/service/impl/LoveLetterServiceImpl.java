package com.avandal.cards.service.impl;

import com.avandal.cards.model.Rule;
import com.avandal.cards.service.LoveLetterService;

import org.springframework.stereotype.Service;

@Service
public class LoveLetterServiceImpl implements LoveLetterService {

    @Override
    public Rule getRules() {
        return new Rule()
            .playerAmout("3-4")
            .cardList("1(5), 2(2), 3(2), 4(2), 5(2), 6(1), 7(1), 8(1)")

            .addPresentation("Chaque joueur joue une carte parmi les deux qu'il a en main, chaque carte a un effet particulier.") 
            .addPresentation("Le dernier joueur vivant remporte la manche.")

            .addProceeding("On commence par mélanger le jeu, et distribuer une carte à chaque joueur.")
            .addProceeding("On écarte ensuite une carte face cachée. Si vous êtes trois, écartez une carte supplémentaire, face visible.")
            .addProceeding("Au début de son tour, un joueur pioche une carte et choisit de jouer une parmi les deux dans sa main.")
            .addProceeding("Chaque carte a un effet particulier :")
            .addProceeding("1 - Désignez un joueur non protégé, si vous devinez la valeur de sa carte il perd. **Vous ne pouvez pas demander le 1.**")
            .addProceeding("2 - Désignez un joueur non protégé, vous regardez sa carte.")
            .addProceeding("3 - Désignez un joueur non protégé, vous faites un duel. Le joueur à la plus faible carte perd. En cas d'égalité il ne se passe rien.")
            .addProceeding("4 - Vous êtes protégé. Personne ne peut vous désigner jusqu'au prochain tour.")
            .addProceeding("5 - Désignez un joueur non protégé (vous pouvez vous désigner), vous vous défaussez de votre carte et en piochez une autre.")
            .addProceeding("6 - Désigner un joueur non protégé, vous échangez votre carte avec lui.")
            .addProceeding("7 - Cette carte n'a aucun effet, **mais vous devez la jouer obligatoirement si vous avez un 5 ou un 6.**")
            .addProceeding("8 - Si vous jouez cette carte, vous perdez.")
            .addProceeding("S'il reste plusieurs joueurs et que la pioche est vide, le gagnant est désigné par un duel général.")
            .addProceeding("Si un joueur est défaussé et que la pioche est vide, il récupère la carte écartée face cachée.")
            .addProceeding("En cas d'égalité sur le duel général, le gagnant est désigné sur le nombre de cartes qu'il a jouées.")
            .addProceeding("En cas d'égalité sur ce dernier cas, le gagnant est désigné sur la somme de la valeur des cartes jouées.");
    }

}