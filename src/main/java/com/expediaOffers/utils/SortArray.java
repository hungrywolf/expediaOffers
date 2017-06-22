package com.expediaOffers.utils;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

// TODO: Auto-generated Javadoc
/**
 * The Class SortArray.
 */
public class SortArray implements Comparator<String> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(String str1, String str2) {
		return Integer.valueOf(str1).compareTo(Integer.valueOf(str2));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#reversed()
	 */
	@Override
	public Comparator<String> reversed() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#thenComparing(java.util.Comparator)
	 */
	@Override
	public Comparator<String> thenComparing(Comparator<? super String> other) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#thenComparing(java.util.function.Function,
	 * java.util.Comparator)
	 */
	@Override
	public <U> Comparator<String> thenComparing(
			Function<? super String, ? extends U> keyExtractor,
			Comparator<? super U> keyComparator) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#thenComparing(java.util.function.Function)
	 */
	@Override
	public <U extends Comparable<? super U>> Comparator<String> thenComparing(
			Function<? super String, ? extends U> keyExtractor) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.util.Comparator#thenComparingInt(java.util.function.ToIntFunction)
	 */
	@Override
	public Comparator<String> thenComparingInt(
			ToIntFunction<? super String> keyExtractor) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.util.Comparator#thenComparingLong(java.util.function.ToLongFunction)
	 */
	@Override
	public Comparator<String> thenComparingLong(
			ToLongFunction<? super String> keyExtractor) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.util.Comparator#thenComparingDouble(java.util.function.ToDoubleFunction
	 * )
	 */
	@Override
	public Comparator<String> thenComparingDouble(
			ToDoubleFunction<? super String> keyExtractor) {
		// TODO Auto-generated method stub
		return null;
	}
}
