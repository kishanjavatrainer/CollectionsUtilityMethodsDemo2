package com.infotech.sort;

import java.util.Comparator;

import com.infotech.model.Person;

public class SortPersonById implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getId().compareTo(o2.getId());
	}

}
