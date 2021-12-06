package iot.demkovych.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class LibraryDTO {
    private Integer id;
    private Integer amountOfSongs;
    private Integer amountOfDownloadedSongs;
}
