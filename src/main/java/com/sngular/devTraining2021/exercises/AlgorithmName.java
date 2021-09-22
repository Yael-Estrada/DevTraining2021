package com.sngular.devTrining2021.exercises;
import java.util.Arrays;
public class AlgorithmName {
    public static int orderNumber(int number){
    	String s=""+number;
	char temp[]=s.toCharArray();
	Arrays.sort(temp);
	for(int i=0;i<s.length()-1-i;i++){
		char aux=temp[i];
		temp[i]=temp[s.length()-1-i];
		temp[s.length()-1-i]=aux;
    	}
	return Integer.parseInt(new String(temp));
    }
}
