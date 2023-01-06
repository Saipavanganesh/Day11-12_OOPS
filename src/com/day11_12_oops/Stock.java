package com.day11_12_oops;

public class Stock {
    private String stockName;
    private int noOfShares;
    private int sharePrice;

    Stock(String stockName, int noOfShares, int sharePrice){
        this.stockName = stockName;
        this.noOfShares = noOfShares;
        this.sharePrice = sharePrice;
    }
    public String  getStockName(){
        return stockName;
    }
    public int getNoOfShares(){
        return noOfShares;
    }
    public int getSharePrice(){
        return sharePrice;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public void setNoOfShares(int noOfShares) {
        this.noOfShares = noOfShares;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }

    public String display(){
        String disp = "Stock Name : \n" + stockName
                + "No.of Shares : \n" + noOfShares
                + "Share Price :\n" + sharePrice;
        return disp;
    }
}