package com.everis.gt.fonetizer;

public class App 
{
    public static void main( String[] args )
    {
    	String test = "O cavvalo � como < um  cc�melo, mas seemm defeii%To";
    	System.out.println(test + " >>> "+ Fonetizer.fonetiza(test));
    	
   	 test = "pra�a  dda rebubblicca ";
    	System.out.println(test + " >>> "+ Fonetizer.fonetiza(test));
    	
   	 test = "rua ruela �ARRU assa a ";
    	System.out.println(test + " >>> "+ Fonetizer.fonetiza(test));
    	
   	 test = "avenida do mau estar mal ";
    	System.out.println(test + " >>> "+ Fonetizer.fonetiza(test));
    }
}
