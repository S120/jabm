/*
 * JABM - Java Agent-Based Modeling Toolkit
 * Copyright (C) 2013 Steve Phelps
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
package net.sourceforge.jabm;

public class Version {

	public static final String VERSION_NUMBER = "0.8";
	public static final String VERSION_SUFFIX = "b";
	public static final String BUILD_NUMBER = "0";
	public static final String BUILD_DATE = "20130610";
	public static final String COPYRIGHT = "(C) 2013 Steve Phelps";
	
	public static String getVersion() {
		return VERSION_NUMBER + VERSION_SUFFIX;
	}

	public static String getVerboseVersion() {
		return "JABM " + getVersion() + "-" + BUILD_NUMBER
				+ " (" + BUILD_DATE + ")";
	}
	
	public static String getCopyright() {
		return COPYRIGHT;
	}
	
	public static void main(String[] args) {
		System.out.println(getVerboseVersion());
	}
}
