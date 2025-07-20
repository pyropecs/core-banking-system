import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
    
    @Id
    private int id;
    private String name;
    private String socialSecurityNumber;
    private String phoneNumber;
    private int age;
    @OneToOne
    private Address address;

public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getSocialSecurityNumber() {
    return socialSecurityNumber;
}
public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
}
public String getPhoneNumber() {
    return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public Address getAddress() {
    return address;
}
public void setAddress(Address address) {
    this.address = address;
}

}
