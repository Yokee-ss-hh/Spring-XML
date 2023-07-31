package com.example.demo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
	
	private String name;
	
	private List<String> hobbies;
	
	private Set<String> favoritePlaces;
	
	private Map<String,String> friends;
	
	private Properties props;


	@Override
	public String toString() {
		return "Person [name=" + name + ", hobbies=" + hobbies + ", favoritePlaces=" + favoritePlaces + ", friends="
				+ friends + ", props=" + props + "]";
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public Set<String> getFavoritePlaces() {
		return favoritePlaces;
	}

	public void setFavoritePlaces(Set<String> favoritePlaces) {
		this.favoritePlaces = favoritePlaces;
	}

	public Map<String, String> getFriends() {
		return friends;
	}

	public void setFriends(Map<String, String> friends) {
		this.friends = friends;
	}
	
}
