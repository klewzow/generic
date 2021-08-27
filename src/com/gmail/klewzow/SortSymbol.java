package com.gmail.klewzow;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public interface SortSymbol {
	public static List<Symbol> sort(List<Symbol> l) {
		List<Symbol> list = new ArrayList<>();
		for (Symbol symbol : l) {
			int tmp = list.indexOf(symbol);
			if (tmp >= 0) {
				list.get(tmp).setCount();
			} else {
				list.add(symbol);
			}
		}
		list.sort((a, b) -> {
			return (a.getCount() - b.getCount()) * -1;
		});
		return list;
	}

	public static List<Symbol> buffToList(ByteBuffer buff) {
		List<Symbol> list = new ArrayList<>();
		for (int i = 0; i < buff.limit(); i++) {
			char c;
			if (Character.isLetter(c = (char) buff.get())) {
				list.add(new Symbol(c));
			}
		}
		return list;
	}

}
