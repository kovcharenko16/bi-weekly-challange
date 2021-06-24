package com.softserveinc.ps4j.challenge.round001;

import java.util.Arrays;

/**
 * We need to link the trains with different numbers of carts into one train.
 * The cost of linking two trains is equal to the sum of the amount of their carts.
 * Return the minimal cost of linking all the trains.
 */
class CostOfLinkingTrainsProblem {

    int solve(int[] trains) {
        int cost;
        if (trains.length <= 2 & trains.length >= 0) {
            return trains.length == 0 ? 0 : trains.length == 1 ? trains[0] : trains[0] + trains[1];
        }
        Arrays.sort(trains);
        int[] updatedTrains = Arrays.copyOfRange(trains, 1, trains.length);
        cost = updatedTrains[0] = trains[0] + trains[1];
        cost += solve(updatedTrains);
        return cost;
    }

}
