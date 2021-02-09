package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class activitySelection {
        public static void printMaxActivities(int s[], int f[], int n)
        {        	
        	// start = 0
        	int curTime = 0;
        	String result = "";
        	for (int a = 0; a <s.length; a++) {
        		if(curTime <= s[a]) {
        			curTime = f[a];
        			// phase 0
        			if (a == 0) {
        				result += a;
        			}
        			else {
            			result += " " + a;        				
        			}
        		}
        	}
        	
        	System.out.println(result);
        }
          
        public static void main(String[] args)
        {
        int s[] =  {1, 3, 0, 5, 8, 5};
        int f[] =  {2, 4, 6, 7, 9, 9};
        int n = s.length;
            
        printMaxActivities(s, f, n);
        }
         
}
