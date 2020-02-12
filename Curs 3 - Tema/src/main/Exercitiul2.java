package main;

public class Exercitiul2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        int[] sir = new int[10];
		        sir[0]=2;
		        sir[1]=-4;
		        sir[2]=6;
		        sir[3]=-3;
		        sir[4]=8;
		        sir[5]=0;
		        sir[6]=-1;
		        sir[7]=-9;
		        sir[8]=9;
		        sir[9]=7;
		        
		        int min=sir[0];
		        int max=sir[9];
		        
		        for(int i=0; i<sir.length; ++i){
		            if(min>sir[i]){
		                min=sir[i];
		            }
		            if(max<sir[i]){
		                max=sir[i];
		            }
		        
		        }
		    
		        System.out.println("Minim: " + min + " ; " + "Maxim: " + max);
		 
	}

}
