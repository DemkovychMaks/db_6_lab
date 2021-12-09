package iot.demkovych.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class SongDTO {
    private Integer id;
    private String name;
    private Integer amountOfLikes;
    private Integer downloadedAmount;
    private Integer streaming;
    private Integer playlistId;
    private Integer artistId;
}
