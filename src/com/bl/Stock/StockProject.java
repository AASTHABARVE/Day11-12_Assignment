package com.bl.Stock;


import java.util.ArrayList;
import java.util.Scanner;

    class Stocks{
        String stockName;
        int totalStocks;
        float perStockPrice;

        public Stocks(String stockName, int totalStocks, float perStockPrice){
            this.stockName = stockName;
            this.totalStocks = totalStocks;
            this.perStockPrice = perStockPrice;
        }
    }
    public class StockProject {
        static float totalValue = 0;
        public static void displayStockReport(ArrayList<Stocks> st){
            System.out.println("-------------------");
            for(int i=0; i<st.size(); i++){
                System.out.println("stockName = " + st.get(i).stockName);
                System.out.println("stockName = " + st.get(i).totalStocks);
                System.out.println("stockName = " + st.get(i).perStockPrice);
            }
            System.out.println("-------------------");
        }

        static void totalValueOfEachStock(ArrayList<Stocks> st){
            for(int i=0; i<st.size(); i++){
                System.out.println();
                float totalValueEach = st.get(i).totalStocks * st.get(i).perStockPrice;
                System.out.println("stockName = " + st.get(i).stockName +" and"+ " total value = " + totalValueEach);
                System.out.println();
            }
        }

        static void totalValueOfAllStock(ArrayList<Stocks> st){
            for(int i=0; i<st.size(); i++){
                totalValue = totalValue + (st.get(i).totalStocks * st.get(i).perStockPrice);
            }
            System.out.println("total value of all stock: " + totalValue);
        }

        public static void main(String[] args) {
            ArrayList<Stocks> stock = new ArrayList<Stocks>();
            int temp = 1;
            Scanner sc = new Scanner(System.in);
            while(temp != 0 ) {
                System.out.println("1.Add_Stock 2.Stock_Report 3.Exit 4.TotalValueOfEachStock 5.TotalValueOfAllStocks");
                System.out.print("Enter the choice:");
                int choice = sc.nextInt();

                switch(choice){
                    case 1:
                        System.out.print("enter stock name:");
                        String name = sc.next();
                        System.out.print("total number of stock:");
                        int totalStock = sc.nextInt();
                        System.out.print("per stock price:");
                        float pricePerStock = sc.nextInt();

                        Stocks object = new Stocks(name,totalStock,pricePerStock);
                        stock.add(object);
                        stock.get(0);
                        break;
                    case 2:
                        displayStockReport(stock);
                        break;
                    case 3:
                        temp = 0;
                        break;
                    case 4:
                        totalValueOfEachStock(stock);
                        break;
                    case 5:
                        totalValueOfAllStock(stock);
                        break;
                    default:
                        System.out.println("!!!something went wrong!!!");
                        break;
                }
            }
        }
    }


