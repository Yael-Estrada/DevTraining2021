package com.sngular.devTrining2021.exercises;

public class Algorithm {
    public static String startOz(String str) {
    	String s="";
	int indo=str.indexOf("o");
	int indz=str.indexOf("z");
	int lastz=str.lastIndexOf("z");
	if(indz==-1&&indo==-1) return "";
	if(indo!=-1){
		s+="o";
		if(indz>indo)
			s+="z";	
	}
	else{
		if(indz!=lastz) s+="zz";
		else s+="z";
	}
	return s;
    }
}
