import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prime {

public static void main(String[] args) {
  
	 //test
	
	 //stte
	//Reverse Number By Using List
	List<Integer> l=new LinkedList<>();
	l.add(22);
	l.add(10);
	l.add(44);
	l.add(12);
	Collections.reverse(l);
	System.out.println(l);
	System.out.println(l);
	
	int arr[]= {10,20,30,40,50};
	
	System.out.println(Arrays.toString(arr));
	//Collections.reverse(Arrays.asList(arr));
	Collections.reverse(Arrays.asList(arr)); 
	System.out.println("Sorted Array"+Arrays.toString(arr));
	// Creating input integer array 
    //Integer arr[] = { 10, 20, 30, 40, 50 }; 

    // Print elements of array 
   // System.out.println("Original Array : "
 //                      + Arrays.toString(arr)); 

    // Reversing elements of array using reverse() 
    // method of Arrays class and fetching as 
    // list via asList() 
    Collections.reverse(Arrays.asList(arr)); 

    // Print and display reverse updated array 
    System.out.println("Modified Array : "
                       + Arrays.toString(arr));
    
    List<Integer>s=l.stream().sorted().collect(Collectors.toList());
    System.out.println("Using Stream"+s);
    
}


	
}