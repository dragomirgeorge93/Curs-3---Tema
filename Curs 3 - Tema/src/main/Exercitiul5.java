package main;

public class Exercitiul5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sirCaractere = new String("Fiecare litera de pe pozitie para sa fie uppercase");
        char[] caractere = new char[sirCaractere.length()];

        for(int c=0; c < sirCaractere.length(); c++)
        {
            if(c%2 == 0)
            {
                caractere[c] = Character.toUpperCase(sirCaractere.charAt(c));
            }
            else
            {
                caractere[c] = Character.toLowerCase(sirCaractere.charAt(c));
            }
            System.out.print(caractere[c]);
        }
        
	}
}
