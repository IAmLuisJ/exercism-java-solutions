public class Blackjack {

    public int parseCard(String card) {
        return switch (card) {
            case "ace" -> 11;
            case "two" -> 2;
            case "three" -> 3;
            case "four" -> 4;
            case "five" -> 5;
            case "six" -> 6;
            case "seven" -> 7;
            case "eight" -> 8;
            case "nine" -> 9;
            case "ten", "jack", "queen", "king" -> 10;
            default -> 0;
        };
    }

    public boolean isBlackjack(String card1, String card2) {
        if ((parseCard(card1) + parseCard(card2)) == 21 ) {
            return true;
        } else {
            return false;
        }
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if(isBlackjack) {
            if(dealerScore < 10) {
                return "W";
            } else {
                return "S";
            }
        }else {
            return "P";
        }
    }

    public String smallHand(int handScore, int dealerScore) {
        if(handScore >= 17) {
            return "S";
        }
        if(handScore <= 11) {
            return "H";
        }
        if((handScore > 11) && (handScore <= 16)) {
            if(dealerScore >= 7) {
                return "H";
            } else {
                return "S";
            }
        }
        return "H";
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
