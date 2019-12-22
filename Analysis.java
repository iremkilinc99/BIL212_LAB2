
public class Analysis {
	static int m=0;
	public static void mystery(int[] A, int i, int j) {
		if (i>=j) return;
		else {
		m = (i+j)/2;
		A[m] = A[i]+A[j];
		mystery(A, i, m);
		mystery(A, m+1, j);
		return;
		}
		
		}
	
	public static void main(String...strings) {
		int[] A=new int[4000000];
		double startTime=System.nanoTime();
		mystery(A,0,A.length-1);
		double endTime=System.nanoTime();
		System.out.println("Elapsed time: "+ (endTime-startTime));
	}
	

}
