package com.day11_12_oops;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StockPortfolio extends StocksFromFile{
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Stock> totalStocks = new ArrayList<Stock>();
        int cost;
        Stock stock;
        StockPortfolio stockPortfolio = new StockPortfolio();
        stockPortfolio.readFromFile();
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Stock name");
        String stockName = sc.next();
        System.out.println("Enter no.of stocks");
        int noOfStocks = sc.nextInt();
        int size = stockPortfolio.allStocks.size();
        for(int i=0; i<size; i++){
            stock = new Stock(stockPortfolio.stockName.get(i), stockPortfolio.noOfShares.get(i), stockPortfolio.sharePrice.get(i));
            totalStocks.add(stock);
            if(stockName.equalsIgnoreCase(totalStocks.get(i).getStockName())){
                cost = noOfStocks * totalStocks.get(i).getSharePrice();
                System.out.println("\nCost of " + noOfStocks + " stocks is "+ cost);
            }
        }
    }
}
