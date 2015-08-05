//============================================================
//Copyright 2015, IntraLinks, Inc.  All rights reserved.
//============================================================
package com.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


/**
 * TODO: Class javadoc
 * 
 * @author neoadmin 
 * Created on Aug 4, 2015
 */
public class TaxCalculator {

    final double TAXRATE = 0.25;
    final double STATETAX = 0.02;
    final double COUNTRYTAX = 0.015;
    public static final Calendar TODAY_CALENDAR = Calendar.getInstance();
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("YYYYMMdd hh:ss SSS");

    private void calculateAndPrintInfo(double totalIncome) {
        double incomeTax = ((totalIncome * TAXRATE) + (totalIncome * STATETAX) + (totalIncome * COUNTRYTAX));
        double afterTax = (totalIncome - incomeTax);
        System.out.println("The incomeTax is:" + incomeTax);
        System.out.println("The Income after Taxes is:" + afterTax);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        for(int i=0; i<10;i++) {
            System.out.println(DATE_FORMAT.format(TaxCalculator.TODAY_CALENDAR.getTime()));
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        /*TaxCalculator taxCalculator = new TaxCalculator();
        for (String income : args) {
            
            
            try {
                taxCalculator.calculateAndPrintInfo(Double.parseDouble(income));
            } catch(NumberFormatException nfe) {
                nfe.printStackTrace();
                System.out.println("Invalid input:"+ income);
            }
        }*/
    }

}
