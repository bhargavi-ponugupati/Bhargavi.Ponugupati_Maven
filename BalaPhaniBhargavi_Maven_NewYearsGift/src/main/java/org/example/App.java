package org.example;

public class App
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        //create a new year gift object and call the object
        // In new year gift class we can get the actual implementation
        System.out.println("New Year's Gift");
        NewYearGift n=new NewYearGift();
        n.sweets();
        n.chocolates();
        n.total();

    }
}
