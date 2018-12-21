package com.joey.bean;

public class Employee {
    private Integer id;

    private String name;

    private String gender;

    private String email;

    private Integer deptId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

	public Employee(Integer id, String name, String gender, String email, Integer deptId) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.deptId = deptId;
	}
    
    
}