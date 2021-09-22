package com.sngular.devTrining2021.exercises;

public class AlgorithmName {
    public static String accum(String str) {
   	String s="";
	int val;
	char letra;
	for(int i=0;i<str.length();i++){
		val=(int)str.charAt(i);
		letra=val<91&&val>64? (char)(val+32):str.charAt(i);
		for(int j=0;j<=i;j++){
			if(j==0)
				s+=(char)(letra-32);
			else
				s+=letra;
		}
		if(i!=str.length()-1)
			s+="-";
	}
	return s;
    }
}
