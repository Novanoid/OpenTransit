package io.fluctum.opentransit.networks;

import io.fluctum.opentransit.data.Place;

import java.util.ArrayList;

/**
 * Implements the network provider interface for the information system
 * "Elektronische Fahrplanauskunft".
 * 
 * @author Jan Tagscherer
 */
public class EfaProvider implements NetworkProvider {
    /**
     * The singleton instance of this network provider
     */
    private static EfaProvider instance;

    /**
     * {@inheritDoc}
     */
    @Override
    public ArrayList<Place> queryPlaces(String query) {
        return null;
    }

    /**
     * Hand out the singleton instance of this network provider
     * 
     * @return Singleton instance of this network provider
     */
    public static EfaProvider getInstance() {
        if (EfaProvider.instance == null) {
            EfaProvider.instance = new EfaProvider();
        }

        return EfaProvider.instance;
    }

}
