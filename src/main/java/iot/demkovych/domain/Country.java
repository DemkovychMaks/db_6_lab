package iot.demkovych.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor

@Table(name = "country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "population")
    private Integer population;

    public Country(Integer id, String name, Integer population) {
        this.id = id;
        this.name = name;
        this.population = population;
    }

    public Country(String name, Integer population) {
        this.name = name;
        this.population = population;
    }


    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", population=" + population +
                '}';
    }
}
