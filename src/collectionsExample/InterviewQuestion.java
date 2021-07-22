package collectionsExample;

import java.util.ArrayList;

public class InterviewQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,3,4,3,7,7,7,8,9,5,8,8,9,10};
		//int k=0;
		ArrayList<Integer> ab= new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			int k=0;
			if(!ab.contains(a[i])) {
				ab.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++) {
					if(a[j]==a[i]) {
						k++;
					} 
					}//System.out.println(a[i]); System.out.println(k);

			
			}
			if (k==1) {
				System.out.println("unique number is  :" +a[i]);
		}
		
			
		}
	}

}
