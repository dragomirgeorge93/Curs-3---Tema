package main;
		public class Exercitiul4 {

			public static void main(String[] args) {
		        
		        String sir="Transforma un String intr-un array de caractere";
		        char[] sirDeCaractere = new char[sir.length()];
		        for(int b=0; b < sir.length(); b++) 
		        {
		    sirDeCaractere[b] = sir.charAt(b);
		    System.out.println("Caracterul de la indexul " + b + " este " + sirDeCaractere[b]);
		      }
		    }
		  }
