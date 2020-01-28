package de.itagile.pokerhands;

public class PokerHandsKata {

    public Decision decideWinner(String blackHand, String whiteHand) {
        return null;
    }

    public interface Decision {
        public Player getWinner();
        public HandRanking getBlackRanking();
        public HandRanking getWhiteRanking();
    }

    public enum Player {
        BLACK, WHITE, TIE;
    }

    public enum HandRanking {
        STRAIGHT, FLUSH, STRAIGHT_FLUSH;
    }
}
