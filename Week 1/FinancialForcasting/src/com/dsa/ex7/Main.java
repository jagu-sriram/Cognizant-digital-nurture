package com.dsa.ex7;

public class Main {

    public static double forecastValueRecursive(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        }
        return forecastValueRecursive(initialValue, growthRate, years - 1) * (1 + growthRate);
    }
    
    public static double forecastValueIterative(double initialValue, double growthRate, int years) {
        double result = initialValue;
        for (int i = 0; i < years; i++) {
            result *= (1 + growthRate);
        }
        return result;
    }


    public static void main(String[] args) {
        double initialValue = 1000.0;    
        double growthRate = 0.05;        
        int years = 5;

        double forecast = forecastValueIterative(initialValue, growthRate, years);
        System.out.printf("Forecast after %d years: %.2f%n", years, forecast);
    }
}
