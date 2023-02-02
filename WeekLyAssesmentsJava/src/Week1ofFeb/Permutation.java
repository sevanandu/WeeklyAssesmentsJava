package Week1ofFeb;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
	public static void Permutaion(String str,String a){
		if (str.length() == 0) {
            System.out.print(a + " ");
            return;
        }
 
        for (int i = 0; i < str.length(); i++) {
 
            
            char ch = str.charAt(i);
 
          
            String ros = str.substring(0, i) +
                        str.substring(i + 1);
 
            
            Permutaion(ros, a + ch);
        }
    }
		
	

	public static void main(String[] args) {
		
		Permutaion("seva","");		// TODO Auto-generated method stub

	}

}

//output
//seva seav svea svae saev save esva esav evsa evas easv eavs vsea vsae vesa veas vase vaes asev asve aesv aevs avse aves

//source geeksforgeeks

