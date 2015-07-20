package com.schoolmgmt.beans;

import java.io.Serializable;


public class Registration implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4197452551999212240L;

	
	private String name,
					area,
					contactNo,
					selectedCountry,
					selectedSyllabus;
	private String[] city,
					syllabus,
					country;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}
	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}
	/**
	 * @return the contactNo
	 */
	public String getContactNo() {
		return contactNo;
	}
	/**
	 * @param contactNo the contactNo to set
	 */
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	/**
	 * @return the selectedCountry
	 */
	public String getSelectedCountry() {
		return selectedCountry;
	}
	/**
	 * @param selectedCountry the selectedCountry to set
	 */
	public void setSelectedCountry(String selectedCountry) {
		this.selectedCountry = selectedCountry;
	}
	/**
	 * @return the selectedSyllabus
	 */
	public String getSelectedSyllabus() {
		return selectedSyllabus;
	}
	/**
	 * @param selectedSyllabus the selectedSyllabus to set
	 */
	public void setSelectedSyllabus(String selectedSyllabus) {
		this.selectedSyllabus = selectedSyllabus;
	}
	/**
	 * @return the city
	 */
	public String[] getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String[] city) {
		this.city = city;
	}
	/**
	 * @return the syllabus
	 */
	public String[] getSyllabus() {
		return syllabus;
	}
	/**
	 * @param syllabus the syllabus to set
	 */
	public void setSyllabus(String[] syllabus) {
		this.syllabus = syllabus;
	}
	/**
	 * @return the country
	 */
	public String[] getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String[] country) {
		this.country = country;
	}
	
	
}
