package iot.demkovych.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor

@Table(name = "artist")
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private Integer age;

    @Column(name = "amount_of_albums")
    private Integer amountOfAlbums;

    public Artist(int id, String name, String lastName, Integer age, Integer amountOfAlbums) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.amountOfAlbums = amountOfAlbums;
    }

    public Artist(String name, String lastName, Integer age, Integer amountOfAlbums) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.amountOfAlbums = amountOfAlbums;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", amountOfAlbums=" + amountOfAlbums +
                '}';
    }
}