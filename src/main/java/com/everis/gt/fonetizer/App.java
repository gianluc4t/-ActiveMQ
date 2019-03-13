package com.everis.gt.fonetizer;

public class App 
{
    public static void main( String[] args )
    {
    	String test = "O cavvalo é como < um  ccámelo, mas seemm defeii%To";
    	System.out.println(test + " >>> "+ Fonetizer.fonetiza(test));
    	
   	 test = "praça  dda rebubblicca ";
    	System.out.println(test + " >>> "+ Fonetizer.fonetiza(test));
    	
   	 test = "rua ruela ÁARRU assa a ";
    	System.out.println(test + " >>> "+ Fonetizer.fonetiza(test));
    	
   	 test = "avenida do mau estar mal ";
    	System.out.println(test + " >>> "+ Fonetizer.fonetiza(test));
    }
}
