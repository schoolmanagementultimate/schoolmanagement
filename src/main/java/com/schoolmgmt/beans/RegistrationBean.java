package com.schoolmgmt.beans;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * 
 * @author RAMA
 *
 * <p>
 * 	Beans for the Registration page.</br>
 *  Spring document for scope is <a href=
 *  "http://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/context/annotation/Scope.html#proxyMode--">
 *  this</a>.
 * </p>
 * 
 */

@Component
@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RegistrationBean implements Serializable {

	private static final long serialVersionUID = 4197452551999212240L;

	
	private String name,
					area,
					contactNo,
					selectedCountry,
					selectedSyllabus;
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
	
}
