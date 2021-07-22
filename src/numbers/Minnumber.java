package numbers;

public class Minnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 2 4 5
		 3 4 7
		 1 2 9
		 */
		int a[][]= {{2,4,1},{33,4,7},{11,2,9}};
		int min=a[0][0];
		int mincolumn = 0;
		int maxcolumn;
		int k=0;
		int maximum=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(a[i][j]<min) {
					min=a[i][j];
					
					mincolumn=j;
					System.out.println(mincolumn);
				}
				
					
			}
		}
		//System.out.println(min);
		maxcolumn = a[0][mincolumn];// first column of matrix having minimum number
		while(k<3) {
			if(a[k][mincolumn]>maxcolumn){
				maximum=  a[k][mincolumn];
				
				
			}
			k++;
		}
		System.out.println(maximum);
	}
	
}
