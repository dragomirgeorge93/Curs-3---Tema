package main;

public class Exercitiul6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vector = new int[] {13, 25, 3, 93};
		double doubleNumar= 23.5;
		for(int y=0; y<vector.length; y++)
			{vector[y] = vector[y] + (int)doubleNumar;
			}
			
		for(int x=0; x<vector.length; x++)
		{
			System.out.println(vector[x]);
		}
		
	}

}
