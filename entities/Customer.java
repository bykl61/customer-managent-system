package entities;


import java.util.Date;

public class Customer implements Entity {

   private String firstName;
   private String lastName;
   private Long tc ;
   private Date birth;

    public Customer() {
    }

    public Customer(String firstName, String lastName, Long tc, Date birth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.tc = tc;
        this.birth = birth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getTc() {
        return tc;
    }

    public void setTc(Long tc) {
        this.tc = tc;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
