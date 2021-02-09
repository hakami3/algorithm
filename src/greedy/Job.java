package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Job {
	public char id;
	public int deadline;
	public int profit;
	
	public Job(){}
	public Job(char id, int deadline, int profit) {
		this.id = id;
		this.deadline = deadline;
		this.profit = profit;		
	}

	static void printScheduling(ArrayList<Job> array, int num) {
		
		char job[] = new char[num];
		boolean result[] = new boolean[num];
		
		Collections.sort(array, new Comparator<Job>(){			
			@Override
			public int compare(Job j1, Job j2) {
				return Integer.compare(j2.profit, j1.profit);
			}						
		});
		
		for (int i = 0; i < array.size(); i++) {
			for (int j= Math.min(num-1, array.get(i).deadline -1); j >=0; j--) {
				if (result[j] == false) {
					result[j] = true;
					job[j] = array.get(i).id;
					break;
				}
			}
			
		}
		
		for (char j : job) {
			System.out.println(j + " ");
		}
					
		
	}
    public static void main(String args[]) 
    { 
        ArrayList<Job> arr = new ArrayList<Job>(); 
  
        arr.add(new Job('a', 2, 100)); 
        arr.add(new Job('b', 1, 19)); 
        arr.add(new Job('c', 2, 27)); 
        arr.add(new Job('d', 1, 25)); 
        arr.add(new Job('e', 3, 15)); 
        
        Job job = new Job(); 
  
        job.printScheduling(arr, 3);
        
    } 
}
