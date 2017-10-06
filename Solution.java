
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
		 int result = 0;
		    for(int i=0; i<max.length; i++){
		        if(max[i]>result)
		            result = max[i];
		    }
		    return result;
	}
	public static void main(String[] args) {
		int[] seaquence1= {1,0,2,6,3,4,5,11,12,13};
		int[] seaquence12= {1000000000,22,9,33,21,50,41,60,80,90,90,100,103,108,105};
		int[] seaquence13= {5,19,5,81,50,28,29,1,83,23};
		int[]seaquence14 = {1,10,2,4,6,5,13,3,11,7,15};
		
		System.out.println(run(seaquence1));
		System.out.println(run(seaquence12));
		System.out.println(run(seaquence13));
		System.out.println(run(seaquence14));

	}
}
