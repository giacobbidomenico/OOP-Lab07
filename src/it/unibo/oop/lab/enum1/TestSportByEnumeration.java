package it.unibo.oop.lab.enum1;

import it.unibo.oop.lab.socialnetwork.User;

/**
 * This is going to act as a test for
 * {@link it.unibo.oop.lab.enum1.SportSocialNetworkUserImpl}
 * 
 * 1) Realize the same test as the previous exercise, this time using
 * enumeration Sport
 * 
 * 2) Run it: every test must return true.
 * 
 */
public final class TestSportByEnumeration {

    private TestSportByEnumeration() { }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String... args) {
       /*
        * Create 3 user to test class SportSocialNetworkUserImpl 
        */
       final SportSocialNetworkUserImpl<User> marioRossi = 
    		   new SportSocialNetworkUserImpl<>("Mario","Rossi","mario01",18);
       
       final SportSocialNetworkUserImpl<User> simoneRastelli = 
    		   new SportSocialNetworkUserImpl<>("Simone","Rastelli","simo99",23);
       
       final SportSocialNetworkUserImpl<User> giacomoMatti = 
    		   new SportSocialNetworkUserImpl<>("Giacomo","Matti","giaco12",56);
       
       System.out.println("[TEST - START]");
       
       System.out.println("[INSERT 3 SPORT FOR EACH USER]");
       
       /*
        * Add to each user 2 different sports
        */
       
       marioRossi.addSport(Sport.MOTOGP);
       marioRossi.addSport(Sport.BIKE);
       marioRossi.addSport(Sport.SOCCER);
       
       simoneRastelli.addSport(Sport.TENNIS);
       simoneRastelli.addSport(Sport.VOLLEY);
       simoneRastelli.addSport(Sport.SOCCER);
       
       giacomoMatti.addSport(Sport.F1);
       giacomoMatti.addSport(Sport.BIKE);
       giacomoMatti.addSport(Sport.SOCCER);
       
       /*
        * Verify if each user like/dislike a sport
        */
       
       System.out.println("[CONTROL IF A SPORT BELONGS TO A USER]");
       
       System.out.println("Mario Rossi like MOTOGP:" + 
    		   marioRossi.hasSport(Sport.MOTOGP));
       System.out.println("Mario Rossi like VOLLEY:" + 
    		   marioRossi.hasSport(Sport.VOLLEY));
       
       System.out.println("Simone Rastelli like TENNIS:" + 
    		   simoneRastelli.hasSport(Sport.TENNIS));
       System.out.println("Simone Rastelli like BIKE:" + 
    		   simoneRastelli.hasSport(Sport.BIKE));
       
       System.out.println("Giacomo Matti like F1:" + 
    		   giacomoMatti.hasSport(Sport.F1));
       System.out.println("Giacomo Matti like VOLLEY:" + 
    		   giacomoMatti.hasSport(Sport.VOLLEY));
       
       System.out.println("[TEST - END]");
    }
}
