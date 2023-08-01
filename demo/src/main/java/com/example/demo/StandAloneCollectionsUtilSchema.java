package com.example.demo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class StandAloneCollectionsUtilSchema {
	
	private List<Integer> burgerPrices;
	
	private Set<String> favoritePlaces;
	
	private Map<String,Integer> favoritePrimes;
	
	private Properties props;

	@Override
	public String toString() {
		return "StandAloneCollectionsUtilSchema [burgerPrices=" + burgerPrices + ", favoritePlaces=" + favoritePlaces
				+ ", favoritePrimes=" + favoritePrimes + ", props=" + props + "]";
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public List<Integer> getBurgerPrices() {
		return burgerPrices;
	}

	public void setBurgerPrices(List<Integer> burgerPrices) {
		this.burgerPrices = burgerPrices;
	}

	public Set<String> getFavoritePlaces() {
		return favoritePlaces;
	}

	public void setFavoritePlaces(Set<String> favoritePlaces) {
		this.favoritePlaces = favoritePlaces;
	}

	public Map<String, Integer> getFavoritePrimes() {
		return favoritePrimes;
	}

	public void setFavoritePrimes(Map<String, Integer> favoritePrimes) {
		this.favoritePrimes = favoritePrimes;
	}
}
