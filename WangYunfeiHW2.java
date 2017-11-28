import java.util.Arrays;
public class Test {
	
	// Question 3.e: recursive factorial 
	public static int fact(int n) {
		if (n==0) 
			return 1;
		 else if (n>0 && n<=12 )
			return n*fact(n-1);
		 else 
			throw new IndexOutOfBoundsException(n + " is out of bounds!");		
	}
	
	// Question 3.f: tail recursive factorial
	private static int tailFact(int n, int accm) {
		if (n == 0) 
			return accm;
		else if (n>0 && n<=12)
			return tailFact(n - 1, n * accm);
		else
			throw new IndexOutOfBoundsException(n + " is out of bounds!");
	}	 
	public static int factorial(int n) {
		return tailFact(n, 1);
	}
	
	// iterative factorial 
	public static int iterativeFact(int n, int y) {
		y = 1;
	    while (n>0 && n<=12) {
	        y = n * y;
	        n = n - 1;
	    }
	    return y;
	}
	
	// Question 5: recursive function power of 2
	public static int recPow(int n){
	if (n<0 || n>=31)
		throw new IllegalArgumentException("Illegal Power Argument");
	if (n==0) return 1;
	int half = recPow(n/2);
	if (n%2==1)
		return 2*half*half;
	else
		return half*half;
	}

	//Question 6: merge sort, splitting by odd-even positions
	static int[] mergeSort(int []arr) {
		if (arr==null || arr.length<=1) return arr;
		int []arr1 = null;
		int []arr2 = new int[arr.length/2];
		if (arr.length % 2 == 0) {
			arr1 = new int[arr.length/2];
		} else {
			arr1 = new int[arr.length/2 + 1];
		}
		for (int i=0; i<arr.length; i++) {
			if (i%2 == 0) {
				arr1[i/2] = arr[i];
			} else {
				arr2[i/2] = arr[i];
			}
		}
		arr1 = mergeSort(arr1);
		arr2 = mergeSort(arr2);
		return merge(arr1, arr2);
	}
	static int[] merge(int[] arr1, int []arr2) {
		int []result = new int[arr1.length + arr2.length];
		int i1 = 0, i2 = 0, cur = 0;
		while (i1<arr1.length && i2<arr2.length) {
			if(arr1[i1] < arr2[i2]) {
				result[cur++] = arr1[i1++];
			} else {
				result[cur++] = arr2[i2++];
			}
		}
		while (i1 < arr1.length) {
			result[cur++] = arr1[i1++];
		}
		while (i2 < arr2.length) {
			result[cur++] = arr2[i2++];
		}
		return result;
	}	
	// testing
	public static void main(String[] args) {
		System.out.println(Arrays.toString(mergeSort(new int[]{7, 3, 2, 5, 8, 1, 9})));
	}
	
}
