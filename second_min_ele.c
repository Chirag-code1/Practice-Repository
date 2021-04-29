#include<stdio.h>
#include<stdlib.h>
#include<limits.h>

int findSecondMin(int* a,int n){
	if( n<=1)
		return 0;
	
	int min=a[0]; //initialize max to first array element
	int sec_min=INT_MAX,temp=0; //initialize min to first array element

	for(int i=0;i<n;i++){ //scan the entire array
		//if a[i]< min then update min to array value 
		//& second min to previous min value 
		if(a[i]<min){
			sec_min=min;
			min=a[i];
		}
		//else if a[i] is smaller than second min but greater 
		//than min then update second min to array element value
		else if (a[i] < sec_min && a[i] > min) 
			sec_min=a[i];
	}
	//if sec_min is still at its initialized value then no second minimum exists at all
	if(sec_min==INT_MAX)
		return 0;
	//else return second maximum
	return sec_min;
}

int main(){
	int n,sec_min=0;

	printf("enter no of elements\n");
	scanf("%d",&n);

	//dynamic array created
	int *a=(int*)malloc(sizeof(int)*n);

	printf("enter the elements........\n");
	//taking input
	for(int i=0;i<n;i++)
		scanf("%d",&a[i]);

	//find second maximum value
	sec_min=findSecondMin(a,n);

	if(sec_min==0) //if no second minimum exists
		printf("no second minimum exists\n");
	else
		printf("The second minimum no is : %d\n",sec_min);

	return 0;
}