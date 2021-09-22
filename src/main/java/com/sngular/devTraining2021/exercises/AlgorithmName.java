package com.sngular.devTrining2021.exercises;

public class AlgorithmName {
    public static int findEvenIndex(int[] arr) {
	if(arr.length==0) return -1;
	if(arr.length==1) return 0;
    	int[] left=new int[arr.length];
	int[] right=new int[arr.length];
	int acum=0;
	for(int i=0;i<arr.length;i++){
		left[i]=acum;
		acum+=arr[i];
	}
	acum=0;
	for(int i=arr.length-1;i>=0;i--){
		right[i]=acum;
		acum+=arr[i];
	}
	for(int i=0;i<arr.length;i++){
		if(i==0){
			if(right[i]==0) 
				return i;
		}
		if(i==arr.length-1){
			if(left[i]==0)
				return i;
		}
		if(left[i]==right[i])
			return i;
	}
	return -1;
    }
}
