package com.sngular.devTrining2021.exercises;

public class AlgorithmName {
    public static boolean isIsogram(String str){
	str=str.toLowerCase();
	int[] alphabet=new int[27];
	for(int i=0;i<27;i++) alphabet[i]=0;
	for(int i=0;i<str.length();i++){
		alphabet[str.charAt(i)-97]++;
		if(alphabet[str.charAt(i)-97]>1)
			return false;
	}
	return true;
    }
}
