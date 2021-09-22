package com.sngular.devTrining2021.exercises;

public class AlgorithmName {
    public static int[] minMax(int[] arr) {
        int mini=arr[0],maxi=arr[0];
	int[] ans=new int[2];
	for(int i=0;i<arr.length;i++){
		mini=arr[i]<mini?arr[i]:mini;
		maxi=arr[i]>maxi?arr[i]:maxi;
	}
	ans[0]=mini;
	ans[1]=maxi;
	return ans;
    }
}
