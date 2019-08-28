package com.pucminas.apifb.util;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Util {
	public static List<Integer> getRangeClosed(int num){
		int ini = 1;
		int fin = 10;

		if (num <= 10) {
			ini = 1;
			fin = 10;
		}else {
			ini = num-9;
			fin = num;
		}
  	    List<Integer> pageNumbers = IntStream.rangeClosed(ini,fin).boxed().collect(Collectors.toList());
  	    return pageNumbers;
	}
}	
	
