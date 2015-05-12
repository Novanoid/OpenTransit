package io.fluctum.opentransit.networks;

import io.fluctum.opentransit.data.Place;

import java.util.ArrayList;

/**
 * The interface used by concrete network providers to perform API requests and
 * hand out the responses using a uniform interface.
 * 
 * @author Jan Tagscherer
 */
interface NetworkProvider {
    /**
     * Query the network for a list of local places.
     * 
     * @param query
     *            Search request to be sent
     * @return A list of places matching the query
     */
    public ArrayList<Place> queryPlaces(String query);
}
