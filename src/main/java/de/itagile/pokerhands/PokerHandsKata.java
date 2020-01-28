package de.itagile.pokerhands;

public class PokerHandsKata {

    public Decision decideWinner(String blackHand, String whiteHand) {
        return null;
    }

    public interface Decision {
        Player getWinner();
        HandRanking getBlackRanking();
        HandRanking getWhiteRanking();
    }

    public enum Player {
        BLACK, WHITE, TIE;
    }

    public enum HandRanking {
        HIGH_CARD, STRAIGHT, FLUSH, STRAIGHT_FLUSH;
    }
}
