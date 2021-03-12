package id.co.employee.domain.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.ToString;


@ToString
@EqualsAndHashCode
@Entity(name = "Employee")
@Table(name = "PEGAWAI")
public class Employee implements Serializable {

    private static final long serialVersionUID = -5047716873066311370L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USERID", nullable = false)
    private Long userId;


	@Column(name = "NAMA", nullable = false, length=100)
    private String name;
    
    @Column(name = "ALAMAT", nullable = false, length=250)
    private String address;
    
    
    public Employee(){
    }
    
    public Employee(String employeeName, String adddress){
    	this.name = employeeName;
    	this.address = adddress;
    }
    
    public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


   

}
