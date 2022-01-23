//Question number 8
package java_assignment_1;
public class bubbleSort {
	public static void main(String[] args) {
		int[] array=new int[] {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int i,j,temp;
		System.out.println("The array before bubble sort is as follows :");
		for(i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		for(i=0;i<array.length;i++) {
			for(j=i+1;j<array.length;j++) {
				if(array[j]<array[i]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("\nThe array after bubble sort is as follows :");
		for(i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
	}

}
