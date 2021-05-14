public class Main{
	 
static int max(int a, int b)	 
{	 
	return (a > b) ? a : b;	 
} 

static int knapSackRec(int W, int wt[], 
					int val[], int n,
					int [][]dp)
{ 

	if (n == 0 || W == 0) 
		return 0;

	if (dp[n][W] != -1)
		return dp[n][W]; 

	if (wt[n - 1] > W) 


		return dp[n][W] = knapSackRec(W, wt, val, n - 1, dp);

	else

		return dp[n][W] = max((val[n - 1] + 
							knapSackRec(W - wt[n - 1], wt, val, n - 1, dp)),
							knapSackRec(W, wt, val, n - 1, dp));			 
}

static int knapSack(int W, int wt[], int val[], int N)
{ 

	int dp[][] = new int[N + 1][W + 1]; 

	for(int i = 0; i < N + 1; i++) 
		for(int j = 0; j < W + 1; j++) 
			dp[i][j] = -1; 

	return knapSackRec(W, wt, val, N, dp);	 
}

public static void main(String [] args)
{	 
	int val[] = { 20,30,10,50 }; 
	int wt[] = { 1, 3, 4, 6 }; 

	int W = 10; 
	int N = val.length;		 

	System.out.println(knapSack(W, wt, val, N)); 
}
	 
}
