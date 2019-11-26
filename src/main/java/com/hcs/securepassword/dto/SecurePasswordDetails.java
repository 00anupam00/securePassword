package com.hcs.securepassword.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.StringJoiner;

@Setter @Getter
public class SecurePasswordDetails {

    private String selectedCurrency;
    private String currentBitcoinRate;
    private Double lowestBitcoinRateIn30Days;
    private Double highestBitcoinRateIn30Days;

    @Override
    public String toString() {
        return new StringJoiner(",\n",  "BitCoin Details: \n", "\n")
                .add("Selected Currency= '" + selectedCurrency + "'")
                .add("Current Bitcoin rate= '" + currentBitcoinRate + "'")
                .add("Lowest Bitcoin rate in 30 Days= " + lowestBitcoinRateIn30Days)
                .add("Highest Bitcoin rate in 30 Days= " + highestBitcoinRateIn30Days)
                .toString();
    }
}
