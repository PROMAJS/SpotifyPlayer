package pl.sda.springproject.entities;


import lombok.Data;
import javax.persistence.*;

@Data
@Entity(name = "albums")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(nullable = false, name = "album_title")
    private String albumTitle;

    @ManyToOne
    @JoinColumn(name = "track_id")
    private Track track;

    @ManyToMany
    @JoinColumn(nullable = false, name = "user_id")
    private User user;





}
