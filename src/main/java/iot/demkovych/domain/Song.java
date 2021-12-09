package iot.demkovych.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor

@Table(name = "song")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "amount_of_likes")
    private Integer amountOfLikes;

    @Column(name = "downloaded_amount")
    private Integer downloadedAmount;

    @Column(name = "streaming")
    private Integer streaming;

    @Column(name = "playlist_id")
    private Integer playlistId;

    @Column(name = "artist_id")
    private Integer artistId;


    public Song(int id, String name, Integer amountOfLikes, Integer downloadedAmount, Integer streaming, Integer playlistId, Integer artistId) {
        this.id = id;
        this.name = name;
        this.amountOfLikes = amountOfLikes;
        this.downloadedAmount = downloadedAmount;
        this.streaming = streaming;
        this.playlistId = playlistId;
        this.artistId = artistId;
    }

    public Song(String name, Integer amountOfLikes, Integer downloadedAmount, Integer streaming, Integer playlistId, Integer artistId) {
        this.name = name;
        this.amountOfLikes = amountOfLikes;
        this.downloadedAmount = downloadedAmount;
        this.streaming = streaming;
        this.playlistId = playlistId;
        this.artistId = artistId;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amountOfLikes=" + amountOfLikes +
                ", downloadedAmount=" + downloadedAmount +
                ", streaming=" + streaming +
                ", playlistId=" + playlistId +
                ", artistId=" + artistId +
                '}';
    }
}