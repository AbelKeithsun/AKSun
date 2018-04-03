package orgin.beans;

import java.io.Serializable;

public class People implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String gender;
	private Integer age;
	private String hobby;
	private String address;
	private String motty;
	public People() {
		super();
	}
	public People(String name, String gender, Integer age, String hobby, String address, String motty) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.hobby = hobby;
		this.address = address;
		this.motty = motty;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMotty() {
		return motty;
	}
	public void setMotty(String motty) {
		this.motty = motty;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((hobby == null) ? 0 : hobby.hashCode());
		result = prime * result + ((motty == null) ? 0 : motty.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		People other = (People) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (hobby == null) {
			if (other.hobby != null)
				return false;
		} else if (!hobby.equals(other.hobby))
			return false;
		if (motty == null) {
			if (other.motty != null)
				return false;
		} else if (!motty.equals(other.motty))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "People [name:" + name + ", gender:" + gender + ", age:" + age + ", hobby:" + hobby + ", address:"
				+ address + ", motty:" + motty + "]";
	}
	
}
