package com.gmail.klewzow;

import java.nio.MappedByteBuffer;
import java.util.List;
import java.util.function.Function;

public class Symbol {
	private char symbol;
	private int count;

	public Symbol(char symbol) {
		super();
		this.symbol = symbol;
		this.count = 1;
	}

	public Symbol() {
		super();
	}

	public char getSymbol() {
		return symbol;
	}

	public int getCount() {
		return count;
	}

	public void setCount() {
		this.count += 1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + symbol;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Symbol other = (Symbol) obj;
		if (symbol != other.symbol)
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "Symbol [symbol=" + symbol + ", count=" + count + "]";
	}

 
	
 
}
