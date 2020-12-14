package com.github;

public class StringConcatenationComparison {
	public static void main(String[] args) {
		String phrase = "AAAA";
		int loopComparison = 100000;
		final String aux = phrase;
		StringBuilder builder = new StringBuilder(phrase);
		builder.append(phrase);
		long init = System.currentTimeMillis();
		for (int i = 0; i <= loopComparison; i++) {
			phrase += "BBBB";
			phrase += "CCCC";
			phrase += "DDDD";
			phrase = aux;
		}
		long total = System.currentTimeMillis() - init;
		System.out.println(" Execution in " + total + " ms" );
		
		init = System.currentTimeMillis();
		for (int i = 0; i <= loopComparison; i++) {
			builder.append("BBBB");
			builder.append("CCCC");
			builder.append("DDDD");
			builder = new StringBuilder(aux);
		}
		total = System.currentTimeMillis() - init;
		System.out.println(" Execution in " + total + " ms" );
	}
}
