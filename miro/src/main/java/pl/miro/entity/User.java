package pl.miro.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table (name = "uzytkownik")
public class User {
    
    @Id
    @GeneratedValue(generator = "account_id", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "account_id", sequenceName = "account_id_seq")
    Integer id;
    
    @Column (name = "username")
    private String userName;

    @Column (name = "imie", nullable = false)
    private String imie;

    @Column (name = "nazwisko", nullable = false)
    private String lastName;

    @Column (name = "password", nullable = false)
    private String password;

    @Column (name = "created_on", nullable = false)
    private Date createdOn;

    @Transient
    private Date lastLoginOn;

    public User() {
    }

    public User(String userName, String imie, String lastName, String password) {
        this.userName = userName;
        this.imie = imie;
        this.lastName = lastName;
        this.password = password;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getLastLoginOn() {
        return lastLoginOn;
    }

    public void setLastLoginOn(Date lastLoginOn) {
        this.lastLoginOn = lastLoginOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return userName.equals(user.userName);
    }

    @Override
    public int hashCode() {
        return 13 * userName.hashCode();
    }

}
