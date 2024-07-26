class Solution
{
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    int tour(int petrol[], int distance[])
    {
	// Your code here	
	int n = petrol.length;
	int start = 0, sum = 0, diff = 0;
	for(int i = 0; i<n; i++) {
	    sum += petrol[i] - distance[i];
	    if(sum < 0) {
	        diff += sum;
	        sum = 0;
	        start = i+1;
	    }
	}
	if(sum + diff >=0){
	    return start;
	}
	return -1;
    }
}