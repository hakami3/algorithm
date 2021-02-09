package search;

public class BinarySearch {
    int binarySearch(int arr[], int l, int r, int x) 
    { 
    	if (r>=1) {
    		int m = l + (r-1) /2;
    		
    		if (arr[m] == x) {
    			return m;
    		}
    		
    		else if(arr[m] > x) {
    			return binarySearch(arr, 1, m-1, x);
    		}
    		
    		return binarySearch(arr, m+1, r, x);
    	}

        return -1; 
    } 
  
    public static void main(String args[]) 
    { 
        BinarySearch b = new BinarySearch(); 
        int arr[] = { 2, 3, 4, 10, 40, 15, 70 }; 
        int n = arr.length; 
        int x = 15; 
        int result = b.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element is not in array"); 
        else
            System.out.println("Element found at index " + result); 
    } 
}
