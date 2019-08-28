package com.pucminas.apifb;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {
		int numero;
		numero = 13;
		System.out.println(returnRange(numero,"avancar"));
	}
	
	
	public static List<Integer> returnRange(int num, String acao){
		int ini = 1;
		int fin = 10;

		if (num <= 10) {
			ini = 1;
			fin = 10;
		}else {
			
			if (acao == "avancar") {
				ini = num-9;
				fin = num;
			}		
		}
  	    List<Integer> pageNumbers = IntStream.rangeClosed(ini,fin).boxed().collect(Collectors.toList());
  	    return pageNumbers;
	}
}
