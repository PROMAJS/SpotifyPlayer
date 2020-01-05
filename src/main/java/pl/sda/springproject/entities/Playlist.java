package pl.sda.springproject.entities;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Id;

    @Column(nullable = false, name = "playlist_title")
    private String playlistTitle;

    @OneToMany
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany
    @JoinColumn(name = "track_id")
    private Track track;
}
