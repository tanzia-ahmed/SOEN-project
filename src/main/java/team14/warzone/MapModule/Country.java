package team14.warzone.MapModule;

/**
 * This class consists the information about the country
 * @author razashaik
 * @version 1.0
 */

public class Country {

    /**
     * Unique ID of country
     */
    private String ID;
    /**
     * Continent containing the country
     */
    private String l_ContinentName;
    /**
     * Name of current owner
     */
    private String d_CurrentOwner;
    /**
     * Number of armies on the country
     */
    private int NUMOFARMIES;

    /**
     * Constructor for Country
     * @param ID unique ID
     * @param l_ContinentName Continent Name
     * @param d_CurrentOwner Current Owner
     * @param NUMOFARMIES Number of Armies
     */
    public Country(String ID, String l_ContinentName, String d_CurrentOwner, int NUMOFARMIES){
        this.ID = ID;
        this.l_ContinentName = l_ContinentName;
        this.d_CurrentOwner = d_CurrentOwner;
        this.NUMOFARMIES = NUMOFARMIES;
    }

    /**
     * Returns the ID
     * @return A string with ID
     */
    public String getID() {
        return ID;
    }

    /**
     * Sets the ID
     * @param p_CountryID String with ID
     */
    public void setID(String p_CountryID) {
        this.ID = p_CountryID;
    }

    /**
     * Returns the continent name which contains the country
     * @return A string with continent name
     */
    public String getContinentName() {
        return l_ContinentName;
    }

    /**
     * Sets the control value
     * @param p_ContinentName with control value
     */
    public void setControlValue(String p_ContinentName) {
        this.l_ContinentName = p_ContinentName;
    }

    /**
     * Returns the current player who owns the country
     * @return A string with name of player
     */
    public String getD_CurrentOwner() {
        return d_CurrentOwner;
    }

    /**
     * Sets the current owner name
     * @param p_CurrentOwner with current player who owns the country
     */
    public void setD_CurrentOwner(String p_CurrentOwner) {
        this.d_CurrentOwner = p_CurrentOwner;
    }

    /**
     * Returns the number of armies on the country
     * @return An int with number of armies
     */
    public int getNumberOfArmies() {
        return NUMOFARMIES;
    }

    /**
     * Sets the number of armies on the country
     * @param p_NumberOfArmies with current player who owns the country
     */
    public void setNumberOfArmies(int p_NumberOfArmies) {
        this.NUMOFARMIES = p_NumberOfArmies;
    }

    /**
     * Print Country
     */
    public String printCountry () {
        return String.format("%s %s %s %d", ID, l_ContinentName, d_CurrentOwner, NUMOFARMIES);
    }
}

