// Levl 4 Longest Increasing sub
public class Solution {
	
public static int run(int[] seaquence) {
		int[] max = new int[seaquence.length];
		 for(int i=0; i<seaquence.length; i++){
		        max[i]=1;
		        for(int j=0; j<i;j++){
		            if(seaquence[i]>seaquence[j]){
		                max[i]=Math.max(max[i], max[j]+1);
		            }
		        }
		    }
		 int k = 0;
		    for(int i=0; i<max.length; i++){
		        if(max[i]>k)
		            k = max[i];
		    }
		    return k;
	}
	
}
