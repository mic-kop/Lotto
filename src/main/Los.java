package main;

import java.util.Arrays;
import java.util.Random;

public class Los {
	
	public static int[] cyfra(){
		
		int[] tab;        
        tab = new int[6];
		
		Random r = new Random();
		
		for(int i=0;i<6;i++){
			tab[i] = r.nextInt(49);
			while(tab[i]==tab[(i+1)%6] || tab[i]==tab[(i+2)%6] || tab[i]==tab[(i+3)%6] || tab[i]==tab[(i+4)%6] || tab[i]==tab[(i+5)%6] || tab[i]==0){
				tab[i] = r.nextInt(49);
				}
			System.out.print(tab[i]+"\n");
			
		}	
		// test ró¿noœci cyfr
		for(int i=0;i<6;i++){
		if(tab[i]==tab[(i+1)%6] || tab[i]==tab[(i+2)%6] || tab[i]==tab[(i+3)%6] || tab[i]==tab[(i+4)%6] || tab[i]==tab[(i+5)%6] || tab[i]==0)
			System.out.print("BBB££££¥¥¥¥DDDDD");
		}
		
		Arrays.sort(tab);
		//
		return tab;
	}

}
