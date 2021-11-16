/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {

    /*
     * Basket
     */
    BASKET(5, "basketball", Place.INDOOR),
 
    /*
     * Volley
     */
    VOLLEY(6, "volleyball", Place.INDOOR),
 
    /*
     * Tennis
     */
    TENNIS(1, "tennis", Place.OUTDOOR),
 
    /*
     * Bike
     */
    BIKE(1, "bike", Place.OUTDOOR),
 
    /*
     * F1
     */
    F1(1, "formula 1", Place.OUTDOOR),
 
    /*
     * Motogp
     */
    MOTOGP(1, "moto gp", Place.OUTDOOR),
 
    /*
     * Soccer
     */
    SOCCER(11, "soccer", Place.OUTDOOR);
        
	private final int numTeamPeople;
	private final String nameSport;
	private final Place place;
	
	/**
     * Builds a new {@link Sport}.
     * 
     * @param noTeamMembers
     *            the number of people playing a sport
     * @param actualName
     *            the name of a sport
     * @param place
     *            the place where a sport is practiced
     */
	Sport(final int noTeamMembers, final String actualName, final Place place){
		this.numTeamPeople = noTeamMembers;
		this.nameSport = actualName;
		this.place = place;
	}
    
	/* 
     * Must return true only if called on individual sports
     *
     * @return true if sport is individual, false otherwise
     */
	public boolean isIndividualSport() {
		return this.numTeamPeople == 1;
	}
	
    /* 
     * Must return true in case the sport is practices indoor
     * 
     * @return true if a sport is practices indoor,false otherwise
     */
	public boolean isIndoorSport() {
		return this.place.equals(Place.INDOOR);
	}
	
    /*
     * Must return the place where this sport is practiced
     * 
     * @return the place where a sport is practiced
     */
	public Place getPlace() {
		return this.place;
	}
	
    /*
     * Returns the string representation of a sport
     * 
     * @return the string representation of a sport
     */
	public String toString() {
		return "Sport: [ name:" + this.nameSport
				+ " number of players:" + this.numTeamPeople
				+ " place:" + this.place;
	}
	
}
