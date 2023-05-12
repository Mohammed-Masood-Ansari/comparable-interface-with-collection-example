package com.ansari.ArrayList.Objects;

public class Student implements Comparable<Student>{

	public int id;
	public String name;
	public String email;
	
	public Student(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public int compareTo(Student o) {
		if(id==o.id) {
			return 0;
		}else if(id>o.id) {
			return 1;
		}else {
			return -1;
		}
	}
}
