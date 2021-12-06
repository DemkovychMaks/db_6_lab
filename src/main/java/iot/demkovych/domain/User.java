package iot.demkovych.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor

@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "age")
    private Integer age;

    @Column(name = "library_id")
    private Integer libraryId;

    @Column(name = "country_id")
    private Integer countryId;


    public User(Integer id, String name, String lastName, String email, Integer age, Integer libraryId, Integer countryId) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.libraryId = libraryId;
        this.countryId = countryId;
    }

    public User(String name, String lastName, String email, Integer age, Integer libraryId, Integer countryId) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.libraryId = libraryId;
        this.countryId = countryId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", libraryId=" + libraryId +
                ", countryId=" + countryId +
                '}';
    }
}