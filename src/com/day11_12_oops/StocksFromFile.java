package com.day11_12_oops;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StocksFromFile {
    ArrayList<String> allStocks = new ArrayList<String>();
    ArrayList<String> stockName = new ArrayList<String>();
    ArrayList<Integer> noOfShares = new ArrayList<Integer>();
    ArrayList<Integer> sharePrice = new ArrayList<Integer>();
   String[] tempArray = new String[3];

    public void readFromFile() throws  FileNotFoundException{
        File file = new File("D:\\JavaProgramsBridgelabz\\Day11_12_OOPS\\src\\com\\day11_12_oops\\Stocks.txt"); //Reading data from a file by passing its location
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
            allStocks.add(line);
        }
        for(int i=0; i<allStocks.size(); i++){
            tempArray = allStocks.get(i).split(","); //Splitting data in files with commas
            stockName.add(tempArray[0]);
            noOfShares.add(Integer.parseInt(tempArray[1])); //Converting string to int in arraylist
            sharePrice.add(Integer.parseInt(tempArray[2]));
        }

    }
}
