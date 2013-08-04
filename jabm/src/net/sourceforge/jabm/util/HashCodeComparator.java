/*
 * JABM - Java Agent-Based Modeling Toolkit
 * Copyright (C) 2011 Steve Phelps
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 */
package net.sourceforge.jabm.util;

import java.util.Comparator;

public class HashCodeComparator<T> implements Comparator<T> {

	@Override
	public int compare(T o1, T o2) {
		return new Integer(o1.hashCode()).compareTo(new Integer(o2.hashCode()));
	}

}