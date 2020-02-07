package org.example;

class Sweets {
    Sweets() {
    }

    int total_cost = 0;
    int total_weight = 0;

    //defining the methods total_weight and total_cost
    public int total_weight(int n, int p) {

        total_weight = n * p;
        return total_weight;
    }


    public int total_cost(int n, int pc) {

        total_cost = n * pc;
        return total_cost;

    }
}