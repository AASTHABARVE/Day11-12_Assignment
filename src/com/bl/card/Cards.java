package com.bl.card;

public class Cards {

        static final int NO_OF_PLAYERS = 4;
        static final int NO_OF_CARDS_TO_DISTRIBUTE = 9;
        static final String colon = ":";

        String suitArray[] = {"club","diamond","hearts","spades"};
        String rankArray[] = {"ace","2","3","4","5","6","7","8","9","10","jack","queen","king"};
        String player[][] = new String[NO_OF_PLAYERS][NO_OF_CARDS_TO_DISTRIBUTE];

        int suitCardShuffle(){
            int suitValue = (int)(Math.random()*10)%3;
            return suitValue;
        }

        int rankCardShuffle(){
            int rankValue = (int)(Math.random()*10)%12;
            return rankValue;
        }

        void distibuteCardsToPlayer(){
            for(int i=0; i<NO_OF_PLAYERS; i++){
                for(int j=0; j<NO_OF_CARDS_TO_DISTRIBUTE; j++){
                    int suitCardValue = suitCardShuffle();
                    int rankCardValue = rankCardShuffle();

                    String result = suitArray[suitCardValue]+colon+rankArray[rankCardValue];
                    player[i][j] = result;
                }
            }
        }

        void displayEachPlayerCard(){
            System.out.println("---- CARDS EACH PLAYER HAS ----");
            for (int i=0; i<NO_OF_PLAYERS; i++){
                System.out.println("PLAYER->"+i);
                for(int j=0; j<NO_OF_CARDS_TO_DISTRIBUTE; j++){
                    System.out.println(player[i][j]);
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            Cards cardObject = new Cards();

            cardObject.distibuteCardsToPlayer();
            cardObject.displayEachPlayerCard();
        }
    }

