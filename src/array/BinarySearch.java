package array;

public class BinarySearch {
public static void main(String[] args) {
	int arr[]= {2,3,5,6,8,10,16,20,27,30,55,96,100};
	int first=0;
	int last=arr.length-1;
	int mid=first+last/2;
	int x=16;
	while( first <= last ){  
	      if ( arr[mid] < x ){  
	        first = mid + 1;     
	      }else if ( arr[mid] == x ){  
	        System.out.println("Element is found at index: " + mid);  
	        break;  
	      }else{
	         last = mid - 1;  
	      }  
	      mid = (first + last)/2;  
	   }  
	   if ( first > last ){  
	      System.out.println("Element is not found!");  
	   } 
}
}