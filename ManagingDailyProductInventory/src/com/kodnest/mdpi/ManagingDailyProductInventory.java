package com.kodnest.mdpi;

import java.util.Scanner;

public class ManagingDailyProductInventory {
	public static int[] calculateProductCounts(char[] productCodes) {
        // Your code here
        int[] productCounts = new int[26];
        for(int i=0; i<productCodes.length; i++){
            char productCode = Character.toUpperCase(productCodes[i]);
            if (productCode >= 'A' && productCode <= 'Z') {
                productCounts[productCode - 'A']++;
              }
        }
        return productCounts;
    }

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int numProducts = sc.nextInt();
        char[] productCodes = new char[numProducts];
        
        for(int i=0; i<productCodes.length; i++) {
        	productCodes[i] = sc.next().charAt(0);
        }
        sc.close();        
        
        System.out.println("Product counts in the inventory: ");
        int[] productCounts =  calculateProductCounts(productCodes); 
        for(int i=0; i<productCounts.length; i++){
            if(productCounts[i] > 0){
                System.out.println((char)('A' + i) + ": " + productCounts[i]);
            }
        }
    }
}