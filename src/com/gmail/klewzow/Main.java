package com.gmail.klewzow;

import java.io.File;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Symbol> result = SortSymbol.sort(SortSymbol.buffToList(Reader.read(new File("files", "text.txt"))));

		for (Symbol character : result) {
			System.out.println(character.getSymbol() + " = " + character.getCount());
		}
	}

}
