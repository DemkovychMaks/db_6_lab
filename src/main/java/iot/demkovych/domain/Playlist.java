package iot.demkovych.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor

@Table(name = "playlist")
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "appointment")
    private String appointment;

    @Column(name = "about")
    private String about;

    @Column(name ="library_id")
    private Integer libraryId;


    public Playlist(int id, String appointment, String about, Integer libraryId) {
        this.id = id;
        this.appointment = appointment;
        this.about = about;
        this.libraryId = libraryId;
    }

    public Playlist(String appointment, String about, Integer libraryId) {
        this.appointment = appointment;
        this.about = about;
        this.libraryId = libraryId;
    }


    @Override
    public String toString() {
        return "Playlist{" +
                "id=" + id +
                ", appointment='" + appointment + '\'' +
                ", about='" + about + '\'' +
                ", libraryId=" + libraryId +
                '}';
    }
}
