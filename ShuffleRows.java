public class ShuffleRows{
	
	public static void main(String[] args){
		
		int[][] m={{1,2},{3,4},{5,6},{7,8},{9,10}};
		shuffle(m);
		for(int i=0;i<m.length;i++){
			
			System.out.println("m["+i+"][0]: "+m[i][0]+" m["+i+"][1]: "+m[i][1]);
		
		}
	}
	
	public static void shuffle(int[][] m){

		int[] temp=new int[2];

		for(int i=0;i<m.length;i++){
			
			int n=(int)(Math.random()*m.length);

			temp[0]=m[i][0];
			temp[1]=m[i][1];
			
			m[i][0]=m[n][0];
			m[i][1]=m[n][1];
		
			m[n][0]=temp[0];
			m[n][1]=temp[1];
		}
		
		
	}
}
